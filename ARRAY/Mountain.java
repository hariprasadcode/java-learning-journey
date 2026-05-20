
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a={10,90,0,0,0,0,0,20,80,0,0,0,0,0,30,70,0,0,40,60,50};
        int i=0;;
        for(int x: a){
            if(x!=0){
                a[i]=x;
                i++;
            }
        }
       
         while(i<=a.length-1){
        a[i]=0;
        i++;
    }
    System.out.print(Arrays.toString(a));
        
    }
   
    
}
