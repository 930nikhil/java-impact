import java.util.*;
class Day2
{
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int num=sc.nextInt();
        int h = num / 100;
        int t = (num / 10) % 10;
        int u = num % 10;
        int rev = u * 100 + t * 10 + h;
        System.out.println("rev no."+ rev);
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total wealth");
        int total=sc.nextInt();
        System.out.println("Enter bens share in%");
        int ben=sc.nextInt();
        System.out.println("Enter black shsre in%");
        int black=sc.nextInt();
        int remaining=(100-ben-black);
        int ben_share=(ben*total)/100;
        int black_share=(black*(total-ben_share))/100;
        int rem=total-ben_share-black_share;
        
        System.out.println("ben"+ben_share);
        System.out.println("black"+black_share);
        System.out.println("Equal Share"+rem/3 );
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a  number");
        int num=sc.nextInt();
        if(num>9 && num<100)
        {
            if(num>20)
            {
                System.out.println("GREATER THAN 20");
                if(num%2==0)
                {
                    System.out.println("EVEN NO.");
                }
                else
                {
                    System.out.println("odd no.");
                }
            }
            else
            {
                System.out.println("NOT GREATER THAN 20");
            }
        }
        else
        {
            System.out.println("invalid input");
        }
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a three number");
        int num=sc.nextInt();
        int t;
        if(num>99 && num<1000)
        {
            t=(num / 10) % 10;
            if(t%3==0)
            {
                System.out.println("trendy no.");
            }
            else
            {
                System.out.println("not a trendy no.");
            }
        }
        else
        {
            System.out.println("invalid input");
        }
    }*/
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter month number between 1 to 12");
        int n=sc.nextInt();
        System.out.println("Enter room rent");
        int rrent=sc.nextInt();
        int temp=rrent;
        System.out.println("Enter days of stay");   
        int stay=sc.nextInt();
        int terrif,new_rrent;
        if(n==1||n==2||n==3||n==7||n==8||n==9||n==10)
        {
            terrif= rrent*stay;
            System.out.println("TOTAL COST= "+terrif);
        }
        else if(n==4||n==5||n==6||n==11||n==12)
        {
            new_rrent=rrent+(temp*20)/100;
            terrif= new_rrent*stay;
            System.out.println("TOTAL COST= "+terrif);
        }
        else
        {
            System.out.println("invalid");
        }
    }
}