package com.tms.homework8.Banks;

import com.tms.homework8.Runner.Runner;
import com.tms.homework8.Users.ChinaBank.FunctionalityUserChinaBank;

import java.sql.Date;

public class BankOfChina implements  ConstantBankAttributes {
 private    Date dateOfEndOfLicenseOfChinaBank = new Date(1632394456000L);
  private   FunctionalityUserChinaBank chinaUser1 = new FunctionalityUserChinaBank("Anhou", "Yo", "Huan", 23976986, "Man");
  private  FunctionalityUserChinaBank chinaUser2 = new FunctionalityUserChinaBank("Ganicy", "Guy", "Viet", 8977676, "Man");
  private  FunctionalityUserChinaBank chinaUser3 = new FunctionalityUserChinaBank("Ganicy", "Guy", "Viet", 8977676, "Man");
  private  FunctionalityUserChinaBank[] arrayUser = {chinaUser1, chinaUser2,chinaUser3};


    @Override
    public void arrayUserChek() {

        for (int h = 0; h <= arrayUser.length - 2; h++) {
            for (int j = 1; j < arrayUser.length; j++) {


                if (h != j && h < j) {
                    if (arrayUser[h].equals(arrayUser[j])) {
                        System.out.println("Такой пользователь в China bank уже существует ");
                    }
                }
            }

        }
    }

    @Override
    public void arrayChek() {
        if (arrayUser.length > 2) {
            System.out.println("Массив пользователей заполнен ");
        }
    }
}

