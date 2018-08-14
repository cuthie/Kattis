import java.io.*;
import java.util.*;

class Autori
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i)=='-')
            {
                System.out.print(s.charAt(i+1));
            }
        }
    }
}