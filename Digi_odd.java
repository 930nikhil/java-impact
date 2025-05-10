import java.util.*;
class Digi_odd
{
    //Special no.
    int sumToSingleDigit(int num) 
    {
        int sum=0;
        while (num >0) 
        {
            int r=num%10;
            sum=sum+r;
            num=num/10;
            if(sum>9 && num==0)
            {
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int result = sumToSingleDigit(number);
        System.out.println("Single digit sum: " + result);
    }
}