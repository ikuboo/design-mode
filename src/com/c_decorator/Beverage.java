package com.c_decorator;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 * 饮料的抽象类
 */
public abstract class Beverage {
    public String description = "Unkonw Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
