import java.util.*;
class Loop
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("enter the starting no.");
        int num=sc.nextInt();
        int n=num, c=0;
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
                c++;
                
            }
            else    
            {
                n=(3*n)+1;
                c++;
                
            }
            System.out.println(n);
            
        }
        System.out.println("Counter= "+c);
    }
}