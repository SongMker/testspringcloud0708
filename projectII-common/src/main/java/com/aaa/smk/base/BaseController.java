package com.aaa.smk.base;


import static com.aaa.smk.status.LoginStatus.*;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 15:42
 * Description:
 * LOGIN_SUCCESS("200", "登录成功"),
 * LOGIN_FAILED("400", "登录失败，系统异常"),
 * USER_EXIST("201", "用户已存在"),
 * USER_NOT_EXIST("401", "用户不存在"),
 * PASSWORD_WRONG("402", "密码错误"),
 * LOGIN_WRONG("405", "用户退出异常")
 */
public class BaseController {

    /**
     * @Author: Somker
     * @Description:登录成功，返回系统消息
     * @Param []
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 15:45
     */
    protected ResultData loginSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:登录成功，返回自定义消息
     * @Param [msg]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 15:52
     */
    protected ResultData loginSuccess(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }


    /**
     * @Author: Somker
     * @Description:登陆成功，返回系统消息和数据信息
     * @Param [data]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 15:55
     */
    protected ResultData loginSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description: 登录成功，显示自定义消息和数据信息
     * @Param [msg, data]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 15:57
     */
    protected ResultData loginSuccess(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:登录失败，返回系统消息和系统提示，详细解释说明
     * @Param [detail]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 16:03
     */
    protected ResultData loginFailed(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:用户已登录，详细解释说明
     * @Param [detail]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 16:30
     */
    protected ResultData userExist(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(USER_EXIST.getCode());
        resultData.setMsg(USER_EXIST.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:用户未登录，显示详细消息
     * @Param [detail]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 16:31
     */
    protected ResultData userNotExist(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(USER_NOT_EXIST.getCode());
        resultData.setMsg(USER_NOT_EXIST.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:密码错误，显示详细消息
     * @Param [detail]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 16:33
     */
    protected ResultData passwordWrong(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(PASSWORD_WRONG.getCode());
        resultData.setMsg(PASSWORD_WRONG.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     * @Author: Somker
     * @Description:退出异常，显示详细信息
     * @Param [detail]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 16:39
     */
    protected ResultData loginWrong(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_WRONG.getCode());
        resultData.setMsg(LOGIN_WRONG.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

}