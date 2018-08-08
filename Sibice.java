import java.util.*;
import java.math.*;

class Sibice
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int w=inp.nextInt();
        int h=inp.nextInt();
        inp.nextLine();
        double d=Math.sqrt((double)((w*w)+(h*h)));
        for(int i=1;i<=n;i++)
        {
            int l=inp.nextInt();
            if((double)l<=d){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
            inp.nextLine();
        }
    }
}