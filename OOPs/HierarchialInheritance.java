public class HierarchialInheritance {
    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.color="Blue";
        System.out.println(b1.color);
        b1.eats();
    }
}
class Animal
{
    String color;
    void eats()
    {
        System.out.println("Eats");
    }
    void breaths()
    {
        System.out.println("Breaths");
    }
}
class Mammal extends Animal
{
    void walks()
    {
        System.out.println("Walking");
    }
}
class Fish extends Animal
{
    void swims()
    {
        System.out.println("Swims");
    }
}
class Bird extends Animal
{
    void flies()
    {
        System.out.println("Flies");
    }
}
