package oops;
/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.wheels();
        v.color();
        // Car c = new Vehicle();   will throw error
        // c.wheels();


        // will throw error
        // v.state(); 
    }
}

class Vehicle{
    void wheels(){
        System.out.println("have wheels");
    }
    void color(){
        System.out.println("color of the vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("car constructor is called");
    }
    void wheels(){
        System.out.println("has 4 wheels");
    }
    void color(){
        super.color();
        System.out.println("It is blue");
    }
    void state(){
        System.out.println("west bengal");
    }
}