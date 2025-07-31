
import java.util.Scanner;

public class BitManipulation {

    public static void oddOrEven(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    public static int getIthBit(int n,int i)
    {
        int bitmask=(1<<i);
        if((n&bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static int setIthBit(int n,int i)
    {
        int bitmask=(1<<i);
        return n|bitmask;
    }
    public static int clearIthBit(int n,int i)
    {
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateIthBit(int n,int i, int newBit)
    {
        if(newBit==0)
        {
            return clearIthBit(n, i);
        }
        else
        {
            return setIthBit(n, i);
        }
    }
    public static int clearLastIthBits(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearBitsInRange(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n &bitmask;

    }
    public static boolean powerOfTwo(int n)
    {
        if((n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
    public static int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //AND operator
        // System.out.println(5&6);//4
        // //OR operator
        // System.out.println(5|6);//7
        // //XOR operator
        // System.out.println(5^6);//3
        // //1s Complement
        // System.out.println(~3);
        // //Left shift
        // System.out.println(5<<2);
        // //Right Shift
        // System.out.println(6>>1);
        int a=sc.nextInt();
        int n=sc.nextInt();
        // oddOrEven(n);
        // int i=sc.nextInt();
        // int newBit=sc.nextInt();
        // System.out.println(getIthBit(n, i));
        // System.out.println(setIthBit(n, i));
        // System.out.println(clearIthBit(n, i));
        // System.out.println(updateIthBit(n, i, newBit));
        // System.out.println(clearLastIthBits(n, i));
        // int j=sc.nextInt();
        // System.out.println(clearBitsInRange(n, i, j));
        // System.out.println(powerOfTwo(n));
        // System.out.println(countSetBits(n));
        System.out.println(fastExpo(a, n));
    }

}
