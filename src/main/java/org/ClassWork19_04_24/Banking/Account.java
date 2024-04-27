package org.ClassWork19_04_24.Banking;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Напишите программу,
 * которая учитывает все финансовые транзакции пользователя за месяц.
 * Пользователь вводит суммы каждой транзакции, и они добавляются в список.
 * Программа должна выводить общую сумму расходов и доходов за указанный месяц,
 * а также баланс. Суммы операций нужно хранить, используя списки List<Double> или List<BigDecimal>.
 */
public class Account {
    private double balance;
    private List<Transaction> transactions;
    public Account(){
        transactions = new ArrayList<>();
    }

    public void withdraw(double sum){
        if(sum < 0) throw new IllegalArgumentException("ne vernaya summa");
        if(sum > balance) throw new IllegalArgumentException("malo deneg na schetu");
        transactions.add(new Transaction(-sum, LocalDate.now()));
        balance -= sum;
    }
    public void deposit(double sum){
        if(sum < 0) throw new IllegalArgumentException("ne vernaya summa");
        transactions.add(new Transaction(sum, LocalDate.now()));
        balance += sum;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public double incomes(Month month){
        int result = 0;
        for (Transaction t : transactions) {
            if(t.sum() > 0 && t.date().getMonth() == month){
                result+=t.sum();
            }
        }
        return result;
    }

    public double expenses(Month month){
        int result = 0;
        for (Transaction t : transactions) {
            if(t.sum() < 0 && t.date().getMonth() == month){
                result-=t.sum();
            }
        }
        return result;
    }
}
