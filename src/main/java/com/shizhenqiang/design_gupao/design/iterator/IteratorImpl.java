package com.shizhenqiang.design_gupao.design.iterator;

import java.util.List;

public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int course;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置：" + course);
        element= list.get(course);
        course++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if (course > list.size() - 1) {
            return false;
        }
        return true;
    }
}
