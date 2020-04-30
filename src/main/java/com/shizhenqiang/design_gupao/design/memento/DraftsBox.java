package com.shizhenqiang.design_gupao.design.memento;

import java.util.Stack;

/**
 * 备忘录管理角色
 */
public class DraftsBox {

    private final Stack<ArticleMemento> articleMementos = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento pop = articleMementos.pop();
        return pop;
    }

    public void addMemento(ArticleMemento articleMemento) {
        articleMementos.push(articleMemento);
    }
}
