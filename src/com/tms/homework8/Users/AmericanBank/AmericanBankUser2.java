package com.tms.homework8.Users.AmericanBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class AmericanBankUser2 extends BankUserAttributes {
    FunctionalityUserAmericanBank americanUser2 = new FunctionalityUserAmericanBank(610, "Columbia State", "Hartson", "Bob", 2349876, "Man");
    //Дата рождения пользователя.
    Calendar dateAmericanUser2 = new GregorianCalendar(1997, 12, 9, 10, 56);
    Date dateOfBirthAmericanUser2 = dateAmericanUser2.getTime();
    //Дата окончания действия счета.
    Calendar dateAUser2 = new GregorianCalendar(2023, 11, 9, 10, 56);
    Date accountClosingDateUser2 = dateAUser2.getTime();
    //Открытие счетов.
    private  Account openAccount1User2AmericanBank = new Account("HR876875", 90000);
    private Account openAccount2User2AmericanBank = new Account("KL876875", 17650);
    private Account[] arrayAccountAmericanUser2 = {openAccount2User2AmericanBank, openAccount1User2AmericanBank};

    //Проверка является ли баланс счета < или = 0 или меньше пороговой.
    public void accountVerification() {
        double a = 5780.98;
        BankAttributes bankAttributes = new BankAttributes();
        bankAttributes.setMinimumAmountToOpenAnAccountOfAmericanBank(a);
        if (openAccount1User2AmericanBank.accountAmount > a) {
            System.out.println(americanUser2.toString());
        } else {
            americanUser2.closeAccount("Аккаунт закрыт", 0);
        }
        if (openAccount2User2AmericanBank.accountAmount > a) {
            System.out.println(americanUser2.toString());
        } else {
            americanUser2.closeAccount("Аккаунт закрыт", 0);
        }
    }

    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountAmericanUser2.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }

    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountAmericanUser2.length - 2; h++) {
            for (int j = 1; j < arrayAccountAmericanUser2.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountAmericanUser2[h].equals(arrayAccountAmericanUser2[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #2 American Bank  ");
                    }
                }
            }


        }


    }
}
