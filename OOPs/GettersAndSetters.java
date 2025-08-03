public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());
        p1.setColor("Red");
        System.out.println(p1.getColor());
    }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String color)
    {
        this.color=color;
    }
    void setTip(int tip)
    {
        this.tip=tip;
    }
    String getColor()
    {
        return color;
    }
    int getTip()
    {
        return tip;
    }
}
