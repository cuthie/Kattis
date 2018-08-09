import java.io.*;
import java.util.*;

class Hiss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean flag=false;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)=='s')
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("hiss");
        }
        else
        {
            System.out.println("no hiss");
        }
    }
}