import java.io.*;
import java.util.*;
public class RemovDup
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
StringBuffer a=new StringBuffer(s.nextLine());
int i,j;
for(i=0;i<a.length();i++)
{
char ch=a.charAt(i);
for(j=i;j<a.length()-1;j++)
{
if(ch==a.charAt(j+1))
a.deleteCharAt(j+1);
}
    
}
System.out.print(a);
}
}
