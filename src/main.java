import java.util.Scanner;

public class main {
    public static void main (String[] args){
        //System.out.println(getSeason(6));
        //System.out.println(getTimeYear(2));
        //System.out.println(getNumber(7));
        //System.out.println(getTemperature(-20));
        //System.out.println(getColor(8));
        //printObbNumber();
        //printNumber();
        getSum();

    }
    //Conditional operator
    //Task 1 (Print the season using switch-case)

    public static String getSeason(int month){

        switch (month) {
            case 1, 2, 12:
                return "Winter";
            case 3, 4, 5:
                return "Spring";
            case 6, 7, 8:
                return "Summer";
            case 9, 10, 11:
                return "Autumn";
            default:
                return "There is no such month";
        }
    }
    //Task 2 (Print the season using if-else-if)
    public static String getTimeYear(int month){
        if(month == 1 || month==2 || month==12){
            return "Winter";
        } else if (month==3 || month==4 || month==5) {
            return "Spring";
        } else if (month==6 || month==7 || month==8) {
            return "Summer";
        } else if (month==9 || month==10 || month==11) {
            return "Autumn";
        }
        else{
            return "There is no such month";
        }
    }
    //Task 3 (Print an even number)
    public static String getNumber(int number){
        if (number % 2 == 0){
            return "Even number";
        } else {
            return "Obb number";
        }


    }
    //Task 4 (Print temperature)
    public static String getTemperature(int temperature){
        if (temperature > -5) {
            return "Warm";
        } else if (temperature<=-5 && temperature>-20) {
            return "Normal";
        }
        else {
            return "Cold";
    }
    }
    //Task 5 (Print the color of the rainbow)
    public static String getColor(int color){
        switch (color){
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Indigo";
            case 7:
                return "Violet";
            default:
                return "There is no such color in the rainbow";
        }
    }
    //Loops
    //Task 1 (Print numbers from 1 to 99 using for)
     public static void printObbNumber(){
         for (int count = 1; count <= 99; count++)
         {if(count%2!=0)
             System.out.println("Obb numbers: " + count);
         }
     }
     //Task 2 (Print numbers from 5 to 1)
     public static void printNumber(){
         for (int count = 5; count >= 1; count--) {
             System.out.println("Numbers: " + count);
         }
    }
    //Task 3(Get sum of the numbers)
    public static void getSum(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int sum =0;
        int number = scanner.nextInt();

        for (int count = 1; count <= number; count++) {
            sum+=count;}
            System.out.println("Sum: " + sum);
    }
}
