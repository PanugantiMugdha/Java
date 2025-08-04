public class HybridInheritance {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.eats();
        Tuna t1=new Tuna();
        t1.swims();
        Peacock p1=new Peacock();
        p1.beakType="Straight";
        System.out.println(p1.beakType);
    }
}
class Animal
{
    String color;
    void eats()
    {
        System.out.println("Eats");
    }
    void breathes()
    {
        System.out.println("Breathes");
    }
}
class Mammal extends Animal
{
    void walks()
    {
        System.out.println("Walks");
    }
}
class Human extends Mammal
{
    void talks()
    {
        System.out.println("Talks");
    }
}
class Fish extends Animal
{
    void swims()
    {
        System.out.println("Swims");
    }
}
class Tuna extends Fish
{
    int fins;
}
class Bird extends Animal
{
    void flies()
    {
        System.out.println("Flies");
    }
}
class Peacock extends Bird
{
    String beakType;
}
