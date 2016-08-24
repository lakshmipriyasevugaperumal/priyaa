import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner in=new Scanner(System.in);
        int t,i;
        int array[]=new int[t];
        System.out.println(t);
        for(i=0;i<t;i++)
        {
            array[i]=in.nextInt();
        }
    int k=in.nextInt();
      Arrays.sort(array);
        for(i=0;i<t-k;i++)
        {
            System.out.println(array[i]);
        }
    }
}
