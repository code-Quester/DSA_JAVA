package oops;

public class test1 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called ");
    }
}
class Horse extends Animal{
    String color = "brown";
    Horse(){
        // super.color = "brown";
        System.out.println("horse constuctor is called");
    }
}