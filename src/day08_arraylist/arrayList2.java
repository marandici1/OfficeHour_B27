package day08_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList2 {
    public static void main(String[] args) {

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPasswords = new ArrayList<>();

        for(String password : passwords){
            String hiddenPassword = hidePassword(password, '*');
            hiddenPasswords.add(hiddenPassword);

        }
        System.out.println("hiddenPasswords =" + hiddenPasswords);

    }
    private static String hidePassword (String password, char c){
        String hiddenPassword="";

        for (int i = 0; i < password.length(); i++) {
            hiddenPassword+=c;
        }
        return hiddenPassword;

    }
}
