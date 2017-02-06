package com.c_decorator;

import com.c_decorator.impl.Beverage.Espresso;
import com.c_decorator.impl.Beverage.HouseBlend;
import com.c_decorator.impl.Condiment.Milk;
import com.c_decorator.impl.Condiment.Mocha;

/**
 * Created by ikuboo on 2017/2/6.
 * Email:ikuboo@126.com
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        System.out.println(beverage1.getDescription() + ";$:" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription() + ";$:" + beverage2.cost());

    }
}
