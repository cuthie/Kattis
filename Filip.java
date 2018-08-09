import java.io.*;
import java.util.*;

class Filip
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=a/100;
        int a2=(a/10)%10;
        int a3=a%10;
        int b1=b/100;
        int b2=(b/10)%10;
        int b3=b%10;
        int a_r=((a3*100)+(a2*10)+a1);
        int b_r=((b3*100)+(b2*10)+b1);
        if(a_r>=b_r)
        {
            System.out.println(a_r);
        }
        else
        {
            System.out.println(b_r);
        }
    }
}