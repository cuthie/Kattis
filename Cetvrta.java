import java.util.*;
import java.math.*;

class Cetvrta
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int x[]=new int[3];
        int y[]=new int[3];
        int x_r=0;
        int y_r=0;
        for(int i=0;i<3;i++)
        {
            x[i]=inp.nextInt();
            y[i]=inp.nextInt();
        }
        for(int l:x)
        {
            x_r^=l;
        }
        for(int m:y)
        {
            y_r^=m;
        }
        System.out.println(x_r+" "+y_r);
    }
}