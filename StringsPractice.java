
import java.util.Arrays;
import java.util.Scanner;

public class StringsPractice 
{
    public static int countVowel(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
            {
                count++;
            }
        }
        return count;
    }
    public static void angrams(String str1, String str2)
    {
        int count=0;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                for(int j=0;j<str2.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if(count==str1.length())
            {
                System.out.println("Angrams");
            }
            else
            {
                System.out.println("Not Angrams");
            }
        }
    }
    public static void angramUpdated(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] str1charr=str1.toCharArray();
            char[] str2charr=str2.toCharArray();
            Arrays.sort(str1charr);
            Arrays.sort(str2charr);
            boolean result=Arrays.equals(str1charr,str2charr);
            if(result)
            {
                System.out.println("Angram");
            }
            else
            {
                System.out.println("Not Angrams");
            }
        }
        else
        {
            System.out.println("Not Angrams");
        } 
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // System.out.println(countVowel(str));
        String str1=sc.next();
        String str2=sc.next();
        // angrams(str1, str2);
        angramUpdated(str1, str2);
    }
}
