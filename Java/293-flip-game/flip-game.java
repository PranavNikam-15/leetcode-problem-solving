class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {

        List<String> result = new ArrayList<>();

        int n = currentState.length();

        for(int i=0; i < n-1; i++) {

            if(currentState.charAt(i) == '+' &&
               currentState.charAt(i + 1) == '+') {

                StringBuilder str = new StringBuilder(currentState);

                str.setCharAt(i, '-');
                str.setCharAt(i + 1, '-');

                result.add(str.toString());
            }
        }

        return result;
    }
}