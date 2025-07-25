
import java.util.*;

public class Loops 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //While Loop
        int counter=1;
        while(counter<=5)
        {
            System.out.println("Hello Mugdha");
            counter++;
        }
        System.out.println("Printed 10x");
        //Print numbers from 1-10
        int counter1=1;
        while(counter1<=10)
        {
            // System.out.println(counter1);
            System.out.print(counter1+" ");
            counter1++;
        }
        System.out.println();
        //Print numbers from 1-n
        int num=sc.nextInt();
        int counter3=1;
        while(counter3<=num)
        {
            System.out.println(counter3);
            counter3++;
        }
        //Sum of first n natural numbers
        int n=sc.nextInt();
        int count=1;
        int sum=0;
        while(count<=n)
        {
            sum=sum+count;
            count++;
        }
        System.out.println("Sum:"+sum);
        //For loop
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hello Snigdha");
        }
        //Print a square pattern
        for(int j=1;j<=4;j++)
        {
            System.out.println("****");
        }
        //same in while loop
        int line=1;
        while(line<=4)
        {
            System.out.println("@@@@");
            line++;
        }
        //print reverse of a number
        int numb=sc.nextInt();
        int reverse=0;
        while(numb>0)
        {
            int lastDigit=numb%10;
            // reverse=(reverse*10)+lastDigit;
            numb=numb/10;
            System.out.print(lastDigit);

        }
        System.out.println();
        // System.out.println("Reverse:"+reverse);
        //Reverse the original number
        int original=sc.nextInt();
        int rev=0;
        while(original>0)
        {
            int ld=original%10;
            rev=(rev*10)+ld;
            original=original/10;
        }
        System.out.println("Reverse:"+rev);
        //do-while loop
        int c=1;
        do
        {
            System.out.println("Hello");
            c++;
        }while(c<=5);
        //break statement
        for(int k=1;k<=10;k++)
        {
            if(k==3)
            {
                break;
            }
            System.out.println(k);
        }
        System.out.println("I am out of the loop");
        //Print until number is multiple of 10
        do{
            System.out.println("Enter number:");
            int nu=sc.nextInt();
            if(nu%10==0)
            {
                break;
            }
            System.out.println(nu);
        }while(true);
        while(true)
        {
            System.out.print("Enter number:");
            int nu=sc.nextInt();
            if(nu%10==0)
            {
                break;
            }
            System.out.println(nu);
        }
        //Continue statement
        for(int k=1;k<=10;k++)
        {
            if(k==3)
            {
                continue;
            }
            System.out.println(k);
        }
        //continue qs
        while(true)
        {
            System.out.print("Enter number:");
            int nu=sc.nextInt();
            if(nu%10==0)
            {
                continue;
            }
            System.out.println(nu);
        }
        //prime number
        int numbe=sc.nextInt();
        boolean isPrime=true;
        if(numbe==2)
        {
            System.out.println("The number is prime");
        }
        else
        {
            for(int x=2;x<=numbe-1;x++)
            {
                if(numbe%x==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime==true)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
        //Optimized prime number
        int numberr=sc.nextInt();
        // boolean isPrime=true;
        if(numberr==2)
        {
            System.out.println("The number is prime");
        }
        else
        {
            for(int x=2;x<=Math.sqrt(numberr);x++)
            {
                if(numberr%x==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime==true)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
        //Assignment Qs-2
        int choice;
        do
        {
            System.out.println("Enter the number:");
            int nm=sc.nextInt();
            int even=0,odd=0;
            if(nm%2==0)
            {
                even+=nm;
            }
            else
            {
                odd+=nm;
            }
            System.out.println("Even:"+even);
            System.out.println("Odd:"+odd);
            System.out.println("To continue enter 1 else 0");
            choice=sc.nextInt();
        }while(choice==1);
        //Assignment Qs-3
        int factorial=sc.nextInt();
        int fact=1;
        for(int y=factorial;y>=1;y--)
        {
            fact*=y;
        }
        System.out.println("Factorial:"+fact);
        //Assignment Qs-4
        int s=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(s+"x"+i+"="+(s*i));
        }
    }
}
