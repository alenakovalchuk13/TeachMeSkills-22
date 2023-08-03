package additionalTask;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    List<String> nameStudents = new ArrayList<>();

    public List<String> createList(){
        nameStudents.add("Alena");
        nameStudents.add("Ilya");
        nameStudents.add("Dima");
        nameStudents.add("Ivan");
        nameStudents.add("Alena");
        nameStudents.add("Victor");
        nameStudents.add("Nasty");
        nameStudents.add("Aleksander");
        nameStudents.add("Victor");
        return nameStudents;
    }

    public void compareNames(String name){
        long count = nameStudents.stream()
                .filter(s -> s.toLowerCase().equals(name.toLowerCase()))
                .count();

        System.out.println("Number of students with the name " + name + " - " + count);
    }

    public void startName (String letter){
        System.out.print("Names that start with the letter: " + letter + " - ");
        System.out.println(nameStudents.stream()
                .filter(s -> s.toLowerCase().startsWith(letter))
                .toList());

    }

    public void sortedName() {
        System.out.print("Sorted: ");
        System.out.println(nameStudents.stream().
                sorted().
                findFirst().orElse("Empty"));

    }




}
