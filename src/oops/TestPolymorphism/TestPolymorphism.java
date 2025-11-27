package src.oops.TestPolymorphism;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    static void eat() {
        System.out.println("Eating... in Animal class");
    }   
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    static void eat() {
        System.out.println("Eating... in Dog class");
    }  

}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        Animal.eat(); // Dog's implementation
        Dog.eat(); // Animal's static method
        a.sound(); // Dog's implementation
        Dog b = new Dog();
        b.sound(); // Dog's implementation
        Animal c = new Animal();
        c.sound(); // Animal's implementation
    }
}
