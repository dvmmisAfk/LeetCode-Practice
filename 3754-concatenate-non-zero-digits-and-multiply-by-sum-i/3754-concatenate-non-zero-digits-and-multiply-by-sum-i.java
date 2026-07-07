class Solution {
    public long sumAndMultiply(int n) {
        long filtered = 0;
        long place = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;

            if (digit != 0) {
                filtered += (long) digit * place;
                place *= 10;
            }

            n /= 10;
        }

        return sum * filtered;
    }
}