/*
    Leetcode 4 : Hard
    solved on my own
    
    Here, After sumbmiting the code i got 2 ms
    But then i looked at 1 ms answer, my answer and 1 ms answer was same except i was a method to merge the
    two sorted array but they did not.
    That's it. Otherwise my solution is also 1 ms. Just the method calling over-head.
*/

public class MedianOfTwoSortedArrays {
    public int[] merge(int[] nums1, int[] nums2) {
        int i, j, k;
        i = j = k = 0;
        int[] res = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        // If nums1 is remaining
        for ( ; i < nums1.length; i++) {
            res[k++] = nums1[i];
        }

        // If nums2 is remaining
        for ( ; j < nums2.length; j++) {
            res[k++] = nums2[j];
        }
        return res;
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = merge(nums1, nums2);
        if (res.length % 2 == 0) {
            return (res[res.length / 2] + res[res.length / 2 - 1]) / 2.0;
        } else {
            return res[res.length / 2];
        }
    }
}

