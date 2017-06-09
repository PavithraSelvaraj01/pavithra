import java.io.*;
import java.util.*;
public class Vowel
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
char n=scan.next().charAt(0);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
{
    System.out.println("vowel");
}
else
{
    System.out.println("consonant");
}
}
}
