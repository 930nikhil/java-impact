import java.util.*;
class Array5
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
        
        for (int i = 0;i <arr.length-1;i++)
        {
            for (int j = 0; j <arr.length-1-i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}