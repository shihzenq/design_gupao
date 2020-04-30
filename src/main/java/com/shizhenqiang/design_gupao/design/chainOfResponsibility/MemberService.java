package com.shizhenqiang.design_gupao.design.chainOfResponsibility;

public class MemberService {

    public void login(String username, String password) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new Member(username, password));
    }

}
