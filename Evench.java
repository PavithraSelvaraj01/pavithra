import java.io.*;
import java.util.*;
public class Evench
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int n=s.length();
char[] c=s.toCharArray();
for(int i=0;i<n;i+=2)
{
  char t=c[i];
  c[i]=c[i+1];
  c[i+1]=t;
}
System.out.println(c);
}
}

