class Student1{
    int rollno=1;
    String name;
    String address;
    String email;
    int age;
    static String schoolName="Pragra";

     Student1(){
         rollno++;
        this.name="Gagandeep Singh";
        this.address="2456 brampton";
        this.age = 27;

    }
    Student1 (String name,String address,String email){
        rollno++;
         this.name = name;
         this.address = address;
         this.email = email;

    }
    Student1(String name,String address,String email,int age){

         this.name = name;
         this.address = address;
         this.email =email;
         this.age = age;
    }
public void display(){
         rollno++;
    System.out.println("Details "+name+","+rollno+","+address+","+email+","+age+","+schoolName);
}
}


public class StaticFunction {
    public static void main(String[] args) {
        Student1 s = new Student1();
s.display();
Student1 s1 =new Student1("Johan", "253 dfkgjkdfsh", "gharag253@gmail.com", 53);
s1.display();
        Student1 s2 =new Student1("Akshay", "253 dfkgjkdfsh", "gharag253@gmail.com", 53);
s2.display();
 Student1 s3 = new Student1();
    s3.display();
        Student1 s4 = new Student1();
        s3.display();

    }
}
