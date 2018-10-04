import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public abstract class AccountFunctions {

    public static void addAccount() {

//        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
//        String
//
//        Account account1 = new Account();
//
//account1.balance = input;

        ArrayList<Account> accountList = new ArrayList<>();
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Account account = new Account();
        Account account1 = new Account();


            System.out.println("Enter clients first name.");
            account.setfName(input.nextLine());

            System.out.println("Enter clients last name.");
            account.setlName(input.nextLine());

            System.out.println("Enter clients current balance.");
            account.setBalance(input.nextDouble());

            accountList.add(account);
            account.setId(accountList.size());

        System.out.println("Enter clients first name.");
        account1.setfName(input.nextLine());

        System.out.println("Enter clients last name.");
        account1.setlName(input.nextLine());

        System.out.println("Enter clients current balance.");
        account1.setBalance(input.nextDouble());

        accountList.add(account1);
        account1.setId(accountList.size());




            System.out.println("number of accounts" );
            System.out.println("id:\t"+ account.getId() + "\nFirst Name:\t"+ account.getfName() + "\nLast Name:\t" +account.getlName()+ "\nBalance:\t" + account.getBalance());
        System.out.println("id:\t"+ account1.getId() + "\nFirst Name:\t"+ account1.getfName() + "\nLast Name:\t" +account1.getlName()+ "\nBalance:\t" + account1.getBalance());



    }


    public static void listAccounts(){



        System.out.println();
    }

}
