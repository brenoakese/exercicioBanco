package pacakageAccount;

import packageException.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Account(Integer number, String holder, double balance, double withDrawLimit) throws DomainException {
        if (withDrawLimit > balance) {
            throw new DomainException("O limite de saque é maior que o saldo");
        } else {

            this.number = number;
            this.holder = holder;
            this.balance = balance;
            this.withDrawLimit = withDrawLimit;
        }

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {

    }

    public void withDraw(double amount) throws DomainException {
        if (amount > getWithDrawLimit()) {
            throw new DomainException("ERROR: O LIMITE DE SAQUE É MENOR QUE O VALOR SOLICITADO");
        } else {
            this.balance = this.balance - amount;
        }
    }
}
