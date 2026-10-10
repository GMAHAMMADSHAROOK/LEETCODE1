

public class numof1bit {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        numof1bit obj = new numof1bit();

        System.out.println(obj.hammingWeight(11));
        System.out.println(obj.hammingWeight(128));
    }
}