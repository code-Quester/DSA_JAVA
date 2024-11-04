package oops;


public class use_of_static {
    public static void main(String[] args) {
        Student s1 = new Student(19);
        s1.setname("Suchi");
        System.out.println(s1.getname());
        System.out.println(s1.getrollno());
        
        s1.schoolname = "HCS";
        Student s2 = new Student(57);
        System.out.println(s2.schoolname);
        s2.schoolname = "NGHSS";
        System.out.println(s1.schoolname);

        Student.change_schoolname("st.thomas");
        System.out.println(Student.schoolname);
    }
}


class Student {
    String name;
    int rollno;
    static String schoolname;
    static void change_schoolname(String r){
        schoolname = r;
    }
    
    Student(int rollno){
        this.rollno = rollno;
    }

    void setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
    int getrollno(){
        return this.rollno;
    }
}
