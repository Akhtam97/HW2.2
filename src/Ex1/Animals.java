package Ex1;

public class Animals {
    public static void main(String[] args) {
        Popugay popugay1 = new Popugay("Попугай1",-30);
        Dog dog = new Dog("Собака",10);
        Cat cat = new Cat("Кошка",8);
        Fish fish = new Fish("Рыбка",5);
        System.out.println(popugay1);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(fish);
    }
}
