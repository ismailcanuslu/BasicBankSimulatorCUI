package model;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private int iban;
    private int currentBalance;

    private int borclanmaLimiti = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getBorclanmaLimiti() {
        return borclanmaLimiti;
    }

    public void setBorclanmaLimiti(int borclanmaLimiti) {
        this.borclanmaLimiti = borclanmaLimiti;
    }
}
