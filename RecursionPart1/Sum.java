
import java.util.Scanner;

public class Sum
{
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int m=sum(n-1);
        int sum=n+m;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
