package com.shizhenqiang.design_gupao.design.adapter;

import lombok.Data;

@Data
public class ResultMsg {

    private int code;

    private String msg;

    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultMsg(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
