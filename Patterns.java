import java.util.*;
public class Patterns 
{
    public static void main(String args[])
    {
        //Star-pyramid
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int l=sc.nextInt();
        for(int line=1;line<=l;line++)
        {
            for(int star=1;star<=line;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Inverted Star-pyramid
        System.out.println("Enter the number of lines:");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            for(int s=x;s>=i;s--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Number-pattern
        int a=sc.nextInt();
        for(int m=1;m<=a;m++)
        {
            // int c=1;
            for(int n=1;n<=m;n++)
            {
                System.out.print(n);
                // c++;
            }
            System.out.println();
        }
        //Character-pattern
        System.out.println("Enter the number of lines:");
        int d=sc.nextInt();
        char ch='a';
        for(int e=1;e<=d;e++)
        {
            for(int f=1;f<=e;f++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("Enter the number of lines:");
        int d1=sc.nextInt();
        for(int e=1;e<=d;e++)
        {
            char ch1='A';
            for(int f=1;f<=e;f++)
            {
                System.out.print(ch1);
                ch1++;
            }
            System.out.println();
        }
    }
}
