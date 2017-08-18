import java.io.*;
import java.util.*;
public class SortArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        int b[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("Sorted Array");
        }
        else
        {
            System.out.println("Unsorted Array");
        }
    }
}
