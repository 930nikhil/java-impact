import java.util.*;
class Day1
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        int d1,d2;
        System.out.println("enter 4 digit number");
        int num= sc.nextInt();
        int n= num;
        if(num>999 && num<10000)
        {
            int sum;
            
            d1=n%10;
            d2=n/1000;
            
            sum= d1+d2;
            
            System.out.println("sum"+sum);
            if(sum==4)
            {
                System.out.println("mission passed");
            }
            else
            {
                System.out.println("mission failed");
            }
        }
        else
        {
            System.out.println("enter valid 4 digit number");
        }
    }
}