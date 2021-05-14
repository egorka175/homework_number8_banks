package com.tms.homework8.Users.ChinaBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ChinaBankUser2 extends BankUserAttributes {
    FunctionalityUserChinaBank chinaUser2 = new FunctionalityUserChinaBank("Ganicy", "Guy", "Viet", 8977676, "Man");
    //Дата рождения пользователя.
    Calendar dateChinaUser2 = new GregorianCalendar(2000, 10, 7, 10, 56);
    Date dateOfBirthChinaUser2 = dateChinaUser2.getTime();
    //Дата окончания действия счета.
    Calendar dateCUser2 = new GregorianCalendar(2028, 11, 9, 10, 56);
    Date accountClosingDateCUser2 = dateCUser2.getTime();
    //Открытие счетов.
    private Account openAccount1User2ChinaBank = new Account("DA876875", 90000);
    private Account openAccount2User2ChinaBank = new Account("IK876875", 17650);
    private Account[] arrayAccountChinaUser2 = {openAccount2User2ChinaBank, openAccount1User2ChinaBank};

    //Проверка является ли баланс счета < или = 0 или меньше пороговой суммы.
    public void accountVerification() {
        BankAttributes bankAttributes = new BankAttributes();
        double j = 8000.00;
        bankAttributes.setMinimumAmountToOpenAnAccountOfChinaBank(j);
        if (openAccount1User2ChinaBank.accountAmount > j) {
            System.out.println(chinaUser2.toString());
        } else {
            chinaUser2.closeAccount("Аккаунт закрыт", 0);
        }
        if (openAccount2User2ChinaBank.accountAmount > j) {
            System.out.println(chinaUser2.toString());
        } else {
            chinaUser2.closeAccount("Аккаунт закрыт", 0);
        }
    }

    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountChinaUser2.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }

    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountChinaUser2.length - 2; h++) {
            for (int j = 1; j < arrayAccountChinaUser2.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountChinaUser2[h].equals(arrayAccountChinaUser2[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #2 China Bank");
                    }
                }
            }


        }
    }
}
