package whee.cote;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class homework1 {
   
   public static void main(String[] args) {
      try {
         // 3번
         String read = null;
         BufferedReader br = new BufferedReader(new FileReader("D:\\stream-data.txt"));
         
         List<Integer> list = new ArrayList<Integer>();
         
         while((read = br.readLine())!= null){
            list.add(Integer.parseInt(read));
         }
         
         int result = 0;
         
         for(int i:list){
            if(i>50){
               result += i;
            }
         }
         System.out.println(result);
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}