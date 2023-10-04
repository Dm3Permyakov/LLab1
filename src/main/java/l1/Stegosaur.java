package l1;

public class Stegosaur extends Dinosaurs{
    public static int countS = 0;
    void weight(){
        System.out.println(this.name + " весит " + this.ves + " т");
    }
    public Stegosaur(String name, int age, int ves) {
        super(name, age, ves);
        this.maxRunDist=2000;
        this.maxSwimDist=0;
        countS=countS+1;
    }
}