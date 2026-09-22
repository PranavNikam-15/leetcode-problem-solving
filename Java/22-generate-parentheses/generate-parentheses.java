class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        generateCombinations("", 0, 0, n, result);
        return result;
    }

    public void generateCombinations(String current, int open, int close,
        int n, List<String> result) {

        if(current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if(open < n) {
            generateCombinations(current + "(", open + 1, close, n, result);
        }

        if(close < open) {
            generateCombinations(current + ")", open, close + 1, n, result);
        }
    }
}