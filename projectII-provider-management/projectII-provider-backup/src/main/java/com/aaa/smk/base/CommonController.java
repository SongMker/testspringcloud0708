package com.aaa.smk.base;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 18:11
 * Description:
 * \
 */
public abstract class CommonController<T> extends BaseController {
    public abstract BaseService<T> getBaseService();

    public ResultData add(Map map) {
        return new ResultData();
    }
}