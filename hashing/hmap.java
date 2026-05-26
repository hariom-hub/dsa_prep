import java.util.*;

public class hmap {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();

          HashMap<Character,Integer>map = new HashMap<>();

          for(int i=0;i<str.length();i++){
               map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
          }

          int query = sc.nextInt();

          while(query-->0){
               char ch = sc.next().charAt(0);
               try{
                    System.out.println(map.get(ch));
               }catch(NullPointerException n){
                    System.out.println(0);
               }
          }
     }
}