package com.aaa.smk.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 17:53
 * Description:
 * \
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}