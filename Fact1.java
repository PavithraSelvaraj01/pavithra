import java.io.*;
import java.util.*;
public class Fact1
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=1;
int i;
if(n>0)
{
    for(i=1;i<=n;i++)
    {
    fact=fact*i;
}
System.out.println(fact);
}
else
{
    System.out.println("zero");
}
}
}
