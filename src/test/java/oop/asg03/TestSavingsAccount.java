package oop.asg03;


import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 19/07/2014
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class TestSavingsAccount {
            @Test
            public void testSavingsAccountsaver1()
            {
                 SavingsAccount saver1 = new SavingsAccount(2000.00);
                 saver1.modifyInterestRate(0.04);
                 saver1.calculateMonthlyInterest();
                 assertEquals("2006.6666666666667",saver1.toString());
            }
            @Test
            public void	testSavingsAccountsaver12()
           {
                SavingsAccount saver1 = new SavingsAccount(2000.00);
                saver1.modifyInterestRate(0.04);
                saver1.calculateMonthlyInterest();
                saver1.modifyInterestRate(0.05);
                saver1.calculateMonthlyInterest();
                assertEquals("2008.3333333333333",saver1.toString());
            }
            @Test
            public void testSavingsAccountsaver2()
            {
                SavingsAccount saver2 = new SavingsAccount(3000.00);
                saver2.modifyInterestRate(0.04);
                saver2.calculateMonthlyInterest();
                assertEquals("3010.0",saver2.toString());
            }
            @Test
            public void	testSavingsAccountsaver21()
            {
                SavingsAccount saver2 = new SavingsAccount(3000.00);
                saver2.modifyInterestRate(0.04);
                saver2.calculateMonthlyInterest();
                saver2.modifyInterestRate(0.05);
                saver2.calculateMonthlyInterest();
                assertEquals("3012.5",saver2.toString());
            }
}
