import java.util.*;

class Tri{
    public static void main(String []args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        if((a+b)==c){
            System.out.println(a+"+"+b+"="+c);
        }else if((a-b)==c){
            System.out.println(a+"-"+b+"="+c);
        }else if((a*b)==c){
            System.out.println(a+"*"+b+"="+c);
        }else if(a==(b-c)){
            System.out.println(a+"="+b+"-"+c);
        }else if(a==(b*c)){
            System.out.println(a+"="+b+"*"+c);
        }else if(a==(b/c) && b%c==0){
            System.out.println(a+"="+b+"/"+c);
        }
    }
}