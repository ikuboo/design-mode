package com.c_decorator.impl.Beverage;

import com.c_decorator.Beverage;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 * 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
