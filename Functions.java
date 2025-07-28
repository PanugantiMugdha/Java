import java.util.*;
public class Functions 
{
    public static int calculateSum(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    public static int sum(int a,int b )
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static float sum(float a, float b)
    {
        return a+b;
    }
    public static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static int product(int a,int b)
    {
        int p=a*b;
        // System.out.println("Product:"+p);
        return p;
    }
    public static int factorial(int a)
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n, int r)
    {
        // int factn=1;
        // for(int i=1;i<=n;i++)
        // {
        //     factn=factn*i;
        // }
        int factn=factorial(n);
        // int factr=1;
        // for(int i=1;i<=r;i++)
        // {
        //     factr=factr*i;
        // }
        int factr=factorial(r);
        int fact=1;
        for(int i=1;i<=n-r;i++)
        {
            fact=fact*i;
        }
        int bc=(factn)/(factr*fact);
        return bc;



    }
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        
        for(int i=2;i<=(n-1);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeOptimized(int n)
    {
        if(n==2)
        {
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binToDec(int binNum)
    {
        int pow=0;
        int decNum=0;
        int num=binNum;
        while(binNum>0)
        {
            int lastDigit=binNum%10;
            decNum=decNum+(int)(lastDigit*Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("The Decimal of the Binary Number "+num+" is "+decNum);
    }
    public static void decToBin(int decNum)
    {
        int pow=0;
        int binNum=0;
        int num=decNum;
        while(decNum>0)
        {
            int rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("The Binary Number of Decimal Number is "+ num +" is "+binNum);
    }
    public static double  avgOfThree(double  a,double  b,double  c)
    {
        return (a+b+c)/3;
    }
    public static boolean  isEven(int e)
    {
        if(e%2==0)
        {
            return true;
        }
        return false;
    }
    public static void palindrome(int p)
    {
        int original=p;
        int palin=0;
        while(p>0)
        {
            int ld=p%10;
            palin=(palin*10)+ld;
            p=p/10;
        }
        if(palin==original)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    public static int sumOfDigitsInInteger(int n)
    {
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // double a=sc.nextDouble();
        // double b=sc.nextDouble();
        // double c=sc.nextDouble();
        // int sum=calculateSum(a, b);
        // System.out.println("Sum:"+sum);
        // swap(a, b);
        // int p=product(a, b);
        // System.out.println("Product:"+p);
        // int fact=factorial(a);
        // System.out.println("Factorial:"+fact);
        // int n=sc.nextInt();
        // int r=sc.nextInt();
        // int b=binomialCoefficient(n, r);
        // System.out.println("Binomial Coefficient:"+b);
        // System.out.println(sum(5, 10));
        // System.out.println(sum(10.5f,4.5f));
        // System.out.println(sum(5,10,15));
        // System.out.println(isPrime(12));
        // System.out.println(isPrimeOptimized(13));
        // primeInRange(15);
        // binToDec(1000);
        // decToBin(5);
        // System.out.println("Avg of 3 numbers:"+avgOfThree(a, b, c));
        // System.out.println(isEven(2));
        // int p=sc.nextInt();
        // palindrome(p);
        int n=sc.nextInt();
        System.out.println("Sum:"+sumOfDigitsInInteger(n));
    }
}
