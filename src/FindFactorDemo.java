public class FindFactorDemo {
    public static void main(String[] args) {

        /*
            21 = 1, 3, 7, 21
            30 = 1, 2, 3, 5, 6, 10, 15, 30
            10 = 1, 2, 5, 10

            Alle möglichen Teiler einer Zahl finden

            What is the aim of the method => name => findFactors()
            What is required to do the work => parameter => int number
            What needs the method to return to the caller => return value => void
         */
        findFactors(21);

    }
        public static void findFactors(int number) {
            int counter = 1;
            while (counter <= number) {
               if (number % counter == 0) {
                   System.out.print(counter + ", ");
               }
               counter++;

        }
    }
}
