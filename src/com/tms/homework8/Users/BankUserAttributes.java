package com.tms.homework8.Users;

import com.tms.homework8.Account.AccountFunctionality;
import com.tms.homework8.Banks.BankAttributes;

public abstract class BankUserAttributes extends BankAttributes implements AccountFunctionality {


    public String lastName;
    public String name;
    public int passportID;
    public String floor;
    String numberAccount;
    double accountAmount;
    public int numberState;
    public String nameState;
    public int federalStateCode;
    public String nameProvince;
   public void accountVerification(){
   }
    public void checkingAnArrayOfHectaresOfIdenticalUsers(){

    }
    public void checkingAnArrayOfAccountForIdentity(){

    }
    @Override
    public void openAccount(String numberAccount, double accountAmount) {
        System.out.println("Счет открыт");
    }

    @Override
    public void closeAccount (String numberAccount,double accountAmount) {
        System.out.println("Создание счета невозможно или счет закрыт так как счет < или = 0 или сумма меньше пороговой");
    }

    @Override
    public void changeAccount (String numberAccount,double accountAmount) {
        System.out.println("Пользователь изменил счет");
    }






}



