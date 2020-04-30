package com.shizhenqiang.design_gupao.design.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 备忘录角色
 */
@Getter
@Setter
public class ArticleMemento {

    private String title;

    private String content;

    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
