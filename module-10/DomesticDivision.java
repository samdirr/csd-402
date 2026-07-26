/*
 * Sam Dirr
 * CSD 402 Assignment 10.2
 * July 26, 2026
 */

public class DomesticDivision extends Division {
    private final String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division name: " + getDivisionName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
