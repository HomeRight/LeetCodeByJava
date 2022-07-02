public class Google_test_en_route_salute {

    public static void main(String[] args) {


        //--->-><-><-->-
        //output:10

        String str = "<<>><";

        //count left to right >

        int leftToRightTotal = 0;
        int leftToRightResult = 0;
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            System.out.println(c);


            if ('>' == c) {
                leftToRightResult++;
            }

            if ('<' == c) {
                leftToRightTotal += leftToRightResult;
            }

            System.out.println("leftToRightResult=" + leftToRightResult);
            System.out.println("leftToRightTotal=" + leftToRightTotal);
        }

        int rightToLeftTotal = 0;
        int rightToLeftResult = 0;
        for (int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);
            System.out.println(c);


            if ('<' == c) {
                rightToLeftResult++;
            }

            if ('>' == c) {
                rightToLeftTotal += rightToLeftResult;
            }

            System.out.println("rightToLeftResult=" + rightToLeftResult);
            System.out.println("rightToLeftTotal=" + rightToLeftTotal);
        }

        System.out.println(rightToLeftTotal + leftToRightTotal);

    }
}
