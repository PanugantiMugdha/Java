public class AbstractClasses
{
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        Chicken c1=new Chicken();
        c1.eat();
        c1.walk();
    }
}
abstract class Animal
{
    void eat()
    {
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal
{
    void walk()
    {
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animal
{
    void walk()
    {
        System.out.println("Chicken walks on 2 legs");
    }
}
