package com.shizhenqiang.design_gupao.design.composite;

import com.shizhenqiang.design_gupao.design.composite.safe.File;
import com.shizhenqiang.design_gupao.design.composite.safe.Folder;

public class Test {

    public static void main(String[] args) {
        System.out.println("============安全组合模式=================");

        File qq = new File("qq.exe");
        File wx = new File("WeChat.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("word.exe");
        File ppt = new File("ppt.exe");
        File excel = new File("excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder wps = new Folder("金山软件", 3);
        wps.add(new File("WPS.exe"));
        office.add(wps);

        Folder root = new Folder("根目录", 1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("------------show方法展示----------------------");
        root.show();
        System.out.println("------------list方法展示----------------------");
        root.list();
    }
}
