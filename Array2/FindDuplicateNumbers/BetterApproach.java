class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
           if(freq[nums[i]]>= 1){
            return nums[i];
           }
           else{
            freq[nums[i]]+=1;
           }
        }
        return -1;
        
    }
}
