package com.tms.homework8.Runner;

import com.tms.homework8.Banks.BankOfAmerica;
import com.tms.homework8.Banks.BankOfChina;
import com.tms.homework8.Banks.BankOfDeutsche;
import com.tms.homework8.Users.AmericanBank.AmericanBankUser1;
import com.tms.homework8.Users.AmericanBank.AmericanBankUser2;

import com.tms.homework8.Users.AmericanBank.FunctionalityUserAmericanBank;
import com.tms.homework8.Users.BankUserAttributes;
import com.tms.homework8.Users.ChinaBank.ChinaBankUser1;
import com.tms.homework8.Users.ChinaBank.ChinaBankUser2;
import com.tms.homework8.Users.DeutscheBank.DeutscheBankUser1;
import com.tms.homework8.Users.DeutscheBank.DeutscheBankUser2;

public class Runner extends BankUserAttributes {
    public static void main(String[] args){

         //Пользователи американского банка.

        AmericanBankUser1 user1=new AmericanBankUser1();
        user1.accountVerification();

        //Проверяет массив счетов на наличие одинаковых счетов.
         user1.checkingAnArrayOfAccountForIdentity();

        //Проверяет заполнен ли массив счетов.
        user1.checkingAnArrayOfHectaresOfIdenticalUsers();


        AmericanBankUser2 user2=new AmericanBankUser2();
        user2.accountVerification();

        //Проверяет массив счетов на наличие одинаковых счетов.
        user2.checkingAnArrayOfAccountForIdentity();

        //Проверяет заполнен ли массив счетов.
        user2.checkingAnArrayOfHectaresOfIdenticalUsers();

        //Проверяет массив пользователей на наличие одинаковых пользователей.
        BankOfAmerica bankOfAmerica=new BankOfAmerica();
        bankOfAmerica.arrayUserChek();

        //Проверяет заполнен ли массив пользователей Американского банка.
        BankOfAmerica americanUser=new BankOfAmerica();
       americanUser.arrayChek();

        System.out.println("-----------------------------------------------------------");
        //Пользователи китайского банка.

        ChinaBankUser1 chinaBankUser1 = new ChinaBankUser1();
        chinaBankUser1.accountVerification();

        //Проверяет массив счетов на наличие одинаковых счетов.
        chinaBankUser1.checkingAnArrayOfAccountForIdentity();

        //Проверяет заполнен ли массив счетов.
        chinaBankUser1.checkingAnArrayOfHectaresOfIdenticalUsers();


        ChinaBankUser2 chinaBankUser2 = new ChinaBankUser2();
        chinaBankUser2.accountVerification();

        //Проверяет массив счетов на наличие одинаковых счетов.
        chinaBankUser2.checkingAnArrayOfAccountForIdentity();

        //Проверяет заполнен ли массив счетов.
        chinaBankUser2.checkingAnArrayOfHectaresOfIdenticalUsers();

        //Проверяет массив пользователей на наличие одинаковых пользователей.
        BankOfChina bankOfChina=new BankOfChina();
        bankOfChina.arrayUserChek();

        //Проверяет заполнен ли массив пользователей Китайского банка.
        BankOfChina arrayUserChinaBank = new BankOfChina();
        arrayUserChinaBank.arrayChek();

        System.out.println("-----------------------------------------------------------");

        //Пользователи банка Германии.


        DeutscheBankUser1 deutscheBankUser1=new DeutscheBankUser1();
        deutscheBankUser1.accountVerification();

        //Проверяет массив счетов на наличие одинаковых счетов.
        deutscheBankUser1.checkingAnArrayOfAccountForIdentity();

        //Проверяет заполнен ли массив счетов.
        deutscheBankUser1.checkingAnArrayOfHectaresOfIdenticalUsers();


        DeutscheBankUser2 deutscheBankUser2=new DeutscheBankUser2();
        deutscheBankUser2.accountVerification();

        //Проверяет заполнен ли массив счетов.
        deutscheBankUser2.checkingAnArrayOfHectaresOfIdenticalUsers();

        //Проверяет массив пользователей на наличие одинаковых пользователей.
        BankOfDeutsche bankOfDeutsche=new BankOfDeutsche();
        bankOfDeutsche.arrayUserChek();

        //Проверяет заполнен ли массив пользователей  банка Германии.
        BankOfDeutsche arrayUserDeutscheBank = new BankOfDeutsche();
        arrayUserDeutscheBank.arrayChek();
    }
}

