package com.tms.homework8.Account;

import com.tms.homework8.Users.AmericanBank.FunctionalityUserAmericanBank;

public class Account {
    public String numberAccount;
    public double accountAmount;
    public  Account(String numberAccount,double accountAmount) {
        this.numberAccount = numberAccount;
        this.accountAmount = accountAmount;
    }
    @Override
    public boolean equals(Object obj) {
        Account other = (Account) obj;
        return  numberAccount.equals(other.numberAccount);
    }

}
