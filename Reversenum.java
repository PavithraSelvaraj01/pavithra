import java.io.*;
import java.util.*;
public class Reversenum
{
    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
        int rem=0;
        while(n>0)
        {
            rem=rem*10+n%10;
            n=n/10;
        }
        System.out.println(rem);
    }
}

