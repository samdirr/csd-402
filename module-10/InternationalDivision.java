/*
 * Sam Dirr
 * CSD 402 Assignment 10.2
 * July 26, 2026
 */

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division name: " + getDivisionName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}
