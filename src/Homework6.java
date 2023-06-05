import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        // outputThreeArrays();
        //createChessboard();
        //multiplyArrays();
        //sumArrays();
        printDiagonals();
        //sortArrays();

    }

    /*Task 1 ( Create a three-dimensional array.
     Increase each element of the array by a specified number.
     The number is entered from the console)
     */

    public static void outputThreeArrays() {


        int[][][] arrays = new int[3][2][2];

        Random random = new Random();

        for (int outer = 0; outer < arrays.length; outer++) {
            for (int middle = 0; middle < arrays[outer].length; middle++) {
                for (int inner = 0; inner < arrays[middle].length; inner++) {
                    arrays[outer][middle][inner] = random.nextInt(-7, 8);
                }
            }
        }

        System.out.println(Arrays.deepToString(arrays));


        System.out.println("Please, enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int outer = 0; outer < arrays.length; outer++) {
            for (int middle = 0; middle < arrays[outer].length; middle++) {
                for (int inner = 0; inner < arrays[outer][middle].length; inner++) {
                    arrays[outer][middle][inner] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrays));


    }

    // Task 2 (Create a chessboard)
    public static void createChessboard() {
        String[][] chessBoard = new String[8][8];
        for (int outer = 0; outer < chessBoard.length; outer++) {
            for (int inner = 0; inner < chessBoard[0].length; inner++) {
                if ((outer + inner) % 2 == 0) chessBoard[outer][inner] = "W";
                else chessBoard[outer][inner] = "B";
                System.out.print(" " + chessBoard[outer][inner] + " ");
            }
            System.out.println();

        }
    }

    //Task 3 (Create 2 arrays of size 2*2. Write a program for multiplying arrays)

    public static void multiplyArrays() {
        int[][] twoArray1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] twoArray2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] newTwoArray = new int[twoArray1.length][twoArray2[0].length];
        for (int outer = 0; outer < newTwoArray[0].length; outer++)
            for (int middle = 0; middle < newTwoArray.length; middle++)
                for (int n = 0; n < twoArray1[0].length; n++)
                    newTwoArray[outer][middle] = newTwoArray[outer][middle] + twoArray1[outer][n] * twoArray2[n][middle];

        for (int outer = 0; outer < newTwoArray.length; outer++)
            for (int inner = 0; inner < newTwoArray[0].length; inner++) {
                System.out.print(" " + newTwoArray[outer][inner] + " ");
            }
        System.out.println();

    }

    //Task 4 (Create a two-dimensional array. Print the sum of the arrays)

    public static void sumArrays() {
        int[][] twoArray = new int[5][2];
        int sum = 0;

        Random random = new Random();

        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                twoArray[outer][inner] = random.nextInt(5, 20);
            }
        }

        System.out.println(Arrays.deepToString(twoArray));


        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                sum += twoArray[outer][inner];
            }
        }
        System.out.print("Sum of array elements: " + sum);

    }

    //Task 5 (Create a two-dimensional array. Print the diagonals of the array)

    public static void printDiagonals() {


        int[][] twoArray = new int[4][4];
        int sum = 0;

        Random random = new Random();

        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                twoArray[outer][inner] = random.nextInt(13, 20);
                System.out.print(twoArray[outer][inner] + "\t");
            }
            System.out.println();
        }

        for (int outer = twoArray.length - 1; outer >= 0; outer--) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                if (outer == inner) {
                    System.out.print(twoArray[outer][inner] + " ");
                }
            }
        }
        System.out.println();
    }


    // Task 6 (Sort array elements)
    public static void sortArrays() {
        int[][] twoArray = new int[4][4];
        int n;
        Random random = new Random();

        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                twoArray[outer][inner] = random.nextInt(2, 10);
            }
        }

        System.out.println(Arrays.deepToString(twoArray));

        System.out.println();

        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++) {
                Arrays.sort(twoArray[outer]);
            }
        }
        for (int outer = 0; outer < twoArray.length; outer++) {
            for (int inner = 0; inner < twoArray[outer].length; inner++){

            }
        }
        System.out.println(Arrays.deepToString(twoArray));
    }
}



