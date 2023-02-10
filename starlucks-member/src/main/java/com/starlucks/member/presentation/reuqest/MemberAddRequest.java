package com.starlucks.member.presentation.reuqest;

import com.starlucks.member.application.command.MemberAddCommand;

public class MemberAddRequest {
    private Long id;
    private String nickname;
    private String email;
    private String password;

    public MemberAddRequest(Long id, String email, String password, String nickname) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public MemberAddCommand toCommand() {
        return new MemberAddCommand(id, email, password, nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
