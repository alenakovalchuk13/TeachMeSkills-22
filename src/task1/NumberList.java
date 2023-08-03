package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;


public class NumberList {
    Random random = new Random();
    List<Integer> number = new ArrayList<>();


    public List<Integer> getRandomNumber() {
        for (int i = 0; i < 20; i++) {
            number.add(random.nextInt(0, 20));
        }
        return number;
    }

    public List<Integer> doStream() {


        List<Integer> list = number.stream()
                .distinct()
                .filter(i -> i <= 17)
                .filter(i -> i >= 7)
                .filter(i -> i % 2 == 0)
                .map(integer -> integer * 2)
                .sorted()
                .limit(4)
                .toList();

        return list;
    }

     public void numberCount() {
        List<Integer> list2 = number.stream()
                .toList();
        long count = list2.stream().count();
        System.out.println("Count of stream: " + count);
    }


     public void outputAverage() {
         OptionalDouble average;
         average = number.stream().mapToInt(Integer -> Integer).average();
         System.out.println("Average: " + average);
    }

}
