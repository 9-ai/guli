package com.guli.common.handler;


import com.guli.common.vo.ReturnResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AllExceptionHandler {


    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ReturnResult runtimeException(RuntimeException r){
        r.printStackTrace();
        return ReturnResult.error();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ReturnResult exception(Exception e){
        e.printStackTrace();
        return ReturnResult.error();
    }

}
