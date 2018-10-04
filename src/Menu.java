import java.util.Scanner;

public class Menu {
    public static void menu() {


        do {
        System.out.println("____");
        System.out.println("Menu");
        System.out.println("----");

        Scanner input = new Scanner(System.in);
        String b = input.nextLine().toUpperCase();

            switch (b) {
//            Add Account
                case "ADD":
                case "A":
                    System.out.println("Add account");
                    AccountFunctions.addAccount();
                    break;
//            Delete Account
                case "DELETE":
                case "D":
                    System.out.println("Delete account");
                    break;
//            search Accounts
                case "SEARCH":
                case "S":
                    System.out.println("Getting from switch case 3 Hunger Games");
                    break;
//            List all Accounts
                case "LIST":
                case "L":
                    System.out.println("Getting from switch case 3 Hunger Games");
                    AccountFunctions.listAccounts();
                    break;
//            Update Account
                case "UPDATE":
                case "U":
                    System.out.println("Getting from switch case 3 Hunger Games");
                    break;

                default:
                    System.out.println("input: "+ b + " is not a valid input");
                    break;

            }
        } while (1 == 1);
        }
    }
    

