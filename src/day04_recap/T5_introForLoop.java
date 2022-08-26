package day04_recap;

public class T5_introForLoop {
    public static void main(String[] args) {
        // - Print out Cybertek's characters one by one

        String str="Cybertek";

        char firstCh = str.charAt(0);
        char secondCh = str.charAt(1);
        char thirdCh = str.charAt(2);
        char fourthCh = str.charAt(3);
        //8 -1=7
        char lastCh=str.charAt(str.length()-1);
        //                       0           //
        // for(int i =startingPoint;i<endingPoint;i=i+1) {} //syntax
        //                     i <= str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            System.out.println(i+1 +". ch = " + ch);
        }
    }
}
