package day04_recap;

public class T6_countChar {
    public static void main(String[] args) {

        //   1  2  3     4 5     you have six word +1
        String str = "thisHasManyWordsToFind";
        int count = 0;     //10
        for (int i = 0; i < str.length()-1; i++) {
            //8
            char first = str.charAt(i);
            //9
            char second = str.charAt(i + 1);

            if ((first >= 'a' && first <= 'z') && (second >= 'A' && second <= 'Z')) {
                count++;
            }
        }
        System.out.println("count = " + count+1);
    }

}
