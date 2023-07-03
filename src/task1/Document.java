package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Document {

    public static void readFile() {
        try (Scanner fileScanner = new Scanner(getPath())) {
            while (fileScanner.hasNext()) {
                try {
                    String line = fileScanner.nextLine();
                    if (checkValid(line))
                        System.out.println(line);
                    else throw new ValidationExceptions("You entered the document number incorrectly...");
                } catch (ValidationExceptions e) {
                    e.getStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static File getPath() {
        System.out.print("Enter the path to the file: ");
        String path = scanner().nextLine();
        return new File(path);

    }

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


