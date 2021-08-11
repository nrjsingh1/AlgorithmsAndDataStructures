package JavaBasics;

public class InheritanceConstructor {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.move();// private and final methods cant be overridden
        Animal ad = new Dog();
        ad.move();// here method hiding happens , when both super class method and child class method are static
        //Dog da = new Animal(); base object cannot have a super class instance
        Dog d = new Dog();
        d.move();

    }
}
class Animal{

    Animal(){
        System.out.println("This is the Animal");
    }

    public  void move(){
        System.out.println("We animals can move");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("This is a Dog");
    }

    public void move(){
        System.out.println("We Dogs move on four legs");
    }
}
