import java.io.*;
import java.util.*;
public class Leap
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       if(n%4==0)
       {
           System.out.println("Leap year");
       }
       else
       {
           System.out.println("Not aLeap year"); 
       }
    }

}
