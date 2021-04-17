/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Answer3;

/**
 *
 * @author Manisha Mandapati
 */
public class Loan {

    private String loanName;
    private int loanID;
    private double interestRate;

    Loan() {

    }

    public Loan(String loanName, int loanID, double interestRate) {
        this.loanName = loanName;
        this.loanID = loanID;
        this.interestRate = interestRate;
    }

    /**
     * Returns a String in a specified format.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Loan{"
                + "LoanName = " + loanName
                + ", loanID = " + loanID
                + ", interestRate = " + interestRate
                + '}';
    }
}
