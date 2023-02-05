package com.starlucks.member.presentation.reuqest;

import com.starlucks.member.application.command.MemberLoginCommand;

public class MemberLoginRequest {

    private String email;
    private String password;

    public MemberLoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public MemberLoginCommand toCommand() {
        return new MemberLoginCommand(email, password);
    }
}
