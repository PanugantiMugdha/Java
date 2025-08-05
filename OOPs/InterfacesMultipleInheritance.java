public class InterfacesMultipleInheritance {
    public static void main(String[] args) {
        Bear b1=new Bear();
        b1.eats();
    }
}
interface Herbivores
{
    void eats();
}
interface Carnivores
{
    void eats();
}
class Bear implements Herbivores, Carnivores
{
    public void eats()
    {
        System.out.println("Eats grass as well as meat");
    }
}
