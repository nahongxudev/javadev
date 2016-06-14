package com.nahongxudev.javadev.container.deeper;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by nahongxu on 2016/6/14.
 */
public class RandomNumStrGenerator implements Generator<String>  {

    private int numSize;

    public RandomNumStrGenerator(int numSize) {
        this.numSize = numSize;
    }

    public String next() {
        return RandomStringUtils.randomNumeric(numSize);
    }

    public int getNumSize() {
        return numSize;
    }

    public void setNumSize(int numSize) {
        this.numSize = numSize;
    }
}
