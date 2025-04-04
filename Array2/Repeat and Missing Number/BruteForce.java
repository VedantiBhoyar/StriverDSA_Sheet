public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n =a.length;
        int result[]=new int[2];
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[j] == i)
                  count++;
            }
            if(count == 0){
                result[1]=i;
            }
            if(count == 2){
                result[0]=i;
            }
        }
        return result;
    }
}
