class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;int j=0;
        while(i>=0 && j<n){
            if(nums1[i]<=nums2[j]){
                break;
            }
            else{
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                i--;j++;
            }

        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

    }
}
