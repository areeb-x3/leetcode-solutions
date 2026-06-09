class Solution {
    public int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] merged = new int[n+m];

        for(int i=0; i<n; i++) {
            merged[i] = nums1[i];
        }
        for(int j=0; j<m; j++) {
            merged[n+j] = nums2[j]; 
        }
        Arrays.sort(merged);
        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
        int l = merged.length;
        if(l%2 == 0) {
            return (double)(merged[l/2] + merged[l/2-1])/2;
        } else {
            return (double)merged[l/2];
        }
    }
}