import  java.io.*;
import java.util.*;
public class Evenint
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int min=s.nextInt();
        int max=s.nextInt();
        for(int i=min;i<=max;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
