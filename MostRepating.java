   import java.util.*;
 public class Main{
     public static void main (String[] args) {
          String s="aabbccddd";
          Map<Character,Integer>m=new HashMap<>();
          for (char ch:s.toCharArray()){
              m.put(ch,m.getOrDefault(ch,0)+1);
          } 
          int ans=1;
          for(Map.Entry<Character,Integer>Map:m.entrySet()){
              ans=Math.max(ans, Map.getValue());
          }
          for(Map.Entry<Character,Integer>Map:m.entrySet()){
              if(Map.getValue()==ans){
                  System.out.print(Map.getKey());
              }
          }
     }
 }