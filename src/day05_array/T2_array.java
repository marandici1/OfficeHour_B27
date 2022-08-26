package day05_array;

import java.util.Arrays;

public class T2_array {
    public static void main(String[] args) {

        String [] names =new String[5];

        // how to write the elements of array

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        int [] nums1={2,1,3,4};

        int [] nums2={2,4,3,1};


        //how to compare the arrays

        System.out.println("Arrays.equals(nums1, nums2) = " + Arrays.equals(nums1, nums2));

        Arrays.sort(nums2);

        Arrays.sort(nums1);

        System.out.println("Arrays.equals(nums1, nums2) = " + Arrays.equals(nums1, nums2));

    }
}
