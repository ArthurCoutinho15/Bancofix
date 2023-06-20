package br.newtonpaiva.entities;

public class Account {

    private int number;
    public String name;

    public double balance;

    public Account(){

    }
    public Account(int number, String name ) {
        this.number = number;
        this.name = name;

    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount + 5.00;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: " +
                number +
                ", Name: " + name + '\'' +
                ", Balance: R$" + String.format("%.2f", balance);
    }
}
