import java.io.*;
import java.util.*;
public class Appr {

	public static void main(String[] args)
  {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n1=s.nextInt();
		int n2=s.nextInt();
		String res1=" ";
		String res2=" ";
		for(int i=1;i<=n1;i++)
		{
		 res1=res1+str1;
		}
		for(int i=1;i<=n2;i++)
		{
		 res2=res2+str2;
		}
		System.out.println(res1+res2);
	}

}
