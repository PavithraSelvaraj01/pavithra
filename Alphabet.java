import java.io.*;
import java.util.*;
public class Alphabet
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
char n=scan.next().charAt(0);
if(n>='a'&&n<='z'||n>='A'&&n<='Z')
{
    System.out.println("alphabet");
}
else
{
    System.out.println("not an alphabet");
}
}
}
