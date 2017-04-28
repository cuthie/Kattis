import java.util.*;

class Grass
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        double c=inp.nextDouble();
        int l=inp.nextInt();
        double w;
        double h;
        double a=0;
        for(int i=0;i<l;i++)
        {
            w=inp.nextDouble();
            h=inp.nextDouble();
            a=a+(w*h);
        }
        System.out.println(c*a);
    }
}