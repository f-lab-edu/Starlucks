package com.starlucks.member.domain.entity;

public class MemberAdd {

    private Long id;
    private String nickname;
    private String email;
    private String password;
    private String phoneNumber;

    public MemberAdd(String nickname, String email, String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
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
