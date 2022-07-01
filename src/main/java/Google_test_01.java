public class Google_test_01 {

    public static void main(String[] args) {


        //求x,y的數字是多少
//        3
//        1 4
//        0 2 5


        long x = 5;
        long y = 10;

        long leftToRight = ((1 + x) * x) / 2;
        long bottomToTop = ((x + (x + y - 2)) * (y - 1)) / 2;

        String result = String.valueOf(leftToRight + bottomToTop);

        System.out.println(result);

    }
}
