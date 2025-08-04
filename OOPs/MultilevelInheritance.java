public class MultilevelInheritance {
    
    public static void main(String[] args) {
        Dog dhinni=new Dog();
        dhinni.eats();
        dhinni.breed="German Shepheard";
        System.out.println(dhinni.breed);
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
    int legs;
}
class Dog extends Mammal
{
    String breed;
}
