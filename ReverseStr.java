import java.io.*;
import java.util.*;
class ReverseStr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer();
        s.append(sc.nextLine());
        StringBuffer s1=s.reverse();
        String s2=String.valueOf(s1);
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            System.out.print(c);
            if(i<s2.length()-1)
            {
                System.out.print("-");
            }
        }
    }
}
