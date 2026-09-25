class Solution {

    Map<Integer, String> letters = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    public void backtrack(String digits, int index,
        StringBuilder current, List<String> result) {

        // Base Case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String chars = letters.get(digit);

        for (int i = 0; i < chars.length(); i++) {

            current.append(chars.charAt(i));
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}