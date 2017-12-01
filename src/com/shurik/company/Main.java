package com.shurik.company;

import com.shurik.company.first.MyGen;
import com.shurik.company.first.TwoMyGen;
import com.shurik.company.fourth.Operation;
import com.shurik.company.second.Bank;
import com.shurik.company.seventh.impl.MyNewOperation2;
import com.shurik.company.sixth.MyOperation;
import com.shurik.company.third.IAccount;
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

        /*Bank<Integer> integerBank = new Bank<>(new Integer[] {1,2,3,4,5});
        Bank<String> stringBank = new Bank<>(new String[]{"123442", "fefwee", "fw3f3f3"});

        System.out.println("integerBank = " + integerBank.toString());
        System.out.println("stringBank = " + stringBank.toString());

        //=====================================
        System.out.println("//=====================================");

        Account[] accounts  = new Account[]{new Account(12), new Account(432), new Account(2323), new Account(1)};

        MyBank<Account> accountMyBank   = new MyBank<>(accounts);

        accountMyBank.accountInfo();*/

/*

        //=====================================
        //+++++++++++++++++++++++++++++++++++++
        //=====================================

        Account account2    = new Account(21);
        Operation<Account, Integer> operation   = new Operation<>(account2, 100);
        operation.getInfo();

        //=====================================
        //=====================================

        Account account3    = new Account(33);
        Operation<Account, Integer> operation3  = new Operation<>(account3, 130);
        setOperation(operation3);

        Account account4    = new Account(44);
        display(account4);
*/


        //=====================================
        //+++++++++++++++++++++++++++++++++++++
        //=====================================

        MyOperation myOperation  = new MyOperation(12.6, 34.6 );
        System.out.println(myOperation.getSum());

        //=====================================
        //+++++++++++++++++++++++++++++++++++++
        //=====================================

        MyNewOperation2 myNewOperation2 = new MyNewOperation2(new Account(44));

        IAccount account5   = myNewOperation2.getAccount();

        System.out.println(account5.getId());

    }

    private static void setOperation(Operation<? extends IAccount, ?> op){

        op.getInfo();

    }

    private static <T extends IAccount> void display(T acc){

        System.out.println(acc.getId());
    }

}
