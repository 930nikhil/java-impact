import java.util.*;
class Treasure
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st box no.");
        int a=sc.nextInt();
        System.out.println("Enter 2nd box no.");
        int b=sc.nextInt();
        System.out.println("Enter 3rd box no.");
        int c=sc.nextInt();
        if((a>b && a<c)||(a>c && a<b))
        {
            System.out.println("treasure is in box no. "+a);
            System.out.println("code to open box "+findHCF(findHCF(a,b),c));
        }
        if((b>a && b<c)||(b>c && b<a))
        {
            System.out.println("treasure is in box no. "+b);
            System.out.println("code to open box "+findHCF(findHCF(a,b),c));
        }
        if((c>a && c<b)||(c>b && c<a))
        {
            System.out.println("treasure is in box no. "+c);
            System.out.println("code to open box "+findHCF(findHCF(a,b),c));
        }
    }
    int findHCF(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return findHCF(b, a % b);
    }
}