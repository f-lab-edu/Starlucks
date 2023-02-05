package com.starlucks.member.presentation;

import com.starlucks.common.ApiResponse;
import com.starlucks.member.presentation.reuqest.MemberLoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MemberLoginController {

    @PostMapping
    public ApiResponse<String> login(@RequestBody MemberLoginRequest request) {
        return ApiResponse.success("ok");
    }
}
