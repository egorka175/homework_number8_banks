package com.tms.homework8.Users.DeutscheBank;

import com.tms.homework8.Account.AccountFunctionality;
import com.tms.homework8.Users.AmericanBank.FunctionalityUserAmericanBank;
import com.tms.homework8.Users.BankUserAttributes;

public class FunctionalityUserDeutscheBank extends BankUserAttributes implements AccountFunctionality {
    public FunctionalityUserDeutscheBank(int federalStateCode, String lastName, String name, int passportID, String floor) {
        this.federalStateCode = federalStateCode;
        this.lastName = lastName;
        this.name = name;
        this.passportID = passportID;
        this.floor = floor;
    }


    @Override
    public String toString() {
        return "Пользователь открыл счет в Deutsche Bank";
    }

    @Override
    public boolean equals(Object obj) {
        FunctionalityUserDeutscheBank other = (FunctionalityUserDeutscheBank) obj;
        return passportID == other.passportID && name.equals(other.name) && lastName.equals(other.lastName);
    }

}


