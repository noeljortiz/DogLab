// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog extends Animal {
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name) {
        this.name = name;
    }


    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark() {
        return "Dog barking";
    }


    public void waddle() {
        System.out.println(name + " is doing a dog waddle");
    }


    public void eat() {
        System.out.println(name + " is doing a dog eating");
    }
}