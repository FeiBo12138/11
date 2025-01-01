package com.example.feibo.service.impl;
import com.example.feibo.entity.Users;
import com.example.feibo.mapper.UsersMapper;
import com.example.feibo.service.UsersService;
import com.example.feibo.utils.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public ResultVO login(String name, String password) {

        Users users = usersMapper.login(name);
        if (users==null){
            return new ResultVO(1000,"用户不存在",null);
        }else {
            if (users.getPassword().equals(password)){
                return new ResultVO(1001,"登陆成功",users);
            }else {
                return new ResultVO(1002,"密码错误" ,null);
            }
        }

    }
}

