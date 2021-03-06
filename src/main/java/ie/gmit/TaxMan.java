/*
Oisin Concannon
Software with Test Project
06/03/21
 */

package ie.gmit;

public class TaxMan {
    private double salary;
    private double prsi;
    private double usc;
    private double incomeTax;

    public TaxMan() {
    }

    public void setSalary(double salary){ this.salary = salary;}

    public double getSalary(){return salary;}

    public double incomeTax(double salary){
        if(salary>=10000) {
            salary = getSalary();
            incomeTax = salary * 0.2;
            return incomeTax;
        }
        else{
            throw new IllegalArgumentException("Invalid Salary,therefore cannot calculate income tax");
        }
    }

    public double usc(double salary){
        if(salary>=10000) {
            salary = getSalary();
            usc = salary * 0.045;
            return usc;
        }
        else{
            throw new IllegalArgumentException("Invalid Salary,therefore cannot calculate income tax");
        }
    }

    public double prsi(double salary){
        if(salary>=10000) {
            salary = getSalary();
            prsi = salary * 0.04;
            return prsi;
        }
        else{
            throw new IllegalArgumentException("Invalid Salary,therefore cannot calculate income tax");
        }
    }

    public double netPay(double salary){
        if(salary>=10000) {
            salary = getSalary();
            double netPay = salary - prsi - incomeTax - usc;
            return netPay;
        }
        else{
            throw new IllegalArgumentException("Invalid Salary,therefore cannot calculate income tax");
        }
    }

    public String getDetails(){return "Salary:" + salary ;}

}