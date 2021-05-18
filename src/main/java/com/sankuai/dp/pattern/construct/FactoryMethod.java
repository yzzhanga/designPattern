package com.sankuai.dp.pattern.construct;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class FactoryMethod {

    abstract Map<String,Object> create();

}


class HashFactory extends FactoryMethod {

    @Override
    Map<String, Object> create() {
        return new HashMap<>();
    }
}

class TreeFactory extends FactoryMethod {

    @Override
    Map<String, Object> create() {
        return new TreeMap<>();
    }
}