package day04_recap;

public class T4_mainChategory {
    public static void main(String[] args) {
         /*
            Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
                                                              (main category)

            Output:
                   Main Category name is  toys and entertainment
         */

        String site = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        int firstIndex = site.indexOf("c/");
        String firstPart = site.substring(firstIndex +2);
        int lastIndex = firstPart.indexOf("?");
        String main = firstPart.substring(0,lastIndex);
        String result = main.replace('-', ' ');
        System.out.println("Main category name is " + result);

    }
}
