package additionalTask;

public class Main {
    public static void main(String[] args) {

//Дополнительное задание
//2. Создать коллекцию класса ArrayList со значениями имен всех студентов
//в группе
//С помощью Stream'ов:
//- Вернуть количество количество людей с вашим именем (вне
//зависимости от верхнего/нижнего регистра букв)
//- Выбрать все имена, начинающиеся на "а" (вне зависимости от
//верхнего/нижнего регистра букв)
//- Отсортировать и вернуть первый элемент коллекции или
//"Empty@, если коллекция пуста


        StringList stringList = new StringList();
        System.out.println(stringList.createList());
        stringList.compareNames("Alena");
        stringList.startName("a");
        stringList.sortedName();


    }
}
