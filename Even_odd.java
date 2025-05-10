import java.util.*;
class Even_odd
{
    //Special no.
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int num=sc.nextInt();
        
        int seve=0, sodd=0;
        while(num>0)
        {
            int r=num%10;
            if(r%2==0)
            {
                seve= seve+r;
            }
            else
            {
                 sodd= sodd+r;
            }
            num=num/10;
        }
        System.out.println("even sum "+seve);
        System.out.println("odd sum "+sodd);
    }
}

