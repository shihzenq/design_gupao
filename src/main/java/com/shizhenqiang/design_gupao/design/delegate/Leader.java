package com.shizhenqiang.design_gupao.design.delegate;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Leader implements WorkTask {


    /*private final static Map<String, WorkTask> clazzMap = new HashMap<>(3);

    static {
        clazzMap.put(WorkCategoryEnum.COLLECT_DATA.getName(), new EmployeeOne());
        clazzMap.put(WorkCategoryEnum.NORM_MANAGE.getName(), new EmployeeTwo());
        clazzMap.put(WorkCategoryEnum.RISK_MANAGE.getName(), new EmployeeThree());
    }*/

    private  Map<String, WorkTask> clazzMap = new HashMap<>(3);
    public Leader() {
        clazzMap.put(WorkCategoryEnum.COLLECT_DATA.getName(), new EmployeeOne());
        clazzMap.put(WorkCategoryEnum.NORM_MANAGE.getName(), new EmployeeTwo());
        clazzMap.put(WorkCategoryEnum.RISK_MANAGE.getName(), new EmployeeThree());
    }

    @Override
    public void delegateWork(String name) {
        System.out.println(WorkCategoryEnum.COLLECT_DATA.getName());
        if (StringUtils.isEmpty(name)) {
            return;
        }
        WorkTask workTask = clazzMap.get(name);
        workTask.delegateWork(name);
    }
}
