package com.starlucks.member.presentation;

import com.starlucks.common.ApiResponse;
import com.starlucks.member.application.fasade.MemberAddManager;
import com.starlucks.member.presentation.reuqest.MemberAddRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public final class MemberAddController {

    private final MemberAddManager memberAddManager;

    public MemberAddController(MemberAddManager memberAddManager) {
        this.memberAddManager = memberAddManager;
    }

    @PostMapping(value = "/signUp", name = "회원 가입")
    public ApiResponse<Long> signUp(@RequestBody MemberAddRequest request) {
        memberAddManager.memberCreate(request.toCommand());
        return ApiResponse.success(null);
    }
}
