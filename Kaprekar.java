import java.util.*;
class Kaprekar
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int n=num;
        int square = num * num;
        int c =0 , left,right;
        int nnum;
        while(n>0)
        {
            int d=n%10;
            c++;
            n=n/10;
        }
        int d =(int)Math.pow(10,c);
        left = square / d;
        right = square % d;
        nnum=left + right;
        if (nnum == num)
        {
                System.out.println("kaprekar");
        }
        else
        {
            System.out.println(" not kaprekar");
        }
    }
}

