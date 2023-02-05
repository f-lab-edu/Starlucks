package com.starlucks.member.application.command;

import com.starlucks.member.domain.entity.MemberAdd;

public class MemberLoginCommand {
    private String email;
    private String password;

    public MemberLoginCommand(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
