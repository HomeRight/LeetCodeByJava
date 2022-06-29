public class Sum_of_Two_Integers_371 {

    public static void main(String[] args) {

        int a = 2, b = 3;

        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }

        System.out.println(a);
    }
}
