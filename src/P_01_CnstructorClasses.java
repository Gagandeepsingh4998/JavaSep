class Student{
    int id;
    String firstname;
    String lastname;

    //constructor
    Student(){

    }
    public void getStudentName(){

    }
}


public class P_01_CnstructorClasses {
    public static void main(String[] args) {
Student st = new Student();
st.firstname="Gagandeep";
st.lastname="Singh";
st.id=78;
        System.out.println(st.firstname);
        System.out.println(st.lastname);
        System.out.println(st.id);
    }
}
