import java.io.*;
import java.util.*;
class Player40
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>9)
        {
            while(n>0)
            {
                int k=n%10;
                sum=sum+k;
                n=n/10;
            }
        }
        if(sum>9)
        {
            String k=String.valueOf(sum);
            StringBuffer t=new StringBuffer(k).reverse();
            String l=String.valueOf(t);
            if(k.equals(l))
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not a Palindrome");
            }
        }
    }
}
