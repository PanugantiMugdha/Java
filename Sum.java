
import java.util.*;
public class Sum {
    public static void main(String args[])
    {   //sum of 2 numbers
        int a=10;
        int b=5;
        int sum=a+b;
        System.out.println(sum);
        //Data Types
        Scanner sc=new Scanner(System.in);
        String ex=sc.next();
        System.out.println(ex);
        String exp=sc.nextLine();
        System.out.println(exp);
        int n=sc.nextInt();
        System.out.println(n);
        long l=sc.nextLong();
        System.out.println(l);
        float f=sc.nextFloat();
        System.out.println(f);
        double d=sc.nextDouble();
        System.out.println(d);
        short s=sc.nextShort();
        System.out.println(s);
        byte by=sc.nextByte();
        System.out.println(by);
        //sum of 2 numbers using user input
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sumoftwo=num1+num2;
        System.out.println(sumoftwo);
        //product of 2 numbers
        int pr1=sc.nextInt();
        int pr2=sc.nextInt();
        int product=pr1*pr2;
        System.out.println(product);
        //Area of a circle
        double r=sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println(area);
        float r1=sc.nextFloat();
        float area1 = 3.14f * r1 * r1;
        System.out.println(area1);
        //Type Conversion
        int a3=5;
        long b3=a;
        System.out.println(b3);
        //Type Casting
        long a1=5;
        int b1=(int)a1;
        System.out.println(b1);
        //Type Promotion
        byte b4=5;
        short s4=10;
        char c='a';
        int sum4=b+s+c;
        byte sum5=(byte)(b4+s4+c);
        System.out.println(sum5);
        float f1 =9.5f;
        long l1=10;
        double d1=1.5;
        double sum1=f1+l1+d1;
        System.out.println(sum1);
        //Practice Qns
        //Avg of 3 numbers
        int a8=sc.nextInt();
        int b8=sc.nextInt();
        int c8=sc.nextInt();
        int avg=(a8+b8+c8)/3;
        System.out.println(avg);
        //Area of square
        int side=sc.nextInt();
        int area2=side*side;
        System.out.println(area2);
        //Bill
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=pencil+pen+eraser;
        System.out.println(bill);
        float nt=bill+(0.18f*bill);
        System.out.println(nt);
    }
    
}
