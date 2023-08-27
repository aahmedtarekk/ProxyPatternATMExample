import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM ATM = new proxyATM();
        CreditCard creditCardValid = new CreditCard();
        creditCardValid.setDaysTillExpiry(90);
        CreditCard creditCardInvalid = new CreditCard();
        creditCardInvalid.setDaysTillExpiry(-1);
        System.out.println("Welcome to CIB Bank, please enter your creditCard!");
        while(true)
        {
            System.out.println("Please select one of the following options!");
            System.out.println("For Withdraw, press 1!");
            System.out.println("For Deposit, press 2!");
            System.out.println("For Balance Check, press 3!");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            if(choice ==1)
            {
                System.out.println(ATM.withdraw(creditCardInvalid));
                break;
            }
            else if(choice ==2)
            {
                System.out.println(ATM.deposit(creditCardInvalid));
                break;
            }
            else if(choice ==3)
            {
                System.out.println(ATM.checkBalance(creditCardInvalid));
                break;
            }
            else
            {
                System.out.println("Wrong choice, please try again!");
            }
        }
    }
}