package TasksMain;
public class Document {
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

}


