// For non-negative matrix

class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 0){
                    setRow(i,matrix);
                    setCol(j,matrix);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
    void setRow(int row,int matrix[][]){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[row][j] !=0){
                matrix[row][j] = -1;
            }

        }
    }
     void setCol(int col,int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col] !=0){
                matrix[i][col]= -1;
            }
            
        }
    }
}





