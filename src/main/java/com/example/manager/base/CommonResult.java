package com.example.manager.base;

import com.alibaba.fastjson.JSONObject;
import com.example.manager.enums.CodeEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * 通用接口返回结果
 * @author PC
 */
public class CommonResult implements Serializable {

    private static final long serialVersionUID = 6290144709594034572L;

    private boolean success = Boolean.TRUE;

    private String msg;

    private Integer code = CodeEnum.SUCCESS.getCode();

    private HashMap<String,Object> data;

    public CommonResult() {
    }

    public CommonResult(boolean success, String msg,Integer code, HashMap<String,Object> data) {
        this.success = success;
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static CommonResult success() {
        CommonResult commonResult = new CommonResult();
        commonResult.setMsg("success");
        return commonResult;
    }

    public static CommonResult fail() {
        CommonResult commonResult = new CommonResult();
        commonResult.setSuccess(false);
        commonResult.setMsg("fail");
        commonResult.setCode(CodeEnum.FAILED.getCode());
        return commonResult;
    }

    public CommonResult msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public CommonResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    public static CommonResult failed(MessageCodeEnum messageCodeEnum) {
        CommonResult commonResult = new CommonResult();
        commonResult.setSuccess(false);
        commonResult.setMsg(messageCodeEnum.getMessage());
        return commonResult;
    }

    public CommonResult addResult(String key, Object result) {
        if (this.data == null) {
            this.data = new HashMap<>(16);
        }
        this.data.put(key, result);
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public CommonResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CommonResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map getData() {
        return data;
    }

    public CommonResult setData(HashMap<String,Object> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
