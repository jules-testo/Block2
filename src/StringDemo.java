import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String demo = "Heute ist Freitag.";

        System.out.println("demo.length() = " + demo.length());
        System.out.println("demo.charAt(0) = " + demo.charAt(0));

        System.out.println("demo.contains (\"Frei\") = " + demo.contains("Frei"));

        System.out.println("demo.toLowerCase() = " + demo.toLowerCase());

 //       System.out.println("containsIgnoreCase(demo,  \"frei\") = " + containsIgnoreCase(demo, search: "frei"));

        String demo2 = "Heute ist Freitag.";

        if (demo.equals(demo2)) {
            System.out.println("demo entspricht demo2");
        }


    }

    public static boolean containsIgnoreCase(String source, String search) {
        String sourceLowerCase = source.toLowerCase();
        String searchLowerCase = search.toLowerCase();

        return sourceLowerCase.contains(searchLowerCase);

    }
}
