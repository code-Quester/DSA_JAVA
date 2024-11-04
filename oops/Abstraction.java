package oops;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.mode();

        System.out.println(h.color);

        // Bird b = new Bird();
        // b.eat();
        // b.mode();
    }
}

abstract class Animal {
    String color = "brown";
    void eat(){
        System.out.println("eats");
    }

    abstract void mode();
}

class Horse extends Animal{
    @Override
    void mode(){
        System.out.println("walks/runs");
    }

}
class Bird extends Animal{
    @Override
    void mode(){
        System.out.println("flies");
    }
}
