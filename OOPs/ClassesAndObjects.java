public class ClassesAndObjects
{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.setColor("Pink");
        System.out.println(pen1.color);
        pen1.color="Purple";
        System.out.println(pen1.color);
    }
}
class Pen
{
    String color;
    int tip;
    void setColor(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}
