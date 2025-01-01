package com.example.feibo.mapper;

import com.example.feibo.entity.Users;
import org.springframework.stereotype.Component;

@Component
public interface UsersMapper {

    public Users login(String name);

}
