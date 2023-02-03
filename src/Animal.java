public abstract class Animal {

    private static int age;

    public Animal(){
        age = 0;
    }
    public static int setAge(int newAge){
        age = newAge;
        return age;
    }
    public static int getAge(){
        return age;
    }
    public abstract void eat();










}
