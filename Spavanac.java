import java.util.*;
class Spavanac
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        if(b>=45){
            System.out.println(a+" "+(b-45));
        }else{
            if(a==0){
                a=23;
                b=b+15;
            }else{
                b=b+15;
                a=a-1;
            }
            System.out.println(a+" "+b);
        }
    }
}