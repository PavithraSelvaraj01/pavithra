import java.io.*;
import java.util.*;
public class Sqrcub
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                a[i]=a[i]*a[i];
            }
            else
            {
                a[i]=a[i]*a[i]*a[i];
            }
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
