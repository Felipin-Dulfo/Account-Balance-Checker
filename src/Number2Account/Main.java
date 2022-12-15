package Number2Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mode = input.nextInt();
        Account account = null;

        if (mode == 1) {
            int accountNum = input.nextInt();
            account = new Account(accountNum);
        }
        else if (mode == 2) {
            int accountNum = input.nextInt();
            int balance = input.nextInt();
            account = new Account(accountNum, balance);
        }

        int m = input.nextInt();

        for(int ctr = 0; ctr < m; ++ctr) {
            int operation = input.nextInt();

            if (operation == 1) {
                double addBalance = input.nextInt();
                account.credit(addBalance);
            } else if (operation == 2) {
                double addBalance2 = input.nextInt();
                account.debit(addBalance2);
            } else if (operation == 3) {
                System.out.println(account.getAccountNumber());
            } else if (operation == 4) {
                System.out.println(account.getBalance()+"0");
            } else if (operation == 5) {
                System.out.println(account.toString());
            }
        }
    }
}
