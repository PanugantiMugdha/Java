

public class AbstractClassesConstructorHierarchy
{
    public static void main(String[] args) {
        // Horse h1=new Horse();
        // h1.eat();
        // h1.walk();
        // System.out.println(h1.color);
        // h1.changeColor();
        // System.out.println(h1.color);
        // Chicken c1=new Chicken();
        // c1.eat();
        // c1.walk();
        Mustang m1=new Mustang();//Contructor call hierarchy
    }
}
abstract class Animal
{
    String color;
    Animal() {
        // color="brown";
        System.out.println("Animal constructor called..");
    }
    void eat()
    {
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal
{

    Horse() {
        System.out.println("Horse constructor called..");
    }
    
    void changeColor()
    {
        color="Dark Brown";
    }
    void walk()
    {
        System.out.println("Horse walks on 4 legs");
    }
}
class Mustang extends Horse
{

    Mustang() {
        System.out.println("Mustang constructor called..");
    }
    
}
class Chicken extends Animal
{

    Chicken() {
        System.out.println("Chicken constructor called..");
    }
    
    void changeColor()
    {
        System.out.println("Yellow");
    }
    void walk()
    {
        System.out.println("Chicken walks on 2 legs");
    }
}
