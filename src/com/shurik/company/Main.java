package com.shurik.company;

import com.shurik.company.first.MyGen;
import com.shurik.company.first.TwoMyGen;
import com.shurik.company.second.Bank;
import com.shurik.company.third.MyBank;
import com.shurik.company.third.impl.Account;

public class Main {

    public static void main(String[] args) {

       /* MyGen<Integer> iObj = new MyGen<>(77);
        iObj.showType();
        iObj.showTypeName();

        int value   = iObj.getOb();

        System.out.println("Значение = " + value);

        //=====================================

        MyGen<String> strObj    = new MyGen<>("Обобщенный текст");
        strObj.showType();
        strObj.showTypeName();

        String stringValue   = strObj.getOb();

        System.out.println("Значение = " + stringValue);

        //=====================================
        //=====================================

        TwoMyGen<Integer, String> twoMyGen  = new TwoMyGen<>(99, "Другой обобщенный текст");

        twoMyGen.showType();

        int intValue    = twoMyGen.getObject1();
        String strValue = twoMyGen.getObject2();

        System.out.println("Значение object1 = " + intValue);
        System.out.println("Значение object2 = " + strValue);*/

        //=====================================
        //+++++++++++++++++++++++++++++++++++++
        //=====================================

        Bank<Integer> integerBank = new Bank<>(new Integer[] {1,2,3,4,5});
        Bank<String> stringBank = new Bank<>(new String[]{"123442", "fefwee", "fw3f3f3"});

        System.out.println("integerBank = " + integerBank.toString());
        System.out.println("stringBank = " + stringBank.toString());

        //=====================================
        System.out.println("//=====================================");

        Account[] accounts  = new Account[]{new Account(12), new Account(432), new Account(2323), new Account(1)};

        MyBank<Account> accountMyBank   = new MyBank<>(accounts);

        accountMyBank.accountInfo();

    }
}
