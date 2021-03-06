/*
Oisin Concannon
Software with Test Project
06/03/21
Test
 */
package ie.gmit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxManTest {
    public static void main(String[] args) {
        TaxMan t = new TaxMan();
        t.setSalary(50000.00);
        t.incomeTax(t.getSalary());
        t.prsi(t.getSalary());
        t.usc(t.getSalary());
        t.netPay(t.getSalary());

        System.out.println(t.getDetails());
        System.out.println("PRSI:" + t.prsi(t.getSalary()));
        System.out.println("Income Tax:" + t.incomeTax(t.getSalary()));
        System.out.println("USC:" + t.usc(t.getSalary()));
        System.out.println("Net Pay:" + t.netPay(t.getSalary()));
    }
        @Test
        void incomeTaxTest(){
            TaxMan t1 =  new TaxMan();
            assertEquals(10000,t1.incomeTax(50000));
        }

        @Test
        void incomeTaxTestFail(){
        TaxMan t1 = new TaxMan();
        assertThrows(IllegalArgumentException.class,() -> t1.incomeTax(0));
        }

        @Test
        void prsiTest(){
            TaxMan t1 =  new TaxMan();
            assertEquals(2000,t1.prsi(50000));
        }

        @Test
        void prsiTestFail(){
            TaxMan t1 = new TaxMan();
            assertThrows(IllegalArgumentException.class,() -> t1.prsi(0));
        }
        @Test
        void uscTest(){
            TaxMan t1 =  new TaxMan();
            assertEquals(2250,t1.usc(50000));
        }

        @Test
        void uscTestFail(){
            TaxMan t1 = new TaxMan();
            assertThrows(IllegalArgumentException.class,() -> t1.usc(0));
        }
        @Test
        void netPayTest(){
            TaxMan t1 =  new TaxMan();
            assertEquals(35750,t1.netPay(50000));
        }

        @Test
        void netPayTestFail(){
            TaxMan t1 = new TaxMan();
            assertThrows(IllegalArgumentException.class,() -> t1.netPay(0));
        }
    }

