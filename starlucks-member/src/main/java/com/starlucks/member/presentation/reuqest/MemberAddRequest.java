package com.starlucks.member.presentation.reuqest;

import com.starlucks.member.application.command.MemberAddCommand;

public class MemberAddRequest {
    private String nickname;
    private String email;


    private String password;


    private String phoneNumber;


    public MemberAddRequest(String email, String password, String nickname, String phoneNumber) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public MemberAddCommand toCommand() {
        return new MemberAddCommand(email, password, nickname, phoneNumber);
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

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
