public class PatternsAdvanced 
{
    public static void hollow_rectangle(int totRows,int totCols)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=totCols;j++)
            {
                if(i==1 || i==totRows || j==1 || j==totCols )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramid(int r)
    {
        for(int lines=1;lines<=r;lines++)
        {
            
            for(int spaces=1;spaces<=r-lines;spaces++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=lines;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedNumberPattern(int rows)
    {
        int v=0;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-v;j++)
            {
                System.out.print(j+" ");
            }
            v++;
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int totRows)
    {
        for(int i=1;i<=totRows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i-j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterflyPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        // hollow_rectangle(4, 5);
        // invertedHalfPyramid(4);
        // invertedNumberPattern(5);
        // zeroOneTriangle(5);
        // butterflyPattern(7);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamond(3);
    }
}
