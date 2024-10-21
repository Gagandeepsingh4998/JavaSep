import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        //int rollno[] = new int[a-1];
        System.out.println("Enter the no of students");
        int b = sc.nextInt();

   int rollno[] = new int[b];
   int s = 1;
   int i = 0;
                while (i<rollno.length){
                    System.out.println("Please enter the rollno of "+s+" Student");
                    rollno[i] = sc.nextInt();
                   i++;
                   s++;
                }
        System.out.println("The Students Rollno are listed below");
for(int element : rollno){
    System.out.println("the numbers are " +element);}
    }
}
