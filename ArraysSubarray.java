public class ArraysPartA
{
    public static void printSubarray(int numbers[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int ts=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum of subarray:"+sum);
                if(sum>max)
                {
                    max=sum;
                }
                if(sum<min)
                {
                    min=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:"+ts);
        System.out.println("Max subarray:"+max);
        System.out.println("Min subarray:"+min);
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,10};
        printSubarray(numbers);

    }
}
