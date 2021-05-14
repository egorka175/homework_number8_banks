package com.tms.homework8.Users.ChinaBank;

import com.tms.homework8.Account.Account;
import com.tms.homework8.Banks.BankAttributes;
import com.tms.homework8.Users.BankUserAttributes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ChinaBankUser1 extends BankUserAttributes {
    FunctionalityUserChinaBank chinaUser1 =new FunctionalityUserChinaBank("Anhou", "Yo", "Huan", 23976986, "Man");
    //Дата рождения пользователя.
    Calendar dateChinaUser1 = new GregorianCalendar(1981 ,2 ,7 , 10 ,56  );
    Date dateOfBirthChinaUser1 = dateChinaUser1.getTime();
    //Дата окончания действия счета.
    Calendar dateCUser1 = new GregorianCalendar(2021 ,11 ,9 , 10 ,56  );
    Date accountClosingDateCUser1 = dateCUser1.getTime();
    //Открытие счетов.
    private   Account openAccount1User1ChinaBank=new Account("DA876875", 90000);
    private Account openAccount2User1ChinaBank=new Account("IK876875", 17650);
    private Account[] arrayAccountChinaUser1={openAccount2User1ChinaBank, openAccount1User1ChinaBank };

    //Проверка является ли баланс счета < или = 0 или сумма меньше пороговой.
    public void accountVerification() {
        BankAttributes bankAttributes = new BankAttributes();
        double j = 8000.00;
        bankAttributes.setMinimumAmountToOpenAnAccountOfChinaBank(j);
        if (openAccount1User1ChinaBank.accountAmount > j) {
            System.out.println(chinaUser1.toString());
        } else {
            chinaUser1.closeAccount("Аккаунт закрыт", 0);
        }
        if (openAccount2User1ChinaBank.accountAmount > j) {
            System.out.println(chinaUser1.toString());
        } else {
            chinaUser1.closeAccount("Аккаунт закрыт", 0);
        }
    }
    public void checkingAnArrayOfHectaresOfIdenticalUsers() {
        if (arrayAccountChinaUser1.length > 2) {
            System.out.println("Массив аккаунтов заполнен ");
        }
    }

    public void checkingAnArrayOfAccountForIdentity() {
        for (int h = 0; h <= arrayAccountChinaUser1.length - 2; h++) {
            for (int j = 1; j < arrayAccountChinaUser1.length; j++) {


                if (h != j && h < j) {
                    if (arrayAccountChinaUser1[h].equals(arrayAccountChinaUser1[j])) {
                        System.out.println("Такой счет уже  существует у пользователя #1 China Bank ");
                    }
                }
            }


        }
    }
}
