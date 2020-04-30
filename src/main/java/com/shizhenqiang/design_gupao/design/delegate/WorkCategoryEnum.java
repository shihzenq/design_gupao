package com.shizhenqiang.design_gupao.design.delegate;

public enum WorkCategoryEnum {
    COLLECT_DATA("数据采集"),

    NORM_MANAGE("指标管理"),

    RISK_MANAGE("风险管理");

    WorkCategoryEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
