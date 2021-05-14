package com.tms.homework8.Banks;

import com.tms.homework8.Users.DeutscheBank.FunctionalityUserDeutscheBank;

import java.sql.Date;

public class BankOfDeutsche implements ConstantBankAttributes {

 private    Date dateOfEndOfLicenseOfDeutscheBank = new Date(163238276000L);
 private    FunctionalityUserDeutscheBank deutscheUser1 = new FunctionalityUserDeutscheBank(765, "Albert", "Anton", 23976989, "Man");
 private   FunctionalityUserDeutscheBank deutscheUser2 = new FunctionalityUserDeutscheBank(456, "Adolf", "Viet", 8907676, "Man");

 private   FunctionalityUserDeutscheBank[] arrayUser = {deutscheUser1, deutscheUser2};



    @Override
    public void arrayUserChek() {
        if (arrayUser.length > 2) {
            System.out.println("Массив пользователей заполнен ");
        }
    }

    @Override
    public void arrayChek() {
        for (int h = 0; h <= arrayUser.length - 2; h++) {
            for (int j = 1; j < arrayUser.length; j++) {


                if (h != j && h < j) {
                    if (arrayUser[h].equals(arrayUser[j])) {
                        System.out.println("Такой пользователь в Deutsche bank уже существует ");
                    }
                }
            }

        }
    }
    }

