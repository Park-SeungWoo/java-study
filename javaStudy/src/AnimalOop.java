public class AnimalOop {
    private String name;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

}

class Cat extends AnimalOop {
    Cat() {
        super.setName("must set");
        System.out.println("please set my name");
    }

    Cat(String name) {
        super.setName(name);
        System.out.println("meow hi i'm " + name);
    }

    void meow() {
        System.out.println("meow " + super.getName());
    }

    void meow(int n) {  // overloading
        for (int i = 0; i < n; i++) {
            this.meow();
        }
    }

    @Override
    void setName(String name) {
        super.setName(name);
        System.out.println("meow hi i'm " + name);
    }
}

class Dog extends AnimalOop {
    Dog() {
        super.setName("must set");
        System.out.println("please set my name");
    }

    Dog(String name) {
        super.setName(name);
        System.out.println("bark hi i'm " + name);
    }

    void bark() {
        System.out.println("bark " + super.getName());
    }

    void bark(int n) {  // overloading
        for (int i = 0; i < n; i++) {
            this.bark();
        }
    }

    @Override
    void setName(String name) {
        super.setName(name);
        System.out.println("bark hi i'm " + name);
    }
}