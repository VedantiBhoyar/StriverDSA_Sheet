class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col -1;
        while(low<=high){
            int mid=(low+high)/2;
            int r= mid/col;
            int c= mid%col;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return false;
        
    }
}
