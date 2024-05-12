// Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, 
// Also create methods getAccountDetails() and displayAccountDetails().

import java.util.Scanner;
public class Bank{
    public static void main(String[] args) {
        Bank_Account a1=new Bank_Account();
        a1.getAccountDetails();
        a1.displayAccountDetails();   
    }
}
class Bank_Account{
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    void getAccountDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account No:");
        accountNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your User Name:");
        userName=sc.nextLine();
        System.out.println("Enter your Email:");
        email=sc.nextLine();
        System.out.println("Enter your Account Type:");
        accountType=sc.nextLine();
        System.out.println("Enter your Account Balance:");
        accountBalance=sc.nextInt();
    }
    void displayAccountDetails(){
        System.out.println("---------------------------------------");
        System.out.println("Your Account No.\n" + accountNo);
        System.out.println("---------------------------------------");
        System.out.println("Your User Name:\n" + userName);
        System.out.println("---------------------------------------");
        System.out.println("Your Email:\n" + email);
        System.out.println("---------------------------------------");
        System.out.println("Your Account:\n" + accountType);
        System.out.println("---------------------------------------");
        System.out.println("Your Account Balance:\n" + accountBalance);
        System.out.println("---------------------------------------");
    }
}