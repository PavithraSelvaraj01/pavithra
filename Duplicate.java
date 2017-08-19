import java.io.*;
import java.util.*;
public class Duplicate
{
        public static void main(String args[]) 
        {   
            Scanner s=new Scanner(System.in);
            int n;
            int size=s.nextInt();
            int array[]=new int[size];
            for(int i=0;i<size;i++)
            {
                array[i]=s.nextInt();
            }
            for(i=0;i<size;i++)
             {
                for (int j = i + 1; j < size; j++) 
                {
                    if (array[i] == array[j]) 
                    {
                       while (j < (size) - 1) 
                        {
                            array[j] = array[j - 1];// shifting the values
                            j++;
                        }   
                       size--;
                    }
                }
            }
            System.out.println("Size After deletion: " + size);
            for (int k = 0; k < size; k++) 
            {
                System.out.println(array[k]); 
            }
    }
}





