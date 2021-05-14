package com.tms.homework8.Users.DeutscheBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeutscheBankUser1 extends BankUserAttributes {
    FunctionalityUserDeutscheBank deutscheUser1 = new FunctionalityUserDeutscheBank(765, "Albert", "Anton", 23976989, "Man");
    //Дата рождения пользователя.
    Calendar dateDeutscheUser1 = new GregorianCalendar(1981, 2, 7, 10, 56);
    Date dateOfBirthDeutscheUser1 = dateDeutscheUser1.getTime();
    //Дата окончания действия счета.
    Calendar datedUser1 = new GregorianCalendar(2026, 11, 9, 10, 56);
    Date accountClosingDatedUser1 = datedUser1.getTime();
    //Открытие счетов.
    private Account openAccount1User1DeutscheBank = new Account("DA876875", 500000);
    private Account openAccount2User1DeutscheBank = new Account("IK876875", 170000);
    private Account[] arrayAccountDeutscheUser1 = {openAccount2User1DeutscheBank, openAccount1User1DeutscheBank};

    public void accountVerification() {
        BankAttributes bankAttributes = new BankAttributes();
        double i = 3650.87;
        bankAttributes.setMinimumAmountToOpenAnAccountOfDeutscheBank(i);
        //Проверка является ли баланс счета < или = 0.
        if (openAccount1User1DeutscheBank.accountAmount > i) {
            System.out.println(deutscheUser1.toString());
        } else {
            deutscheUser1.closeAccount("Аккаунт закрыт", 0);
        }
        if (openAccount2User1DeutscheBank.accountAmount > i) {
            System.out.println(deutscheUser1.toString());
        } else {
            deutscheUser1.closeAccount("Аккаунт закрыт", 0);

        }
    }

    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountDeutscheUser1.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }



    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountDeutscheUser1.length - 2; h++) {
            for (int j = 1; j < arrayAccountDeutscheUser1.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountDeutscheUser1[h].equals(arrayAccountDeutscheUser1[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #1 Deutsche Bank");
                    }
                }
            }
        }
    }
}
