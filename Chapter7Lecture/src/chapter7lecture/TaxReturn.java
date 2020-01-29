package chapter7lecture;

/**
 *
 * @author lee_c
 */
public class TaxReturn {

    private double income;
    private String SSN;
    private String lastname;
    private String firstname;
    private char marital;
    //lazy on the others
    private double taxRate;
    private double taxLiability;

    public TaxReturn(double income, String SSN, String lastname, String firstname, char marital, double taxRate, double taxLiability) {
        this.income = income;
        this.SSN = SSN;
        this.lastname = lastname;
        this.firstname = firstname;
        this.marital = marital;
        this.taxRate = taxRate;
        this.taxLiability = taxLiability;
    }

    public TaxReturn(double income, String SSN, String lastname, String firstname, char marital) {
        this.income = income;
        this.SSN = SSN;
        this.lastname = lastname;
        this.firstname = firstname;
        this.marital = marital;
        determineTax();
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public char getMarital() {
        return marital;
    }

    public void setMarital(char marital) {
        this.marital = marital;
    }

    public double getTaxRate() {
        return taxRate;
    }

    //could comment out to make read only
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxLiability() {
        return taxLiability;
    }

    //could comment out to make read only
    public void setTaxLiability(double taxLiability) {
        this.taxLiability = taxLiability;
    }

    public void determineTax() {
        //applies table on p387
        if (income >= 0 && income <= 20000) {
            if (marital == 'S') {
                taxRate = .15;
            } else if (marital == 'M') {
                taxRate = .14;
            } else {
                taxRate = -1;
            }
        }//end if first if
        else if (income > 20000 && income <= 50000) {
            if (marital == 'S') {
                taxRate = .22;
            } else if (marital == 'M') {
                taxRate = .20;
            } else {
                taxRate = -1;
            }
        }//end if second if
        else if (income > 50000) {
            if (marital == 'S') {
                taxRate = .30;
            } else if (marital == 'M') {
                taxRate = .28;
            } else {
                taxRate = -1;
            }
        }//end if third if
        else {
            taxRate = -1;
        }
        
        taxLiability = income + taxRate;
    }

}
