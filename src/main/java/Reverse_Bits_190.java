public class Reverse_Bits_190 {

    public static void main(String[] args) {

        int n = Integer.parseUnsignedInt("00000010100101000001111010011100");

        reverseBits(n);


    }


    private static int reverseBits(int n) {

        int result = 0;


        for (int i = 0; i < 32; i++) {
            result += n & 1;

            n >>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }

        return result;
    }
}
