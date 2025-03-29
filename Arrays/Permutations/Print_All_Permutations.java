class Solution {
   static void recursion(List<List<Integer>> result,List<Integer>list,boolean visited[],int[]nums,int len){
        if(list.size() == len){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<len;i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i]=true;
                recursion(result,list,visited,nums,len);
                list.remove(list.size() - 1);
                visited[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length; 
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        boolean visited[]=new boolean[n];
        recursion(result,list,visited,nums,n);
        return result;
    }
}
