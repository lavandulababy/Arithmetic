package Arithmetic;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        while (index != -1) {
            if (m == 0 && n != 0) {
                nums1[index--] = nums2[n - 1];
                n--;
            } else if (n == 0)
                break;
            else {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[index--] = nums1[m - 1];
                    m--;
                } else {
                    nums1[index--] = nums2[n - 1];
                    n--;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int[] nums2 = {2, 5, 6};
        MergeArray mg = new MergeArray();
        mg.merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }


    }
}
