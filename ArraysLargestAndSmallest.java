

public class ArraysLargestAndSmallest
{
    public static int getLargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<smallest)
            {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args)
    {
        int numbers[]={1,3,5,7,11,2,4};
        System.out.println("Largest:"+getLargest(numbers));
        System.out.println("Smallest:"+getSmallest(numbers));
        
    }
}
