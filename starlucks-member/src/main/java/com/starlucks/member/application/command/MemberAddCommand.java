package com.starlucks.member.application.command;

import com.starlucks.member.domain.entity.MemberAdd;

public class MemberAddCommand {
    private Long id;
    private String nickname;
    private String email;
    private String password;


    public MemberAddCommand(
        Long id,
        String nickname,
        String email,
        String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }


    public MemberAdd from(Long id, String password) {
        return new MemberAdd(
            this.id,
            this.nickname,
            password,
            this.email
        );
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
