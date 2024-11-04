package oops;

public class Test {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.set_color("blue");
        p.set_tip(5);
        System.out.println(p.getcolor() );
        System.out.println(p.gettip());
    }

}

class Pen {

    private String color ;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void set_tip(int tip){
        this.tip = tip;
    }
    void set_color (String color){
        this.color = color;
    }
}