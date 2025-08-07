
public class Inheritence {

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Dog Tommy = new Dog();
        Tommy.legs = 4;
        System.out.println(Tommy.legs);
    }
}

// Base class
class Animal {

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {

    int legs;
}

class Dog extends Mammal {

    String breed;
}

// Derived class / Subclass
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

// Inheritance are of four types
// 1. Single Level Inheritance :-  Single Base class  and derived class
//                                  Example:- Animal ---> Mammal
// 2. Multi Level Inheritance :-  Single Base class and Derived class
//                               Example :- Animal --->  Mammal  ---> Dog 
// 3. Heirarchial Inheritance :- 
Example

:- 

public class Inheritence {

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        Dog Tommy = new Dog();
        Tommy.legs = 4;
        System.out.println(Tommy.legs);
    }
}

// Base class
class Animal {

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {

    void swim() {
        System.out.println("Swim");
    }
}
