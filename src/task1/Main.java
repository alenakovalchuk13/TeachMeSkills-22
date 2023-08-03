package task1;



public class Main {
    public static void main(String[] args) {
//        Основное задание
//1. Создать коллекцию класса ArrayList наполнить ее элементами
//рандомными элементами типа Integer.
//С помощью Stream'ов:
//- Удалить дубликаты
//- Вывести все четные элементы в диапазоне от 7 до 17
//(включительно)
//- Каждый элемент умножить на 2
//- Отсортировать и вывести на экран первых 4 элемента
//- Вывести количество элементов в стриме
//- Вывести среднее арифметическое всех чисел в стриме

        NumberList numberList = new NumberList();
        
        System.out.println(numberList.getRandomNumber());
        System.out.println(numberList.doStream());
        numberList.numberCount();
        numberList.outputAverage();
    }}







