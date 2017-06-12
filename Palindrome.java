import java.io.*;
import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int k=n;
        int rem=0;
        if(n>9)
        {
        while(n>0)
            {
            rem=rem*10+n%10;
            n=n/10;
            }
        
        if(k==rem)
        {
        System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
            else
            {
                System.out.println("data inadequate");
            }
    }
}

