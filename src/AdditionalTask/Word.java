package AdditionalTask;

public class Word {

    //Task 3

    public static void search(String text) {
        String[] arr = text.split(" ");

        String shortWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < shortWord.length()) {
                shortWord = arr[i];
            }
        }

        String longWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() >= longWord.length()) {
                longWord = arr[i];
            }
        }

        System.out.println("The shortest word in this text: " + shortWord);
        System.out.println("The longest word in this text: " + longWord);
    }
    }

