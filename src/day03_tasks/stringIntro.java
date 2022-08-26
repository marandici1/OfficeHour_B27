package day03_tasks;

public class stringIntro {
    public static void main(String[] args) {
        String str1 = "Cydeo";
        String str2 = "Cydeo";
        String str3 = new String("Cydeo");
        String str4 = new String("Cydeo");
        // == for String pool
        // equals() or equalsIgnoreCase()

        System.out.println(str1==str2); //T
        System.out.println(str1==str3);// F
        System.out.println(str3==str4);// F

        System.out.println(str1.equals(str3));// T
        System.out.println(str3.equals(str4));// T
        System.out.println(str1.equals(str2));// T
    }
}
