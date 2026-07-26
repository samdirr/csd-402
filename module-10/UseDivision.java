/*
 * Sam Dirr
 * CSD 402 Assignment 10.2
 * July 26, 2026
 */

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision europeanDivision = new InternationalDivision(
                "European Sales", 1001, "Germany", "German");
        InternationalDivision asianDivision = new InternationalDivision(
                "Asian Operations", 1002, "Japan", "Japanese");
        DomesticDivision midwestDivision = new DomesticDivision(
                "Midwest Sales", 2001, "Nebraska");
        DomesticDivision southernDivision = new DomesticDivision(
                "Southern Operations", 2002, "Texas");

        Division[] divisions = {
            europeanDivision,
            asianDivision,
            midwestDivision,
            southernDivision
        };

        for (Division division : divisions) {
            division.display();
            System.out.println();
        }
    }
}
