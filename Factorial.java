import java.io.*;
import java.util.*;
public class Factorial
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=1;
while(n!=0)
{
fact=fact*n;
n--;
}
System.out.println(fact);
}
}
