import java.util.*;
class Array4
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        int c=0,c1=0,c2=0;
        
        for(int i=0;i<n1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=arr[j];i<n1;i++)
        {
            c=0;
            if(arr[i]==arr[j])
            {
                c++;
            }
            if(c==1)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        System.out.println(c1+c2);
    }
}