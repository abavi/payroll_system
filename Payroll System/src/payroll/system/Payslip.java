package payroll.system;

/**
 * Payslip class to allow storing and accessing payslips for employees.
 * @author Bavi
 */
public class Payslip {  
    private String month;
    private double monthlyPay;
    private double taxes;
    private double netPay;

    public Payslip(String month, double monthlyPay, double taxes, double netPay) {
        this.month = month;
        this.monthlyPay = monthlyPay;
        this.taxes = taxes;
        this.netPay = netPay;
    }  

    public double getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    
    
    
}
