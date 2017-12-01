package com.shurik.company.third;

public class MyBank<T extends IAccount> {

    private T[] accounts;

    public MyBank(T[] accounts) {
        this.accounts = accounts;
    }

    public void accountInfo(){

        for (IAccount acc: accounts) {

            System.out.println(acc.getId());

        }

    }
}
