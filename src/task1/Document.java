package task1;


import java.io.*;
import java.util.*;



public class Document {
    public static Map<String, String> getFiles() {
        Set<String> docNumbers = getNumbers();
        Map<String, String> processedNumbers = new HashMap<>();

        for (String num : docNumbers) {
            if (checkValid(num)) {
                processedNumbers.put(num, "Valid");
            } else {
                processedNumbers.put(num, "Not valid");
            }
        }

        return processedNumbers;
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


    public static Set<String> getNumbers() {
        Set<String> numbers = new HashSet<>();
        List<String> files = getPath();

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

    private static List<String> getPath() {
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

    public static void writeFile(Map<String, String> numbers, File report) {
        try (PrintWriter path = new PrintWriter(report)) {
            for (Map.Entry<String, String> set : numbers.entrySet()) {
                path.write(set.getKey() + " - " + set.getValue() + "\n");
                path.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}





