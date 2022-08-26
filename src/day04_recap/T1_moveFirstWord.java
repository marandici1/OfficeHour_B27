package day04_recap;

public class T1_moveFirstWord {
    public static void main(String[] args) {
        String sentence = "Java is a fun language";
        //I need to get first word
        //I need to find my " " indexOf()
        int indexOffirstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, indexOffirstSpace);
        System.out.println("firstWord = " + firstWord);
        String secondPart = sentence.substring(indexOffirstSpace + 1);
        System.out.println(secondPart+ " "+ firstWord);
    }
}
