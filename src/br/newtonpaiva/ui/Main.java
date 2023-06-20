package br.newtonpaiva.ui;

import br.newtonpaiva.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Account number: ");
        int number = sc.nextInt();
        System.out.print("Account holder: ");
        String name = sc.next();
        System.out.print("Is there a inittial deposit (y/n) ");
        char a = sc.next().charAt(0);
        System.out.println(" ");

        Account ac = new Account(number, name);

        if(a == 'y'){
            System.out.print("Enter with the initial deposit value: ");
            double value = sc.nextDouble();
            ac.deposit(value);
        }/*else{
            System.out.println("Account data: " + ac);
        }
*/
        System.out.println("Account data: " + ac);
        System.out.print("Enter with a deposit value: ");
        double value = sc.nextDouble();
        ac.deposit(value);
        System.out.println("Updated account data: ");
        System.out.println(ac);
        System.out.print("Enter with a withdraw value: ");
        value  = sc.nextDouble();
        ac.withDraw(value);
        System.out.println("Updated account data: ");
        System.out.println(ac);


        sc.close();
    }
}