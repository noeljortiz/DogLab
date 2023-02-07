//// ****************************************************************
//// DogTest.java
////
//// A simple test class that creates a Dog and makes it speak.
////
//// ****************************************************************
//
//
import java.util.ArrayList;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Dog dog = new Dog("Spike");
//        Labrador joe = new Labrador("Scout ","Brown");
//        Yorkshire york = new Yorkshire("Yorkie ",3);
//
//
//        System.out.println(dog.getName() + " says " + dog.bark());
//        System.out.println(joe.getName() + joe.bark());
//        System.out.println(york.getName() + york.bark());
//
//        york.waddle();
//
//        Dog[] yes = new Dog[3];
//        yes[0] = new Dog("John");
//        yes[1] = new Labrador("Himothy","Yellow");
//        yes[2] = new Yorkshire("Umpa", 3);
//        for(int i = 0; i < yes.length; i++){
//            System.out.println(yes[i].bark());
//        }
//
//
//
//
//        ArrayList<Dog> doggys = new ArrayList<Dog>();
//        doggys.add(new Dog("Gary"));
//        doggys.add(new Labrador("Moose","Brown"));
//        doggys.add(new Yorkshire("Harry", 4));
//
//        for(int i = 0;i < doggys.size();i++){
//            System.out.println(doggys.get(i).bark());
//    }
//
//        ((Labrador)doggys.get(1)).waddle();
//
//        for(int i = 0; i < doggys.size();i++){
//            doggys.get(i).waddle();
//        }
//
//
//
//
//
//
//
//
//
//    }
//}
public class Main {


    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Gary"));
        animals.add(new Labrador("Moose", "Brown"));
        animals.add(new Yorkshire("Harry", 4));

        animals.get(0).setAge(2);
        animals.get(1).setAge(3);
        animals.get(2).setAge(10);
        //System.out.println(animals.get(i).getAge());
     for(Animal animall:animals){
         System.out.println(animall.getAge());
         animall.eat();
         System.out.println((Dog)animall.bark());
     }


    }
}
