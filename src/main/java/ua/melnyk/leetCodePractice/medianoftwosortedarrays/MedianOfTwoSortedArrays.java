package ua.melnyk.leetCodePractice.medianoftwosortedarrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        int[] nums1 = new int[]{3, 2};
        int[] nums2 = new int[]{1, 4};
        System.out.println(m.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 0) {
            return (double) (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2;
        } else {
            return mergedArray[mergedArray.length / 2];
        }
    }
}
