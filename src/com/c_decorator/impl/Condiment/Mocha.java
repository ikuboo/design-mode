package com.c_decorator.impl.Condiment;

import com.c_decorator.Beverage;
import com.c_decorator.Condiment;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 * 摩卡
 */
public class Mocha extends Condiment {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
