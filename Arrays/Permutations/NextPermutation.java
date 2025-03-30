class Solution {
    void swap(int nums[],int var1,int var2){
        int temp=nums[var1];
        nums[var1]=nums[var2];
        nums[var2]=temp;
    }
     void reverse(int nums[], int index) {
        int left = index, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0);
            return;
        }
        for(int i=n-1;i>0;i--){
            if(nums[index]<nums[i]){
                swap(nums,index,i);
                break;
            }
        }
        reverse(nums,index+1);
        
    }
}

