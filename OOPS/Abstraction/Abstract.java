
public class Abstract {

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();
    }

}

abstract class animal {

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends animal {

    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class chicken extends animal {

    void walk() {
        System.out.println("Walk on 2 legs.");
    }
}
