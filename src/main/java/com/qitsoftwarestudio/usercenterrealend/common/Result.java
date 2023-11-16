package com.qitsoftwarestudio.usercenterrealend.common;

import lombok.Data;

@Data
public class Result {

    private int code;//编码 100  |  200
    private String msg;//  成功  |  失败
    private Long total;//总记录数
    private Object data;//数据

    public static Result fail(){
        return result(200,"失败",0L,null);
    }
    public static Result ture(){
        return result(100 ,"成功",0L, null);
    }

    public static Result ture(Object data){
        return result(100 ,"成功",0L,data);
    }

    public static Result ture(Object data,Long total){
        return result(100 ,"成功",total,data);
    }

    private static Result result(int code , String msg , Long total , Object data){
        Result re = new Result();
        re.setCode(code);
        re.setMsg(msg);
        re.setTotal(total);
        re.setData(data);
        return re;
    }
}
