// Polymorphism example (Compile-time and Run-time)

public class PolymorphismExample {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
    }
}

// parent class

class Animal{
    public String voice;

    // final keyword usage in case of variables
    // (values unassigned during declaration)

    public  final int AGE ;

    // value of final variable assigned through constructor
    Animal(){               // Constructor
        this.AGE=10;
    }

    void sound(){}
}

// subclass
class Dog extends Animal{

// Method overriding
    
    void   sound (){
        System.out.println(AGE);
        System.out.println("Dog barks woof");
    }

}
