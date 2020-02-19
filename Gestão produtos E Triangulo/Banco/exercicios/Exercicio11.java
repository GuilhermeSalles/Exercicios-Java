package exercicios;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Account account = null;
    
        System.out.print("Enter account number: ");
        byte number = sc.nextByte();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        while((response != 'y') && (response != 'n')){
            System.out.println("==============================================");
            System.out.println("Invalid response...");
            System.out.print("Please put (Yes or no): ");
            response = sc.next().toLowerCase().charAt(0);
            
        if (response == 'y'){
            System.out.println("==============================================");
            System.out.print("Enter initial deposit value: ");
            float initialDeposit = sc.nextFloat();
            account = new Account(number, holder, initialDeposit);
            
        }if (response == 'n'){
            account = new Account(number, holder);
        }
        }

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.println("==============================================");
        System.out.print("Enter a deposit value: ");
        float depositValue = sc.nextFloat();
        account.deposit(depositValue);
        System.out.println("Updated accounut data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.println("==============================================");
        System.out.print("Enter a withdraw value: ");
        float withDrawValue = sc.nextFloat();
        account.withdraw(withDrawValue);
        System.out.println("Updated accounut data: ");
        System.out.println(account);
        
    sc.close();
    }
    
}
