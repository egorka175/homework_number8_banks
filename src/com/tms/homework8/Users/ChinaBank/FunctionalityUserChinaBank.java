package com.tms.homework8.Users.ChinaBank;

import com.tms.homework8.Account.AccountFunctionality;
import com.tms.homework8.Users.AmericanBank.FunctionalityUserAmericanBank;
import com.tms.homework8.Users.BankUserAttributes;

public class FunctionalityUserChinaBank extends BankUserAttributes implements AccountFunctionality {
    private String numberAccount;
    double accountAmount;

    public FunctionalityUserChinaBank(String nameProvince, String lastName, String name, int passportID, String floor) {
        this.nameProvince = nameProvince;
        this.lastName = lastName;
        this.name = name;
        this.passportID = passportID;
        this.floor = floor;
    }



    @Override
    public String toString() {
        return "Пользователь открыл счет в China Bank";
    }


    @Override
    public boolean equals(Object obj) {
        FunctionalityUserChinaBank other = (FunctionalityUserChinaBank) obj;
        return passportID == other.passportID && name.equals(other.name) && lastName.equals(other.lastName);
    }

}