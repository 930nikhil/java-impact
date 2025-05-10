import java.util.*;
class Acc
{
    int nearestInteger(int num, int m)
    {
        int q=num/m;
        return q;
        int m1=(num-(num*q));
        int m2=((num*(q+1))-num);
        int nearest=((num-(num*q))<((num*(q+1))-num))?(m*q):(m*(q+1));
        
    }
}