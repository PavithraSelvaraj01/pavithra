import java.io.*;
import java.util.*;
public class Fact
{
public static void main()
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=0;
while(n!=0)
{
fact=n*(n-1);
n--;
}
system.out.println(fact);
}
}
