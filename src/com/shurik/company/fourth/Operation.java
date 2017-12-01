package com.shurik.company.fourth;

import com.shurik.company.third.IAccount;

public class Operation<A extends IAccount, S> {

    private A account;
    private S sum;

    public Operation(A account, S sum) {
        this.account = account;
        this.sum = sum;
    }

    public void getInfo(){

//        System.out.printf("Клиент : %s вывел %s гривен \n", account.getId(), String.valueOf(sum));
        System.out.printf("Клиент : %s вывел %s гривен \n", account.getId(), sum);
    }

}
