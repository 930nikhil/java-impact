import java.util.*;
class Array6
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int j=0,c=0;
        for(int i=0;i<n1;i++)
        {
            
            if(n1==n2)
            {
                
                if(arr1[i]>=arr2[i])
                {
                    c=1;
                }
                else
                {
                    c=0;
                    break;
                }
            }
        }
        if(c==1)
            {
                System.out.println("is compitable");
            }
        else
            {
                System.out.println("not compitable");
            }
    }
}