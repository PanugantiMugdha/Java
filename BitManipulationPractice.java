import java.util.Scanner;

public class BitManipulationPractice
{
    public static int xExponentOfx(int n)
    {
        int m=n;
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans*=m;
            }
            m*=m;
            n=n>>1;
        }
        return ans;
    }
    public static void swap(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a+" b:"+b);
    }
    public static int addOne(int n)
    {
        return -(~n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.println(xExponentOfx(n));
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // swap(a, b);
        // System.out.println(addOne(n));
        for(char ch='A';ch<='Z';ch++)
        {
            System.out.print((char)(ch|' '));
        }

    }
}

