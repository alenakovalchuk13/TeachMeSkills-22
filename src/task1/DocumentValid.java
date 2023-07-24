package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class DocumentValid {



    public static boolean checkValid(String strNumber) {

        if (strNumber.length() == 15 && (strNumber.startsWith("docnum") || strNumber.startsWith("contract"))) {
            for (char chr : strNumber.toCharArray()) {
                if (!Character.isLetterOrDigit(chr))
                    return false;
            }
            return true;
        }
        return false;
    }



}

