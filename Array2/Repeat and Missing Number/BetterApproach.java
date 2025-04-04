public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n =a.length;
        int result[]=new int[2];
        int visited[]=new int[n+1];
        for(int i=0;i<n;i++){
            visited[a[i]]+=1;
        }
        result[0]= -1;result[1]= -1;
        for(int i=1;i<=n;i++){
            if(visited[i] == 2){
                result[0]=i;
            }
            else if(visited[i] == 0){
                result[1]=i;
            }
            if(result[0]!= -1 && result[1]!= -1){
                break;
            }
        }
        return result;
    }
}
