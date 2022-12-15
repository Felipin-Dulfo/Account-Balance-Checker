package Number2Account;

import java.text.DecimalFormat;

public class Account {
    private static DecimalFormat df = new DecimalFormat ("0.00");

    private int AccountNumber;
    private double Balance;

    public Account(int accountNum){
        AccountNumber = accountNum;
        Balance = 3000.00;

        System.out.println("First Overloaded Constructor");
    }
    public Account(int accountNum, int balance){
        AccountNumber = accountNum;
        Balance = balance;

        System.out.println("Second Overloaded Constructor");
    }
    public void credit(double addBalance){

        Balance = Balance + addBalance;
    }
    public void debit(double addBalance2){
        if(addBalance2<Balance){
            Balance=Balance-addBalance2;

        }else
            System.out.println("Insufficient Funds");

    }
    public int getAccountNumber() {

        System.out.print("Account Number: ");
        return AccountNumber;
    }

    public double getBalance() {

       System.out.print("Balance: ");

       return Balance;

    }
    public String toString(){


        return "Account Number: "+AccountNumber+", "+"Balance: Php "+df.format(Balance);
    }

}
