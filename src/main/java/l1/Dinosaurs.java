package l1;

public abstract class Dinosaurs extends Animal{
    int ves;

    public Dinosaurs(String name, int age, int ves) {
        super(name, age);
        this.ves = ves;
    }

    abstract void weight();
}