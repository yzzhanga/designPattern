package com.sankuai.dp.pattern.construct;


/*
* 抽象工厂是对工厂模式的抽象化
* 当工程和实例的实现方案都不可确认
*
* */
public abstract class AbstractFactory<T> {

    abstract void init();

    abstract T create();

}


class SimpleAFactory extends AbstractFactory<String>{

    @Override
    void init() {

    }

    @Override
    String create() {
        return "A";
    }
}


class SimpleBFactory extends AbstractFactory<Integer>{

    @Override
    void init() {

    }

    @Override
    Integer create() {

        return 1;
    }
}