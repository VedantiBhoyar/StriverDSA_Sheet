class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        
        for(int i=0;i<Math.abs(n);i++){
            if(n<0){
                ans/=x;
            }
            else{
                ans*=x;
            }
        }
        return ans;
        }
    }
