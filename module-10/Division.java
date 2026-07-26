/*
 * Sam Dirr
 * CSD 402 Assignment 10.2
 * July 26, 2026
 */

public abstract class Division {
    private final String divisionName;
    private final int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void display();
}
