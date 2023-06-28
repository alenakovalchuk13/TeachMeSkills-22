package TasksMain;
public class Document {

    //Task 1
    //String string = "5467-hgf-9845-kju-1a2b";

    public static void show2Blocks(String string) {
        System.out.println(string.substring(0,4) + string.substring(9,13));
    }

    public static void replace(String string) {
        String element = "***";
        System.out.println(string.substring(0,5) + element + string.substring(8, 14) + element + string.substring(17));
    }
    public static void showLetters(String string) {
        String res = string.substring(5, 8) + "/" + string.substring(14, 17) + "/" + string.substring(19, 20) + "/" + string.substring(21);
        System.out.println(res.toLowerCase());
    }

    public static void showLettersUpper(String string){
        StringBuilder stringBuilder = new StringBuilder("Letters:");
        String res = string.substring(5, 8) + "/" + string.substring(14, 17) + "/" + string.substring(19, 20) + "/" + string.substring(21);
        System.out.println(stringBuilder + res.toUpperCase());
    }

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

    //Task2

    public static void doubleLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.substring(i, i + 1) + string.substring(i, i + 1));
        }
    }

}


