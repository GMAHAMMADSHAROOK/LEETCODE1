
class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}

public class adddigits {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.addDigits(38));
        System.out.println(s.addDigits(0));
    }
}