import java.util.*;
class Day21
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            if((n>=2 && n<=5)||(n>20))
            {
                System.out.println("not weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("weird");
            }
        }
        else
        {
            System.out.println("weird");
        }
    }
}