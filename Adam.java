import java.util.*;
class Adam
{
    void main()
    {
        int rev=0, orno=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        int sqn=n*n;
        while(n>0)
        {
            int d=n%10;
            rev =rev*10+d;
            n=n/10;
        }
        int sqrev= rev*rev;
        System.out.println(rev);
        System.out.println(sqrev);
        while(sqrev>0)
        {
            int d=sqrev%10;
            orno =orno*10+d;
            sqrev=sqrev/10;
        }
        System.out.println(orno);
        if(sqn== orno)
        {
            System.out.println("adam");
        }
        else
        {
            System.out.println("not adam");
        }
    }
}