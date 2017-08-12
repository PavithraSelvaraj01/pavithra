import java.io.*;
import java.util.*;
public class Fibo
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1,t=0;
      System.out.print(a+" "+b);
      for(int i=2;i<n;i++)
      {
          t=a+b;
          System.out.print(" "+t);
          a=b;
          b=t;
          
      }
    }
}
