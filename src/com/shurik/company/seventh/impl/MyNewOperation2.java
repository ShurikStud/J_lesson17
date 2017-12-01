package com.shurik.company.seventh.impl;

import com.shurik.company.seventh.Accountable;
import com.shurik.company.third.IAccount;
import com.shurik.company.third.impl.Account;

public class MyNewOperation2 implements Accountable<IAccount>{

    private IAccount account;

    public MyNewOperation2(IAccount account) {
        this.account = account;
    }

    @Override
    public IAccount getAccount() {
        return account;
    }
}
