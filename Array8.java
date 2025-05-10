import java.util.*;
class Array8
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] unique = new int[n];
        int o = 0;
        for(int i=0; i<n;i++)
        {
            int c=0;
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == unique[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==1)
            {
                unique[i++] = arr[i];
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(unique[i] + " ");
        }
        
    }
}