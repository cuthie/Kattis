import java.util.*;
import java.math.*;

class Ladder
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int h=inp.nextInt();
        int v=inp.nextInt();
        double x;
        double r=Math.toRadians((double)v);
        x=(h/(Math.sin(r)));
        System.out.println((int)Math.ceil(x));
    }
}