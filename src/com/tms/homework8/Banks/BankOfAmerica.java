package com.tms.homework8.Banks;

import com.tms.homework8.Users.AmericanBank.FunctionalityUserAmericanBank;

import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

public class BankOfAmerica implements ConstantBankAttributes{


   public Date dateOfEndOfLicenseOfAmericanBank = new Date(1632394276000L);
   private FunctionalityUserAmericanBank americanUser1 = new FunctionalityUserAmericanBank(605, "Amberlin State", "Ivanov", "Egor", 2345676, "Man");
   private FunctionalityUserAmericanBank americanUser2 = new FunctionalityUserAmericanBank(610, "Columbia State", "Hartson", "Bob", 2349876, "Man");

    private FunctionalityUserAmericanBank[] arrayUser = {americanUser1, americanUser2};

    @Override
    public void arrayChek() {
        if (arrayUser.length > 2) {
            System.out.println("Массив пользователей заполнен ");
        }
    }

    @Override
    public void arrayUserChek() {


        for (int h = 0; h <= arrayUser.length - 2; h++) {
            for (int j = 1; j < arrayUser.length; j++) {


                if(h!=j && h<j) {
                    if (arrayUser[h].equals(arrayUser[j])) {
                        System.out.println("Такой пользователь в American Bank уже существует ");
                    }
                }
            }

        }

    }
    }














