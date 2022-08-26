package day07_methods;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c={7,8,9};
        int[] d={10,11,12};
        int[] merged=   mergeArray(a,b);
        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged));
        int[] merged2=    mergeArray(a,b,c);

    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        //I need to create one dummy array
        int [] dummy=new int[array1.length+array2.length];

        // I need to put my first array into dummy
        int index=0;
        for (int each:array1) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3}

        //I need to put my second array into dummy

        for (int each:array2) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3,4,5,6}
        //I need to return dummy

        return dummy;
    }
/*
    public static int[] mergeArray(int[] a, int[] b,int [] c) {
        //I need to create one dummy array
        int [] dummy=new int[a.length+b.length];

        // I need to put my first array into dummy
        int index=0;
        for (int each:a) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3}

        //I need to put my second array into dummy

        for (int each:b) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3,4,5,6}
        //I need to return dummy
        //I need to put my third array into dummy

        for (int each:c) {
            dummy[index++]=each;
        }


        return dummy;
    }

 */
/*
    public static int[] mergeArray(int[] a, int[] b,int [] c) {
        int[] mergedTwoArray = mergeArray(a, b);//{1,2,3,4,5,6}

        int[] mergedThreeArray = mergeArray(mergedTwoArray, c);

        return mergedThreeArray;

    }



 */

    public static int[] mergeArray(int[] a, int[] b,int [] c) {

        return   mergeArray(mergeArray(a, b),c);


    }


}
