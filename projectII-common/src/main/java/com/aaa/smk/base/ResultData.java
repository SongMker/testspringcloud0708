package com.aaa.smk.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 * Description:
 * \通过接口返回值，也就是说吧后端的返回值统一
 * T:占位符
 */
@Data
@Accessors(chain = true)
public class ResultData<T> implements Serializable {
    //状态码
    private String code;
    //消息
    private String msg;
    //详情
    private String detail;
    //数据
    private T data;
}