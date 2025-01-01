package com.example.feibo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//返回到前端页面的工具类
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResultVO {

    private int code;

    private String msg;//消息提示

    private Object data;
    public ResultVO(int code, String msg, Object data) {}
}
