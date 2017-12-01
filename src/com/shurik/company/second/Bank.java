package com.shurik.company.second;

import java.util.Arrays;

public class Bank<T> {

    private T[] clients;

    public Bank() {}

    public Bank(T[] clients){
        this.clients    = clients;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }
}
