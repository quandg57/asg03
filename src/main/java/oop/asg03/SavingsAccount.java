//Ho va ten : Do Gia Quan
//MSSV: 12020309
//
//8.6
//Chuong trinh tinh so du tai khoan biet von va lai suat ngan hang
//Viet Savings Account Class

package oop.asg03;

/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 19/07/2014
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public class SavingsAccount {


        public static double annualInterestRate =0;
        private double savingsBalance;
// ham khoi tao
        public SavingsAccount(double sav)
        {
            savingsBalance= sav;
        }
// ham tinh so lai trong moi thang voi lai suat cho truoc
        public double calculateMonthlyInterest()
        {
            return (annualInterestRate*savingsBalance)/12;
        }
// ham tinh du tai khoan
        public double savingsBalanceadd1()
        {
            return savingsBalance + this.calculateMonthlyInterest();
        }
// ham chuyen lai suat
        public static double  modifyInterestRate(double ann)
        {
            annualInterestRate= ann;
            return  annualInterestRate;
// ham chuyen so du tai khoan ve kieu  String
        }
        public String toString(){
            String savings= String.valueOf(this.savingsBalanceadd1());
            return savings;
        }


}
