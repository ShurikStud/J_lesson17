package com.shurik.company.third.impl;

import com.shurik.company.third.IAccount;

public class Account implements IAccount {

    private int id;

    public Account(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
