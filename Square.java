 import java.io.*;
import java.util.*;
public class Square
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int x1=scan.nextInt();
int x2=scan.nextInt();
int y1=scan.nextInt();
int y2=scan.nextInt();
int a=x1+x2;
int b=y1+y2;
int c=(a*a)+(b*b);
System.out.println(c);
}
}
