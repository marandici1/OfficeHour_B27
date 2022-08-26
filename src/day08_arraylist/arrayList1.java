package day08_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        //get the words one by one
        ArrayList<String> empty = new ArrayList<>();
        for (String s : list) {
            //check words if its length smaller than or equal 4
            boolean result=  checkWordLength(s);
            //put the word another empty list if it is true

            if (result){
                empty.add(s);
            }

        }
        System.out.println("empty = " + empty);
    }

    private static boolean checkWordLength(String s) {
      /*  if (s.length()<=4) {
            return true;
        }
        else {
            return false;
        }

       */
        return  s.length()<=4;

    }
}
