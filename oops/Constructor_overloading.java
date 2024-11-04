package oops;

public class Constructor_overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="suchi";
        s1.roll_no=19;
        s1.password= 1234;

        s1.arr[0]=1;
        s1.arr[1]=1;
        s1.arr[2]=2;


        // Student s2 = new Student("niloy");
        // Student s3 = new Student(5);
        // System.out.println(s2.name);
        // System.out.println(s3.roll_no);
        Student s4 = new Student(s1);
        System.out.println(s4.name +" "+ s4.roll_no+" "+ s4.password);
        s1.arr[2]=3;
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.arr[i]);
        }
        
    }
}
class Student{
    String name;
    int roll_no;
    int password;
    int arr[]= new int[3];;
    Student (){
        System.out.println("constructor is being called");
    }

    Student(Student s1){
        this.name = s1.name;
        this.roll_no= s1.roll_no;
        this.password = s1.password;
        for (int i = 0; i < s1.arr.length; i++) {
            this.arr[i] = s1.arr[i];
        }

    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll_no= roll;
    }

}
