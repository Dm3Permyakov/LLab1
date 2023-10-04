package l1;

public class Diplodocus extends Dinosaurs{
    public static int countD = 0;
    void weight(){
        System.out.println(this.name + " весит " + this.ves + " т");
    }
    public Diplodocus(String name, int age, int ves) {
        super(name, age, ves);
        this.maxRunDist=1000;
        this.maxSwimDist=0;
        countD=countD+1;
    }
}