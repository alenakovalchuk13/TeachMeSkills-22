package TasksMain;

public class Document {
    public static void check(String string) throws ExceptionABC{
        if (string.contains("abc") || string.contains("ABC")) {
            System.out.println("The document number contains the sequence - \"abc\".");
        } else {
            throw new ExceptionABC("The document number does not contain the sequence - \"abc\".");
        }
    }

    public static void check555(String string) throws Exception555{
        if (string.substring(0,3).equals("555")) {
            System.out.println("The document number starts with 555.");
        } else {
            throw new Exception555("The document number does not start with 555.");
        }
    }

    public static void check1a2b(String string) throws Exception1a2b{
        if (string.substring(string.length() - 4).equals("1a2b")) {
            System.out.println("The document number ends with 1a2b.");
        } else {
            throw new Exception1a2b("The document number does not end with 1a2b.");
        }
    }
}
