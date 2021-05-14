package com.tms.homework8.Users.DeutscheBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeutscheBankUser2 extends BankUserAttributes {
    FunctionalityUserDeutscheBank deutscheUser2 = new FunctionalityUserDeutscheBank(456, "Adolf", "Viet", 8907676, "Man");
    //Дата рождения пользователя.
    Calendar dateDeutscheUser2 = new GregorianCalendar(2000, 8, 7, 10, 56);
    Date dateOfBirthDeutscheUser2 = dateDeutscheUser2.getTime();
    //Дата окончания действия счета.
    Calendar datedUser2 = new GregorianCalendar(2026, 11, 9, 10, 56);
    Date accountClosingDatedUser2 = datedUser2.getTime();
    //Открытие счетов.
    private Account openAccount1User2DeutscheBank = new Account("KH876875", 270000);
    private Account openAccount2User2DeutscheBank = new Account("MF876875", 170000);
    private Account[] arrayAccountDeutscheUser2 = {openAccount2User2DeutscheBank, openAccount1User2DeutscheBank};

    //Проверка является ли баланс счета < или = 0 или меньше пороговой.
    public void accountVerification() {
        BankAttributes bankAttributes = new BankAttributes();
        double i = 3650.87;
        bankAttributes.setMinimumAmountToOpenAnAccountOfDeutscheBank(i);
        if (openAccount1User2DeutscheBank.accountAmount > i) {
            System.out.println(deutscheUser2.toString());
        } else {
            deutscheUser2.closeAccount("Аккаунт закрыт", 0);
        }
        if (openAccount2User2DeutscheBank.accountAmount > i) {
            System.out.println(deutscheUser2.toString());
        } else {
            deutscheUser2.closeAccount("Аккаунт закрыт", 0);
        }
    }
    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountDeutscheUser2.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }
    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountDeutscheUser2.length - 2; h++) {
            for (int j = 1; j < arrayAccountDeutscheUser2.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountDeutscheUser2[h].equals(arrayAccountDeutscheUser2[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #1 Deutsche Bank");
                    }
                }
            }
        }
    }
}
