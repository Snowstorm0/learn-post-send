package com.spring.boot.common;

/**
 * 响应结果
 *
 * @author 代码的路
 * @date 2022/6/8
 */

public class ResponseResult {

    private int number;
    private String name;

    public ResponseResult(){
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ResponseResult [number=" + number + ",name=" + name + "]";
    }
}
