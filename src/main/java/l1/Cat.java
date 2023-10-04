package l1;

public class Cat extends Animal{
    public static int countC = 0;

    public Cat(String name, int age) {
        super(name, age);
        this.maxRunDist=200;
        this.maxSwimDist=0;
        countC=countC+1;
    }
}
