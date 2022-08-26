package day04_recap;

public class T3_searchResult {
    public static void main(String[] args) {
      String str="https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        int indexOfCSlash=str.indexOf("c/");
        String lastPart=str.substring(indexOfCSlash+2);
        System.out.println("lastPart = " + lastPart); // toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049
        int indexOfSlash=lastPart.indexOf("/");
        String mainCategory=lastPart.substring(0,indexOfSlash);
        System.out.println("mainCategory = " + mainCategory);
        String result = mainCategory.replace('-', ' ');
        System.out.println("result = " + result);

    }
}
