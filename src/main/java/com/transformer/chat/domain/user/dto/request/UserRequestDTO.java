package com.transformer.chat.domain.user.dto.request;

import com.transformer.chat.domain.user.entity.Users;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Getter
@ToString
public class UserRequestDTO {
    private String email;
    private String nickName;
    private String password;
    private String passwordCheck;

    @Builder
    public Users toEntity(){
        return Users.builder()
                .email(email)
                .nickName(nickName)
                .password(password)
                .build();
    }
}
