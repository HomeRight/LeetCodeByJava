public class Number_of_1_Bits_191 {

    public static void main(String[] args) {

        int n = 00000000000000000000000000001011;

        hammingWeight(n);


    }


    private static int hammingWeight(int n) {
        int setBitCount = 0;

        while (n != 0) {
            n &= (n - 1); // to clear the right most set bit
            ++setBitCount;
        }

        System.out.println(setBitCount);

        return setBitCount;
    }
}
