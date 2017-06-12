import java.io.*;
import java.util.*;
public class Power
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       int b=scan.nextInt();
       int p=scan.nextInt();
       if(b==0)
       {
        System.out.println("0");   
       }
       if(p==0)
       {
           System.out.println("1"); 
       }
       if(p==1)
       {
           System.out.println(b); 
       }
       int t=b;
       if(p>1)
       {
       for(int i=2;i<=p;i++)
       {
         b=b*t; 
       }
       System.out.println(b);
    }
    }    
}
