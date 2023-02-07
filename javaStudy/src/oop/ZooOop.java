interface Predators {
    String getFood();

    default void houling() {
        System.out.println("awwwwwww");
    }

    String ZOO_NAME = "PARKs";  // 자동으로 public static final 붙음

    static int speed() {
        return 30;  // use leg count * this as a sppeed
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredators extends Predators, Barkable {  // class와 달리 다중 상속 가능

}

public class ZooOop {
    private String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends ZooOop implements BarkablePredators {  // same as implements Predators, Barkable
    @Override
    public String getFood() {
        return "beef";
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends ZooOop implements BarkablePredators {
    @Override
    public String getFood() {
        return "pork";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    // without interface
//    void feed(Tiger t){
//        System.out.println("give a beef");
//    }
//
//    void feed(Lion l){
//        System.out.println("give a pork");
//    }
    // with interface
    void feed(Predators p) {
        System.out.println("give a " + p.getFood());
    }
}

class Bouncer {
    public void barkAnimal(Barkable animal) {
        // before using interface
//        if (animal instanceof Tiger) {
//            System.out.println("으르렁");
//        } else if (animal instanceof Lion) {
//            System.out.println("어흥");
//        } else {
//            System.out.println("please set");
//        }

        // with interface
        animal.bark();
    }
}