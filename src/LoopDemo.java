public class LoopDemo {
    public static void main(String[] args) {

        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        System.out.println("_");


        // while => solange die Bedingung zB true ist
        // while (Bedingung)
         /*while (true) {
            System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        }*/
        int counter = 5;
        while (counter > 0) {
            counter--;
            System.out.println(counter + ": Der Pinguin schlug die Zeitung auf, da stand:");
        }
        // Write a while loop, which counts from 1 to 100. It should print the number and in case auf odd => "ping" even => "pong"
        int counter1 = 1;
        while (counter1 <= 100) {
            System.out.print(counter1);
            if (counter1 % 2 == 0) {
                System.out.println(" pong");
            } else {
                System.out.println(" ping");
            }
            counter1++;
        }
    }
}
