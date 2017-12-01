package com.shurik.company.first;

public class MyGen<T> {

    private T ob;

    public MyGen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Тип T: " + ob.getClass().getName());
    }

    public void showTypeName(){
        System.out.println("Тип T: " + ob.getClass().getSimpleName());
    }

}
