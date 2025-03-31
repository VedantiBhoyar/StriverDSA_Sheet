class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int result=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=1;i<n;i++){
            int profit=prices[i]-min;
            result=Math.max(result,profit);
            min=Math.min(min,prices[i]);
        }
        if(result<=0){
            return 0;
        }
        return result;

        
    }
}
