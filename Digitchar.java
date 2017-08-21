import java.io.*;
import java.util.*;
public class Digitchar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=s.charAt(0);
        int a=(int)c;
        if(a>=48&&a<=57)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
        
    }
}
