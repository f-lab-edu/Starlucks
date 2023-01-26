package com.starlucks.member.domain.entity;

public class Member {

    private Long id;
    private String nickname;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    public Member(Long id, String nickname,String email,String password, String phoneNumber, String address) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }
}
