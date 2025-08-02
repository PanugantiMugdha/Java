public class ArraysPartA
{
    public static int binarySearch(int numbers[],int key)
    {
        int mid;
        int start=0,end=numbers.length-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
            else if(numbers[mid]<key)
            {
                start=mid+1;
            }
            else 
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int numbers[]={1,3,7,9,11,13};
        int key=11;
        System.out.println("Index is:"+binarySearch(numbers, key));
    }
}
