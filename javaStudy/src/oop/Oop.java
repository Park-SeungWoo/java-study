public class Oop {
    static void run() {
        // basic class
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Dog dog2 = new Dog("puppy");
//
//        cat.setName("cat");
//        dog.setName("dog");
//
//        cat.meow(3);
//        dog.bark(2);
//        dog2.bark();

        // interface
        ZooKeeper k = new ZooKeeper();
        Tiger t = new Tiger();
        Lion l = new Lion();
        k.feed(t);
        k.feed(l);

        t.houling();
        l.houling();

        System.out.println(Predators.speed() * 4);

        Bouncer b = new Bouncer();
        b.barkAnimal(t);
        b.barkAnimal(l);
    }
}
