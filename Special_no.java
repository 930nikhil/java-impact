import java.util.*;
class Special_no
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
            int d1=num/10;
            int d2=num%10;
            int p= d1*d2;
            int s= d1+d2;
            int sum=p+s;
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}