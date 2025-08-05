
// Compile  :- Time Polymorphism 
//            Method Overloading :- Multiple functions with the same name but diffrent parametres
// Example : -
public class polymorphism {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 5));
        System.out.println(calc.sum(1.5, 2.8));
        System.out.println(calc.sum(1, 2, 4));
    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Run  :- Time Polymorphism 
//            Method Overriding :- Parent ans child classes both contain the same function with a different       definition.
// Example : -
public class polymorphism {

    public static void main(String[] args) {
        Dear d = new Deer();
        d.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("eats everything");
    }
}

class Deer 

    extens Animal {
    void eat() {
        System.out.println("Eat grass");
    }
}
