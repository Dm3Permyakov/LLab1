package l1;

public class Tiger extends Animal {
    public static int countT = 0;
    public Tiger(String name, int age) {
        super(name, age);
        this.maxRunDist=1000;
        this.maxSwimDist=100;
        countT=countT+1;
    }
}
