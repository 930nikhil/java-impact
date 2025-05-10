import java.util.*;
class ArmStrong
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int c=0;
        int n=num;
        int n1=num;
        int newnum=0;
        while(n1>0)
        {
            int d=n1%10;
            c++;
            n1=n1/10;
        }
        while(n>0)
        {
            int d=n%10;
            int cub=(int)Math.pow(d,c);
            newnum=newnum + cub;
            n=n/10;
        }
        
        if(num==newnum)
        {
            System.out.println("Armstrong no.");
        }
        else
        {
            System.out.println("not Armstrong no.");
        }
    }
}