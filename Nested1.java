import java.util.*;
class Nested1
{
    /*
    void main()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}