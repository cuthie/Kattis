import java.util.*;

class Quad{
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        if(a>0 && b>0){
            System.out.println("1");
        }else if(a<0 && b>0){
            System.out.println("2");
        }else if(a<0 && b<0){
            System.out.println("3");
        }else if(a>0 && b<0){
            System.out.println("4");
        }
    }
}