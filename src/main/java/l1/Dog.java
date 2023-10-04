package l1;

public class Dog extends Animal{
    public static int countD = 0;
    public Dog(String name, int age) {
        super(name, age);
        this.maxRunDist=500;
        this.maxSwimDist=10;
        countD=countD+1;
    }
}
