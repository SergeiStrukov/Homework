package org.example._10_04_2024.Information;

import org.example._10_04_2024.Enams.Currancy;
//8. Написать класс Account
//Поля:
//        - валюта счета(энам)
//- баланс
//- номер счета
public class Account {
    private Currancy currancy;
    private int balance;
    private int numberAccount;

    public Account(Currancy currancy, int balance, int numberAccount) {
        this.currancy = currancy;
        this.balance = balance;
        this.numberAccount = numberAccount;
    }

    public Currancy getCurrancy() {
        return currancy;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setCurrancy(Currancy currancy) {
        this.currancy = currancy;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }
}
