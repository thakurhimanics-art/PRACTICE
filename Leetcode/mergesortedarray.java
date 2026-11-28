class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1 ka aakhri asli number
        int j = n - 1;     // nums2 ka aakhri number
        int k = m + n - 1; // nums1 ki sabse aakhri khali seat
        
        // Jab tak dono arrays mein elements bache hain
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // nums1 wala bada hai -> peeche bithao
                i--;
            } else {
                nums1[k] = nums2[j]; // nums2 wala bada (ya equal) hai -> peeche bithao
                j--;
            }
            k--; // Agli khali seat par (peeche ki taraf) jao
        }
        
        // Agar nums2 mein abhi bhi kuch numbers bache hain, toh unhe copy kar do
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}