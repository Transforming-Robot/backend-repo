package com.transformer.chat.global.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {
    POST_USER_SUCCESS("U000", "이메일 중복검사 성공");

    private final String code;
    private final String message;
}
