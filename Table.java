import java.io.*;
import java.util.*;
class Table
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=1;i<=10;i++)
{
 int k=t*i;
 System.out.println(t+"*"+i+"="+k);
}
}
}
