class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {

            int currVal = matrix[row][col];

            if(currVal == target) {
                return true;
            }
            else if(currVal > target) {
                col--;
            } 
            else {
                row++;
            }
        }

        return false;
    }
}