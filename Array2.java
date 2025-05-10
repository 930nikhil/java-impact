import java.util.*;
class Array2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                s=arr[0];
            }
            System.out.println(s);
            s=s-arr[i];
        }
        System.out.println(s);
    }
}