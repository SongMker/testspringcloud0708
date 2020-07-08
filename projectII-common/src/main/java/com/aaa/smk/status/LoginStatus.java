package com.aaa.smk.status;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public enum LoginStatus {
    /**
     *
     * @Author: Somker
     * @Description:
     * @Param 登录状态码，登录成功和失败
     * @Return:
     * @Time: 2020/7/8 15:40
     */
    LOGIN_SUCCESS("200", "登录成功"),
    LOGIN_FAILED("400", "登录失败，系统异常"),
    USER_EXIST("201", "用户已存在"),
    USER_NOT_EXIST("401", "用户不存在"),
    PASSWORD_WRONG("402", "密码错误"),
    LOGIN_WRONG("405", "用户退出异常")
    ;

        /**
         *
         * @Author: Somker
         * @Description:
         * @Param [code, msg]
         * @Return:
         * @Time: 2020/7/8 15:39
         */
    LoginStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
