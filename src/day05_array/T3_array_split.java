package day05_array;

import java.util.Arrays;

public class T3_array_split {
    public static void main(String[] args) {
        //01234
        String brand = "Gucci";

        //if you want to split your string into the chars we need to use toCharArray()
        char[] chars = brand.toCharArray();

        System.out.println("chars[3] = " + chars[3]); //c
        System.out.println("chars[4] = " + chars[4]); //i

        //if you want to split your string into the String we need to use split()

        String[] charsString = brand.split("");

        String sentence = "I like playing Football games";
        String[] words = sentence.split(" ");
        String sentence1 = "I-like-playing-Football-games";
        String[] words1 = sentence.split("-");

        String str = "abcbabcbdbd";
        //a c a c d d

        String[] bs = str.split("b");
        System.out.println("Arrays.toString(bs) = " + Arrays.toString(bs));
        String str1 = "abcdabcdabca";

        //d d a

        String[] abcs = str1.split("abc");

        str.toCharArray();

//assign short cut
        // Mac: option+enter
        //Windows:alt+enter
    }
}
