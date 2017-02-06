package com.c_decorator.impl.Condiment;

import com.c_decorator.Beverage;
import com.c_decorator.Condiment;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 * 牛奶
 */
public class Milk extends Condiment {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
