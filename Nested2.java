import java.util.*;
class Nested2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=(n-i))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}