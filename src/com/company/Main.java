package com.company;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("Старт программы");
        try {
            ArrayList<Integer> list = createRandomList();
            filtratedList(list);
        } catch (NumberFormatException e) {
            logger.log("Ошибка. Программа ожидала ввод числа без пробелов, введен текст");
        } finally {
            logger.log("Программа завершена");
            scanner.close();
        }

    }

    private static void filtratedList(ArrayList<Integer> list) {
        logger.log("Введите входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(treshold);
        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        listPrinter(filteredList);
    }

    private static void listPrinter(List<Integer> filteredList) {
        for (int i = 0; i < filteredList.size(); i++) {
            System.out.print(filteredList.get(i) + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> createRandomList() {
        logger.log("Введите входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listSize = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = Integer.parseInt(scanner.nextLine());
        logger.log("Создаём и наполняем список");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            arrayList.add(random.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: ");
        listPrinter(arrayList);
        return arrayList;
    }
}
