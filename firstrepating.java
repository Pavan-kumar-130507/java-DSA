 import java.util.*;
 public class SetExplain{
     public static void main (String[] args) {
          int[]arr={1,2,3,1,3,4,5,2,1,6};
          HashSet<Integer>h=new HashSet<>();
          for(int el:arr){
              h.add(el);
          }
          System.out.print(h);
     }
 }