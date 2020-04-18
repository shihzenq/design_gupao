package com.shizhenqiang.design_gupao.design.composite.safe;

public class File extends Directory  {

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
