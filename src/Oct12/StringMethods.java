package Oct12;

public class StringMethods {
    public static void main(String[]args) {

       String name = "Pragra";
       String reverse =" ";
        for( int i = 0;i<name.length()-1;i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
