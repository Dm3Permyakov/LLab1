package l1;

public abstract class Animal {
   public String name;
   public int age;
   public int maxRunDist;
   public int maxSwimDist;
   public static int count = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
         count = count+1;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void run(int dist){
        if (this.maxRunDist>= dist){
            System.out.println(this.name + " пробежал " + dist);
        } else{
            System.out.println(this.name + " не справился");
        }

    }

    public void swim(int dist){
        if (this.maxSwimDist== 0){
            System.out.println(this.name + " не умеет плавать");
        } else
        if (this.maxSwimDist>= dist){
            System.out.println(this.name + " проплыл " + dist);
        } else{
            System.out.println(this.name + " не справился");
        }

    }

}
