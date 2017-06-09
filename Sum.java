import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int i,sum=0;
for(i=1;i<=N;i++)
{
    sum=sum+i;
}
System.out.println(sum);
}
}
