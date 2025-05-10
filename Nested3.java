import java.util.*;
class Nested3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1=n*2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n*2);j++)
            {
                if(j<=i)
                {
                    System.out.print("*");
                }
                else if((j>i) && (j>=n1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" "); 
                }
                
            }
            System.out.println();
            n1=n1-1;
        }
    }
}