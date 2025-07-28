import java.util.*;
public class ConditionalStatement 
{
    public static void main(String args[])
    {   //Age if-else
        
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else if(age >=13 && age<18)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Not Adult");
        }
        //Largest of 2 numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b)
        {
            System.out.println("a is Larger");
        }
        else
        {
            System.out.println("b is Larger");
        }
        //Even-Odd 
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        //else-if
        int age1=sc.nextInt();
        if(age1>=18)
        {
            System.out.println("Adult");
        }
        else if(age1>=13 && age1<18)
        {
            System.out.println("Teenager");
        }
        else 
        {
            System.out.println("Child");
        }
        //Tax Calculator
        int income=sc.nextInt();
        int tax;
        if(income<=500000)
        {
            tax=0;
        }
        else if(income>=500000 && income<1000000)
        {
            tax=(int)(income*0.2);
        }
        else 
        {
            tax=(int)(income*0.3);
        }
        System.out.println("Tax:"+tax);
        //Largest of 3 numbers
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if((x>=y) && (x>=z))
        {
            System.out.println("Larges is x:"+x);
        }
        else if(y>=z)
        {
            System.out.println("Largest is y:"+y);
        }
        else 
        {
            System.out.println("Largest is z:"+z);
        }
        //Ternary operator
        int num=sc.nextInt();
        String s=((num%2)==0) ? "Even" : "Odd";
        System.out.println(s);
        //Ternary-example
        int marks=sc.nextInt();
        String result=(marks>=33) ? "PASS" : "FAIL";
        System.out.println(result);
        //Switch statement
        int number=sc.nextInt();
        switch(number)
        {
            case 1: System.out.println("Palak Paneer");
                    break;
            case 2: System.out.println("Baingan ka Barta");
                    break;
            case 3: System.out.println("Chapati");
                    break;
            default: System.out.println("My twin made me eat uncooked mushroom");
        }
        //Calculator
        System.out.println("Enter Operand 1:");
        int op1=sc.nextInt();
        System.out.println("Enter Operand 2:");
        int op2=sc.nextInt();
        System.out.println("Enter Operator:");
        char operator=sc.next().charAt(0);
        int result1=0;
        switch(operator)
        {
            case '+' : result1=op1+op2;
                        break;
            case '-' : if(op1>op2)
                        {
                            result1=op1-op2;
                        }
                        else
                        {
                            result1=op2-op1;
                        }
                        break;
            case '*' : result1=op1*op2;
                        break;
            case '/' : result1=op1/op2;
                        break;
            case '%' : result1=op1%op2;
                        break;
            default: System.out.println("Invalid Operator");
        }
        System.out.println("Result:"+result1);
        //Assignment Qs-1
        int usernum=sc.nextInt();
        if(usernum>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        //Assignment Qs-2
        double temp=sc.nextDouble();
        if(temp>100.0)
        {
            System.out.println("Fever");
        }
        else
        {
            System.out.println("No Fever");
        }
        //Assignment Qs-3
        int weekday=sc.nextInt();
        switch(weekday)
        {
            case 1 : System.out.println("Sunday");
                     break;
            case 2 : System.out.println("Monday");
                     break;
            case 3 : System.out.println("Tuesday");
                     break;
            case 4 : System.out.println("Wednesday");
                     break;
            case 5 : System.out.println("Thursday");
                     break;
            case 6 : System.out.println("Friday");
                     break;
            case 7 : System.out.println("Saturday");
                     break;
            default: System.out.println("Invalid Input");
        }
        //Assignment Qs-5
        int year=sc.nextInt();
        if(((year%4)==0) && (((year%100)!=0 ) || (year%400==0)))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
