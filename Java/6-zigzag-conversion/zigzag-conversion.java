class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean movingDown = true;

        for (char ch : s.toCharArray()) {

            rows[row].append(ch);

            // if we reach the top row, move downward
            if (row == 0) {
                movingDown = true;
            }
            // if we reach the bottom row, move upward
            else if (row == numRows - 1) {
                movingDown = false;
            }

            if (movingDown) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder currentRow : rows) {
            result.append(currentRow);
        }

        return result.toString();
    }
}