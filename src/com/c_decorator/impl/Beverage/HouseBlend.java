package com.c_decorator.impl.Beverage;

import com.c_decorator.Beverage;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 * 综合咖啡
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.09;
    }
}
