package com.example.feibo.service;

import com.example.feibo.utils.ResultVO;

public interface UsersService {

    public ResultVO login(String email, String password);
}
