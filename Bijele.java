import java.io.*;
import java.util.*;

class Bijele
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int[] b=new int[]{1,1,2,2,2,8};
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
            System.out.print(b[i]-a[i]+" ");
        }
    }
}