package com.shurik.company.first;

public class TwoMyGen <T, V> {

    private T object1;
    private V object2;

    public TwoMyGen(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void showType(){

        System.out.println("Тип Т = " + object1.getClass().getName());
        System.out.println("Тип V = " + object2.getClass().getName());

    }

    public void showTypeName(){

        System.out.println("Тип Т = " + object1.getClass().getSimpleName());
        System.out.println("Тип V = " + object2.getClass().getSimpleName());

    }

}
