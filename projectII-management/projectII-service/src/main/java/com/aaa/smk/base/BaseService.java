package com.aaa.smk.base;

import com.aaa.smk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created with IntelliJ IDEA.
 * User: 月之光芒
 * Date: 2020/7/8
 * Time: 17:55
 * Description:
 * \
 */
public abstract class BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    /**+
     * @Author: Somker
     * @Description:
     * @Param []
     * @Return: tk.mybatis.mapper.common.Mapper
     * @Time: 2020/7/8 17:56
     */
    protected Mapper getMapper() {
        return mapper;
    }

    /**
     * @Author: Somker
     * @Description:
     * @Param [t]
     * @Return: com.aaa.smk.base.ResultData
     * @Time: 2020/7/8 17:58
     */
    public ResultData insertData(T t) {
        int insert = mapper.insert(t);
        if (insert > 0) {
            return new ResultData().setCode("300").setMsg("数据插入成功");
        }
        return null;
    }
}