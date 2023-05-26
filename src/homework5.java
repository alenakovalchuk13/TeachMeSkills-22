import java.util.Scanner;
import java.util.Arrays;

public class homework5 {
    public static void main(String[] args) {
        searchNumber();
        outputArray();
        createArray();
        findArg();
        create2Arrays();
        createNewArrays();
        sortString1();
        createBubble();
    }
    //Arrays
    // Task 0 (Create an array of numbers. Check whether a number is included in the array or not)

    public static void searchNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        boolean isEnter = false;

        int[] number = new int[]{10, 1, 5, -7, 4};

        for (int index = 0; index < number.length; index++) {
            if (number[index] == num) {
                isEnter = true;
            }
        }
        if (isEnter == true) {
            System.out.println("The number is included in the array");
        } else System.out.println("The number is not included in the array");
    }

    // Task 1 (Create an array and delete occurrences from the array)
    public static void outputArray() {
        int[] arrays = {3, 4, 6, 9, -8, 4};
        int[] newArrays = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberDeleted = scanner.nextInt();
        System.out.println("Array is: " + Arrays.toString(arrays));

        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] == numberDeleted) {
                newArrays = new int[arrays.length - 1];
                for (int index = 0; index < i; index++) {
                    newArrays[index] = arrays[index];
                }
                for (int j = i; j < arrays.length - 1; j++) {
                    newArrays[j] = arrays[j + 1];
                }

            }
        }
        System.out.println("New Array" + Arrays.toString(newArrays));
    }

    // Task 2 (Create and fill an array. Find the maximum, minimum and average value)
    public static void createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        double[] arrays = new double[number];
        for (int index = 0; index < arrays.length; index++) {
            arrays[index]=Math.random();
        }
        double max = arrays[0];
        double min = arrays[0];
        double avg = 0;
        for (int index = 0; index < arrays.length; index++) {
            if (max > arrays[index])
                max = arrays[index];
            if (min < arrays[index])
                min = arrays[index];
            avg += arrays[index] / arrays.length;
        }
        System.out.println("Max = " + max + " Min = " + min + " Avg = " + avg);
    }
    //Task 3 (Create 2 arrays of 5 elements. Find their average value and compare them)
    public static void findArg() {
        int[] arrays1 = {3, 4, 6, 7, 9};
        int[] arrays2 = {5, 6, -8, 0, 1};
        int avg1 = 0;
        int avg2 = 0;

        System.out.println("Array1 is: " + Arrays.toString(arrays1));
        System.out.println("Array2 is: " + Arrays.toString(arrays2));
        for (int index = 0; index < arrays1.length; index++){
            avg1 += arrays1[index] / arrays1.length;
        }
        for (int index = 0; index < arrays2.length; index++){
            avg2 += arrays2[index] / arrays2.length;
        }
        if (avg1>avg2){
            System.out.println(avg1 + " > " + avg2);
            if (avg1<avg2){
                System.out.println(avg1 + " < " + avg2);
            }
        }else System.out.println(avg1 + "=" + avg2);

        }
    // Task 4 (Create an array and output it. Create a new array with even numbers from the first array)
    public static void create2Arrays(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        int[] arrays2 = new int[number];

        while (number <5 || number>10){
            System.out.println("please enter the number again");
             number = scanner.nextInt();
        }
        if (number > 5 && number <= 10) {
            for (int index = 0; index < arrays.length; index++) {
                arrays[index]=(int) (100 + Math.random() * 90);
            }
            System.out.println("Array is: " + Arrays.toString(arrays));
            for (int index = 0; index < arrays.length; index++){
                if (arrays[index] %2 == 0){
                    arrays2[index] = arrays[index];
                }
            }

            System.out.println("Array2 is: " + Arrays.toString(arrays2));


        }else System.out.println("You entered an incorrect number");



    }
    //Task 5 (Create and output an array. Replace each element with an odd index by 0)
    public static void createNewArrays() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];


        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = (int) (100 + Math.random() * 90);
        }
        System.out.println("Array is: " + Arrays.toString(arrays));
        for (int index = 0; index < arrays.length; index++) {
            if (index % 2 != 0) {
                arrays[index] = 0;
            }
        }

        System.out.println("New array is: " + Arrays.toString(arrays));
    }

    //Task 6 (Create an array of strings. Sort it and output it)
    public static void sortString1() {
        String[] names = new String[]{"Alena", "Sven", "Slark", "Broodmother"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    //Task 7 (Implement a bubble sorting algorithm)
    public static void createBubble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        int tmp = 0;
        boolean isSort = false;

        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = (int) (100 + Math.random() * 90);
        }
        System.out.println("Array is: " + Arrays.toString(arrays));
        while (!isSort) {
            isSort = true;
            for (int index = 0; index < arrays.length - 1; index++) {
                if (arrays[index] > arrays[index + 1]) {
                    isSort = false;
                    tmp = arrays[index];
                    arrays[index] = arrays[index + 1];
                    arrays[index + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arrays));
}
}









