import java.util.*;
class Sum
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int s=0,sum=0;
        while(num>0)
        {
            int r=num%10;
            s=s+r;
            
            num=num/10;
        }
        System.out.println(sum);
    }
}