package day08_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList3 {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("123", "34", "513"));

        ArrayList<Integer> results = new ArrayList<>();
        //get the string one by one
        for (String number : numbers) {
            //get the string value of integer
            Integer sum = getValue(number);
            //put the sum inside the Integer list
            results.add(sum);
        }
        System.out.println("results = " + results);


    }

    private static Integer getValue(String number) {
        //"123"
        int sum=0;
        for (int i = 0; i < number.length(); i++) {
            //need to get character one by one
            String c =""+ number.charAt(i);
            //convert to String to integer
            Integer integer = Integer.valueOf(c);
            //need to add this value inside the sum
            sum+=integer;
        }
        return sum;

    }
}
