package homework14;

import java.util.ArrayList;

public class HomeWork14 {

    public static void main(String[] args) {
        ArrayList marray = arrayAfter4(new int[]{1, 2, 3});
        for (Object i : marray) System.out.println(i);
    }

    /**
     * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный
     * целочисленный массив. Метод должен вернуть новый массив, который получен путем
     * вытаскивания из исходного массива элементов, идущих после последней четверки. Входной
     * массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить
     * RuntimeException.
     * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     * Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     *
     * @param array - входящий массив
     * @return
     */
    public static ArrayList arrayAfter4(int[] array) {
        boolean laOn = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                arrayList.clear();
                laOn = true;
            }
            if (laOn && i < array.length - 1) arrayList.add(array[i + 1]);
        }
        try {
            if (!laOn) {
                throw new RuntimeException();
            }
        } catch (RuntimeException re) {
            System.out.println("Входящий массив не содержит 4-ку!!!");
        }
        return arrayList;
    }

    /**
     * 2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
     * четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4
     * варианта входных данных).
     * [ 1 1 1 4 4 1 4 4 ] -> true
     * [ 1 1 1 1 1 1 ] -> false
     * [ 4 4 4 4 ] -> false
     * [ 1 4 4 1 1 4 3 ] -> false
     *
     * @param array - входящий массив
     * @return
     */
    public static boolean arrayPresenc1or4(int[] array) {
        boolean num1 = false;
        boolean num4 = false;
        boolean num = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) num1 = true;
            if (array[i] == 4) num4 = true;
            if (array[i] != 1 && array[i] != 4) num = true;
        }
        if (num1 && num4 && !num) {
            System.out.println("Массив соответствует условию: есть 1 и 4. Метод возврашает TRUE");
            return true;
        }
        if (num1 && !num4 && !num) {
            System.out.println("В массиве есть 1, но нет 4. Метод возвращает FALSE");
            return false;
        }
        if (!num1 && num4 && !num) {
            System.out.println("В массиве есть 4, но нет 1. Метод возвращает FALSE");
            return false;
        }
        if (num1 && num4 && num) {
            System.out.println("В массиве есть 4 и 1, но присутствуют еще другие цифры. Метод возвращает FALSE");
            return false;
        }
        return false;
    }


}
