class Solution {
    static void swap(int nums[],int var1,int var2){
        int temp=nums[var1];
        nums[var1]=nums[var2];
        nums[var2]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
         while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
                
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
               
            }
            else if(nums[mid] == 1){
                mid++;
            }
           
         }
    }
}

