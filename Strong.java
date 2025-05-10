import java.util.*;
class Strong
{
    int fact(int n1)
    {
        int f=1;
        for(int i=1;i<=n1;i++)
        {
            f=f*i;
        }
        return f;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int n=num,s=0;
        while(n>0)
        {
            int d=n%10;
            s=s+fact(d);
            n=n/10;
        }
        
        if (s == num)
        {
                System.out.println("strong no");
        }
        else
        {
            System.out.println(" not strong no");
        }
    }
}

