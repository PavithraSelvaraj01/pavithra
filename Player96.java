import java.io.*;
import java.util.*;
class Player96
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=s.charAt(0);
        char d=s.charAt(s.length()-1);
        int e=Character.getNumericValue(c);
        int f=Character.getNumericValue(d);
        System.out.print(e+f);
    }
}
