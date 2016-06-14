package com.nahongxudev.javadev.container.deeper;

import java.util.ArrayList;

/**
 * Created by nahongxu on 2016/6/14.
 */
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen,int quantity){
        for(int i=0;i<quantity;i++){
            add(gen.next());
        }
    }

    public static  <T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }

    public static void main(String[] args) {
        CollectionData<String> randNumList=new CollectionData<String>(new RandomNumStrGenerator(4),5);
        System.out.println(randNumList);
        randNumList=CollectionData.list(new RandomNumStrGenerator(5),4);
        System.out.println(randNumList);
    }

}
