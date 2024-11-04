package oops;

public class multiple_inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatsgrass();
        b.eatsmeat();
    }
}

interface Herbivore {
    void eatsgrass();
}

interface Carnivore {
    void eatsmeat();   
}


class Bear implements Herbivore,Carnivore{
    public void eatsgrass(){
        System.out.println("eats grass");
    }
    public void eatsmeat(){
        System.out.println("eats meat");
    }
}