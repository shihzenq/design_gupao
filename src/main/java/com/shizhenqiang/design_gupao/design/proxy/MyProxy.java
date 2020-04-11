package com.shizhenqiang.design_gupao.design.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxy {
    private static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader loader, Class<?>[] interfaces, MyInvocationHandler h)
            throws IllegalArgumentException, IOException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 1.动态生成.java文件
        String src = generateSrc(interfaces);

        // 2.将java文件输出到磁盘
        String filePath = MyProxy.class.getResource("").getPath();
        File file = new File(filePath + "$proxy0.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();

        // 3.编译java文件为class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manage.getJavaFileObjects(file);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
        task.call();
        manage.close();

        // 4.加载class文件到jvm
        Class proxyClass = loader.findClass("$proxy0");
        Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
//        file.delete();

        // 5.返回代理对象
        return c.newInstance(h);
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append(MyProxy.class.getPackage() + ";").append(ln);
        sb.append("import ").append(interfaces[0].getName()).append(";").append(ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $proxy0 implements " + interfaces[0].getName() + " {").append(ln);
        sb.append("MyInvocationHandler h;").append(ln);
        sb.append("public $proxy0(MyInvocationHandler h){ ").append(ln);
        sb.append("this.h = h;").append(ln);
        sb.append("}").append(ln);
        // 开始写方法
        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();

            StringBuffer paramTypeName = new StringBuffer();
            StringBuffer paramTypeValue = new StringBuffer();
            StringBuffer paramTypeClass = new StringBuffer();

            // 组装参数
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> parameterType = parameterTypes[i];
                String type = parameterType.getName();
                String paramName = toLowerFirstCase(parameterType.getSimpleName());
                paramTypeName.append(type + " " + paramName);
                paramTypeValue.append(paramName);
                paramTypeClass.append(parameterType.getName() + ".class");
                if (i < parameterTypes.length - 1) {
                    paramTypeName.append(",");
                    paramTypeValue.append(",");
                    paramTypeClass.append(",");
                }
            }

            sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(" + paramTypeName + "){").append(ln);
            sb.append("try{").append(ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + method.getName() + "\", new Class[]{" + paramTypeClass.toString() + "});").append(ln);
            if (method.getReturnType() != void.class) {
                sb.append("return ");
                sb.append("(" + method.getReturnType().getName() + ")");
                sb.append("(this.h.invoke(this,m,new Object[]{" + paramTypeValue + "}));").append(ln);
            } else {
                sb.append("this.h.invoke(this,m,new Object[]{" + paramTypeValue + "});").append(ln);
            }
            sb.append("}catch(Error _ex) { }").append(ln);
            sb.append("catch(Throwable e){" + ln);
            sb.append("throw new UndeclaredThrowableException(e);" + ln);
            sb.append("}").append(ln);
            if (method.getReturnType() != void.class) {
                sb.append("return null;");
            }
            sb.append("}").append(ln);
        }

        sb.append("}").append(ln);
        System.out.println(sb.toString());
        return sb.toString();
    }

    private static String toLowerFirstCase(String src) {
        char[] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        generateSrc(new Class[]{ICondition.class});

    }
}
