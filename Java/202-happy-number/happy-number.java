class Solution {
    public boolean isHappy(int n) {

        Set<Integer> visited = new HashSet<>();

        while(true) {
            
            int sum = 0;
            while(n != 0) {

                int digit = n % 10;
                sum = sum + (digit * digit);
                n =  n / 10;
            }

            if(sum == 1) {
                return true;
            }
            
            n = sum;

            if(visited.contains(n)) {
                return false;
            }

            visited.add(n);
        }
    }
}