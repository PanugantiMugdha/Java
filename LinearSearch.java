

public class LinearSearch
{
    public static int linearSearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchString(String dinner[],String menuKey)
    {
        for(int i=0;i<dinner.length;i++)
        {
            if(dinner[i]==menuKey)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,10,12,14,16};
        String dinner[]={"Chapati","Palak Panneer","Rajma","Pasta","Baingan Ka Barta"};
        String menuKey="Rajma";
        int key=10;
        // int index=linearSearch(numbers, key);
        // if(index==-1)
        // {
        //     System.out.println("Key Not found");
        // }
        // else
        // {
        //     System.out.println("Key found at index:"+index);
        // }
        int index1=linearSearchString(dinner, menuKey);
        if(index1==-1)
        {
            System.out.println("Key Not found");
        }
        else
        {
            System.out.println("Key found at index:"+index1);
        }
    }
}
