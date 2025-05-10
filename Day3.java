import java.util.*;
class Day3
{
    //Special no.
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int num=i;
            int o=num/10;
            int t=num%10;
            int p= o*t;
            int s= o+t;
            int sum=p+s;
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}