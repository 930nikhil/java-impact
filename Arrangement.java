import java.util.*;
class Arrangement
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=sc.nextInt();
        System.out.println("enter the number of column");
        int c=sc.nextInt();
        System.out.println("enter seat number");
        int seat=sc.nextInt();
        if(seat<=c || seat%c==0 || seat%c==1)
        {
            System.out.println("CSE");
        }
        else
        {
            System.out.println("ECE");
        }
    }
}