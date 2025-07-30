import java.util.*;
public class Strings 
{ 
    //Function to print each letter of a string
    public static void printLetters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void palindromeString(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    public static float shortestPath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='W')
            {
                x--;
            }
            else
            {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static String substring(String str,int si,int ei)
    {
        String substr="";
        for(int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str)
    {
        StringBuffer sb=new StringBuffer("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compression(String str) {
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if (count > 1) {
            sb.append(count);
        }
    }
    return sb.toString();
}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // String s=sc.next();
        // System.out.println(s);
        // String s1=sc.nextLine();
        // System.out.println(s1);
        // String s3="Mugdha";
        // System.out.println(s3.length());
        // String s4="Snigdha";
        // String s5="Panuganti";
        // String fullName=s4+ " " +s5;
        // System.out.println("My name is "+fullName);
        // printLetters("Mugdha Panuganti");
        // String s=sc.nextLine();
        // palindromeString(s);
        // String path="WNEENESENNN";
        // System.out.println(shortestPath(path));
        //String equals ane ==
        // String s1="Tony";
        // String s2="Tony";
        // String s3=new String("Tony");
        // if(s1==s2)
        // {
        //     System.out.println("Strings are equal");
        // }
        // else
        // {
        //     System.out.println("Strings are not equal");
        // }
        // if(s1==s3)
        // {
        //     System.out.println("Strings are equal");
        // }
        // else
        // {
        //     System.out.println("Strings are not equal");
        // }
        // System.out.println(s1.equals(s3));
        // String str="HelloWorld";
        // System.out.println(substring(str, 0, 5));
        //STRING BUILDER
        // StringBuilder sb=new StringBuilder("Mugdha");
        // for(char ch='a';ch<='z';ch++)
        // {
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // String str="hello World  ";
        // System.out.println(toUpperCase(str));
        String str="aaabbcccdd";
        System.out.println(compression(str));
    }
}
