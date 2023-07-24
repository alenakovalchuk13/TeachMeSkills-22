package task1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static task1.DocumentValid.checkValid;

public class Document {
     private static ArrayList<String> getPath() {
         System.out.print("Enter file path: ");
        ArrayList<String> files = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String path = scanner.nextLine();

            if (path.equals("0"))
                break;

            files.add(path);
            System.out.print("Enter next file path or 0: ");
        }

        return files;
    }


    public static Set<String> getNumbers() {
        Set<String> numbers = new HashSet<>();
        ArrayList<String> files = getPath();

        for (String file : files) {
            File document = new File(file);

            try (Scanner scanner = new Scanner(document)) {
                while (scanner.hasNext()) {
                    numbers.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return numbers;
    }

}
