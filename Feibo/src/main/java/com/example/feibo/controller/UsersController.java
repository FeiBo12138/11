package com.example.feibo.controller;

import com.example.feibo.service.UsersService;
import com.example.feibo.utils.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody// 前后端分开，异步请求
public class UsersController {

    @Resource
    private UsersService usersService;

    @RequestMapping("/login")

    public ResultVO login(String name, String password){

       return usersService.login(name, password);

    }
}
