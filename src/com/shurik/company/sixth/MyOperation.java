package com.shurik.company.sixth;

public class MyOperation {

    private double x1;
    private double x2;

    public <T extends Number> MyOperation(T d1, T d2){

        this.x1 = d1.doubleValue();
        this.x2 = d2.doubleValue();
    }

    public double getSum(){
        return x1 + x2;
    }

}
