import java.util.*;
class Name
{
    /*void main()
    {
        System.out.println("nikhil");
        System.out.print("raj");
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        int a=2,b=3,c=4;
        int sum= a+b+c;
        System.out.println("Sum is ="+sum);
        System.out.println("Enter value of x");
        int x= sc.nextInt();
        System.out.println("Enter value of y");
        int y= sc.nextInt();
        int sum1= x+y;
        System.out.println("Sum is ="+sum1);
    }*/
    //Convert km to mile
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in kilometer");
        double kilometer=sc.nextDouble();
        double mile= kilometer*0.62137;
        System.out.println("Value in mile= "+mile);
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        String fn="Nikhil";
        System.out.println(fn);
        System.out.println("Enter last name");
        String ln=sc.nextLine();
        System.out.println(ln);
        System.out.println(fn.toLowerCase());
        System.out.println(fn.toUpperCase());
        System.out.println(fn.length());
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("even no.");
        }
        else
        {
            System.out.println("odd no.");
        }
    }*/
    /*void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+"is greater");
        }
        else if(a==b)
        {
            System.out.println("both are same");
        }
        else
        {
            System.out.println(b+"is greater");
        }
    }*/
    
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(i*n));
        }
        int j=1;
        while(j<=10)
        {
            System.out.println(n+"*"+j+"="+(j*n));
            j++;
        }
        //System.out.println(int fact(n));
    }
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}