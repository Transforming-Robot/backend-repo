package com.transformer.chat.domain.user.controller;

import com.transformer.chat.domain.user.service.UserService;
import com.transformer.chat.global.exception.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{email}/check")
    public ResponseEntity<?> checkEmailDuplicate(@PathVariable String email) throws BadRequestException {
        if (userService.checkEmailDuplicate(email)) {
            throw new BadRequestException("이미 사용중인 이메일입니다.");
        } else {
            return ResponseEntity.ok("사용 가능한 이메일입니다.");
        }
    }
}
