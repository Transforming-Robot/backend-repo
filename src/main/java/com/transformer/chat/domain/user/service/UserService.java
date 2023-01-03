package com.transformer.chat.domain.user.service;


public interface UserService {
    //public Long signUp(UserRequestDTO requestDTO) throws Exception;
    public boolean checkEmailDuplicate(String email);
}
