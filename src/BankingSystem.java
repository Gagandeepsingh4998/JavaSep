import java.util.Scanner;

public class BankingSystem {
    double account;
    double balance;

public void account(double ac){
    account=ac;
    System.out.println("Your account number is :"+account);
}
public double currentBalance(){

    System.out.println("Your current account balance is : ");
    return balance;
}
public void depositMoney(){
    System.out.println("Enter the amount you want to deposit : ");
    Scanner sc = new Scanner(System.in);

    double deposit = sc.nextDouble();
    balance += deposit;
    System.out.println(balance+"has been deposited into your account");
}
    public static void main(String[] args) {
    BankingSystem bs = new BankingSystem();
    bs.account(646464698);
    bs.depositMoney();
    }
}
