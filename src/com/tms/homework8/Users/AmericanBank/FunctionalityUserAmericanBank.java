package com.tms.homework8.Users.AmericanBank;

import com.tms.homework8.Account.AccountFunctionality;
import com.tms.homework8.Banks.BankOfAmerica;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Objects;

public  class FunctionalityUserAmericanBank extends BankUserAttributes implements AccountFunctionality {

    public FunctionalityUserAmericanBank(int numberState, String nameState, String lastName, String name, int passportID, String
        floor){
            this.numberState = numberState;
            this.nameState = nameState;
            this.lastName = lastName;
            this.name = name;
            this.passportID = passportID;
            this.floor = floor;
        }


    @Override
    public boolean equals(Object obj) {
        FunctionalityUserAmericanBank other = (FunctionalityUserAmericanBank)obj;
        return passportID == other.passportID && name.equals(other.name) && lastName.equals(other.lastName);
    }


    @Override
    public String toString() {
        return "Пользователь открыл счет в American Bank";
    }



}




