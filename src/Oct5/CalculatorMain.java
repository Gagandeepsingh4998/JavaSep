package Oct5;
import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) {
     String answer;
     int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Addition");
            System.out.println("2.subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            System.out.println("Please enter the number here");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    Addition addition = new Addition();
                    System.out.println("Enter the first number here which you want to add");
                    double num1 = sc.nextDouble();
                    System.out.println("Enter the second number here which you want to add");
                    double num2 = sc.nextDouble();
                    System.out.println("Enter the third number here or press 0 to skip");
                    double num3 = sc.nextDouble();
                    if(num3 != 0){
                        System.out.println("The addition of three numbers is"+addition.sum(num1, num2, num3));
                    }
                    else {
                        System.out.println("The addition of two numbers is "+addition.sum(num1, num2));
                    }
                    break;
                case 2:
                    Subtraction subt = new Subtraction();
                    System.out.println("Enter the first number here which you want to Subtract");
                    double sub1 = sc.nextDouble();
                    System.out.println("Enter the second number here which you want to Subtract");
                    double sub2 = sc.nextDouble();
                    System.out.println("Enter the third number here or press 0 to skip");
                    double sub3 = sc.nextDouble();
                    if(sub3 != 0){
                        System.out.println("The addition of three numbers is"+subt.subtraction(sub1, sub2, sub3));
                    }
                    else {
                        System.out.println("The addition of two numbers is "+subt.subtraction(sub1, sub2));
                    }
                    break;
                case 3:
                    Multiplication multi = new Multiplication();
                    System.out.println("Enter the first number here which you want to Multiply");
                    double mul = sc.nextDouble();
                    System.out.println("Enter the second number here which you want to Multiply");
                    double mul2 = sc.nextDouble();
                    System.out.println("Enter the third number here or press 0 to skip");
                    double mul3 = sc.nextDouble();
                    if(mul3 != 0){
                        System.out.println("The addition of three numbers is"+multi.multiplication(mul,mul2, mul3));
                    }
                    else {
                        System.out.println("The addition of two numbers is "+multi.multiplication(mul, mul2));
                    }
                    break;
                case 4:
                   Division div = new Division();
                    System.out.println("Enter the first number here which you want to Divide");
                    double div1 = sc.nextDouble();
                    System.out.println("Enter the second number here which you want to Multiply");
                    double div2 = sc.nextDouble();
                    System.out.println("Enter the third number here or press 0 to skip");
                    double div3 = sc.nextDouble();
                    if(div3 != 0){
                        System.out.println("The addition of three numbers is"+div.division(div1,div2, div3));
                    }
                    else {
                        System.out.println("The addition of two numbers is "+div.division(div1, div2));
                    }
                    break;
                case 5:
                Modulus modu = new Modulus();
                    System.out.println("Enter the first number here which you want to Modulus");
                    double modu1 = sc.nextDouble();
                    System.out.println("Enter the second number here which you want to Modulus");
                    double modu2 = sc.nextDouble();
                    System.out.println("Enter the third number here or press 0 to skip");
                    double modu3 = sc.nextDouble();
                    if(modu3 != 0){
                        System.out.println("The addition of three numbers is"+modu.modulus(modu1,modu2, modu3));
                    }
                    else {
                        System.out.println("The addition of two numbers is "+modu.modulus(modu1, modu2));
                    }

                    break;

            }
            i++;
            System.out.println("Do you want to continue yes or no");
                 answer = sc.next();
            String yes="yes";
       if(answer.equalsIgnoreCase(yes)){
           i=0;
     }
       else {
          System.exit(0);
       }
        }while (i<1);
    }
}
