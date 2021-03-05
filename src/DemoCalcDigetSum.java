public class DemoCalcDigetSum {
    public static void main(String[] args) {

        // 54321 = 15
        // 9876543 = 43
        // 12 = 3

        System.out.println("calcDigitSum(54321) = " + calcDigitSum(54321));

    }

        public static int calcDigitSum(int value) { // Method signature
            int digitsum = 0;
            while (value > 0) {
                digitsum = digitsum + (value % 10);
                value = value / 10;
            }

            return digitsum;
    }
}
