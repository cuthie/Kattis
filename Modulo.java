import java.io.*;
import java.util.*;

class Modulo{
    public static void main(String[] args){
        List<Integer> a=new ArrayList<Integer>();
        int count=0;
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<10;i++){
        int q=inp.nextInt();
        if(!a.contains(q%42)){
            a.add(q%42);
            count++;
        }
    }
    System.out.println(count);
  }
}