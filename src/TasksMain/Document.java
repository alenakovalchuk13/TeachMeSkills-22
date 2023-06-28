package TasksMain;

public class Document {
    public static void check(String string) {
        if (string.contains("abc") || string.contains("ABC")) {
            System.out.println("The document number contains the sequence - \"abc\".");
        } else {
            System.out.println("The document number does not contain the sequence - \"abc\".");
        }
    }

    public static void check555(String string) {
        if (string.substring(0,3).equals("555")) {
            System.out.println("The document number starts with 555.");
        } else {
            System.out.println("The document number does not start with 555.");
        }
    }

    public static void check1a2b(String string) {
        if (string.substring(string.length() - 4).equals("1a2b")) {
            System.out.println("The document number ends with 1a2b.");
        } else {
            System.out.println("The document number does not end with 1a2b.");
        }
    }
}
