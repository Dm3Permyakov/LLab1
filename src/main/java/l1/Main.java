package l1;

public class Main {
    public static void main(String[] args) {

        Cat Cat1 = new Cat("Мурзик", 2);
        Dog Dog1 = new Dog("Бобик", 3);
        Tiger Tiger1 = new Tiger("Вася",5);
        Tiger Tiger2 = new Tiger("Петя",4);
        Stegosaur Steg1 = new Stegosaur("Стего",5,2);
        Trex Trex1 = new Trex("Тирекс",15, 8);
        Diplodocus Dipl1 = new Diplodocus("Дип",11, 20);

    Animal[] animals = {Cat1, Dog1, Tiger1, Tiger2, Steg1, Trex1, Dipl1
        };

        System.out.println("ЗАБЕГ:");
      for (Animal a:animals) {
           a.run(210);
      }

        System.out.println();
        System.out.println("ЗАПЛЫВ:");
        for (Animal a:animals) {
            a.swim(15);
        }

        System.out.println();
        System.out.println("КОЛИЧЕСТВО");
        System.out.println("Животных: " + animals[0].getCount());
        System.out.println("Котов: " + Cat.countC);
        System.out.println("Собак: " + Dog.countD);
        System.out.println("Тигров: " + Tiger.countT);
        System.out.println("Тираннозавров: " + Trex.countT);
        System.out.println("Стегозавров: " + Stegosaur.countS);
        System.out.println("Диплодоков: " + Diplodocus.countD);

        System.out.println();
        System.out.println("ВЕС:");
        Trex1.weight();
        Steg1.weight();
        Dipl1.weight();

    }
}