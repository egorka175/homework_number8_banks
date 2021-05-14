package com.tms.homework8.Users.AmericanBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class AmericanBankUser1 extends BankUserAttributes {
    FunctionalityUserAmericanBank americanUser1 = new FunctionalityUserAmericanBank(610, "Columbia State", "Hartson", "Bob", 2349876, "Man");

    //Дата рождения пользователя.
    Calendar dateAmericanUser1 = new GregorianCalendar(1987, 11, 9, 10, 56);
    Date dateOfBirthAmericanUser1 = dateAmericanUser1.getTime();

    //Дата окончания действия счета.
    Calendar dateAUser1 = new GregorianCalendar(1987, 11, 9, 10, 56);
    Date accountClosingDateUser1 = dateAUser1.getTime();

    //Открытие счетов.
private     Account openAccount1User1AmericanBank = new Account("DA876875", 0);
private     Account openAccount2User1AmericanBank = new Account("IK876875", 100);
private     Account openAccount3User1AmericanBank = new Account("IK876875", 100);
private     Account[] arrayAccountAmericanUser1 = {openAccount2User1AmericanBank, openAccount1User1AmericanBank, openAccount3User1AmericanBank};

    //Проверка счетов пользователя , больше ли он пороговой суммы.
    public void accountVerification() {
        double a = 5780.98;
        BankAttributes bankAttributes = new BankAttributes();
        bankAttributes.setMinimumAmountToOpenAnAccountOfAmericanBank(a);
        if (openAccount1User1AmericanBank.accountAmount > a) {
            System.out.println(americanUser1.toString());
        } else {
            americanUser1.closeAccount("Аккаунт закрыт", 0 );
        }
        if (openAccount2User1AmericanBank.accountAmount > a) {
            System.out.println(americanUser1.toString());
        } else {
            americanUser1.closeAccount("Аккаунт закрыт", 0);
        }
    }

    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountAmericanUser1.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }

    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountAmericanUser1.length - 2; h++) {
            for (int j = 1; j < arrayAccountAmericanUser1.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountAmericanUser1[h].equals(arrayAccountAmericanUser1[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #1 American Bank ");
                    }
                }
            }


        }

    }
}



