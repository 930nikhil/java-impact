import java.util.*;
class Array7
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter location of array");
        int l=sc.nextInt();
        System.out.println("Enter new element of array");
        int e=sc.nextInt();
        int arr1[]=new int[n+1];
        System.out.println("New Array");
        for (int i = 0, j = 0; i < arr1.length; i++)
        {
            if (i == l-1) 
            {
                arr1[i] = e;
            }
            else
            {
                arr1[i] = arr[j++];
            }
            System.out.println(arr1[i]);
        }
        
    }
}