package l1;

public class Trex extends Dinosaurs{
    public static int countT = 0;
    void weight(){
        System.out.println(this.name + " весит " + this.ves + " т");
    }
    public Trex(String name, int age, int ves) {
        super(name, age, ves);
        this.maxRunDist=5000;
        this.maxSwimDist=0;
        countT=countT+1;
    }
}