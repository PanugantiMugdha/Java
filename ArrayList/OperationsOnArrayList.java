import java.util.ArrayList;
public class OperationsOnArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        list.set(0,10);
        System.out.println(list);
        System.out.println(list.contains(10));
        list.add(1,20);
        System.out.println(list);
    }
}

