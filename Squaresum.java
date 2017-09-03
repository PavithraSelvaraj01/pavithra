import java.io.*;
import java.util.*;
class Squaresum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,sum=0;
        while(n>9)
        {
            while(n>0)
            {
                int k=n%10;
                p=k*k;
                sum=sum+p;
                 n=n/10;
            }
        }
        System.out.println(sum);
    }
}
