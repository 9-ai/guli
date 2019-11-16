package com.guli.common.vo;

import com.guli.common.constants.ResponseResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@ApiModel(value = "全局统一返回结果")
public class ReturnResult {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    private ReturnResult() {
    }

    public static ReturnResult ok() {
        ReturnResult returnResult = new ReturnResult();
        returnResult.setSuccess(ResponseResult.SUCCESS.getSuccess());
        returnResult.setCode(ResponseResult.SUCCESS.getCode());
        returnResult.setMessage(ResponseResult.SUCCESS.getMessage());
        return returnResult;
    }
    public static ReturnResult error() {
        ReturnResult returnResult = new ReturnResult();
        returnResult.setSuccess(ResponseResult.UNKNOWN_REASON.getSuccess());
        returnResult.setCode(ResponseResult.UNKNOWN_REASON.getCode());
        returnResult.setMessage(ResponseResult.UNKNOWN_REASON.getMessage());
        return returnResult;
    }
    public static ReturnResult setResult(ResponseResult responseResult) {
        ReturnResult returnResult = new ReturnResult();
        returnResult.setSuccess(responseResult.getSuccess());
        returnResult.setCode(responseResult.getCode());
        returnResult.setMessage(responseResult.getMessage());
        return returnResult;

    }

    public ReturnResult success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public ReturnResult message(String message) {
        this.setMessage(message);
        return this;
    }

    public ReturnResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ReturnResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public ReturnResult data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}