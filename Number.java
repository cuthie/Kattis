import java.io.*;
import java.util.*;

class Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            sc.nextLine();
            if(a[i]+b[i]==c[i]||(double)a[i]/b[i]==c[i]||a[i]*b[i]==c[i]||a[i]-b[i]==c[i])
            {
                System.out.println("Possible");
            }
            else if((double)b[i]/a[i]==c[i]||b[i]-a[i]==c[i])
            {
                System.out.println("Possible");
            }
            else
            {
                System.out.println("Impossible");
            }
        }
    }
}