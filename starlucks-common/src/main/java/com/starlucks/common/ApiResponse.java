package com.starlucks.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ApiResponse<T> {
    private final T body;

    private ApiResponse(T body) {
        this.body = body;
    }

    public static <T> ApiResponse<T> success(T body) {
        return new ApiResponse<>(body);
    }

    public T getBody() {
        return body;
    }
}
