package homework14;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork14Test {

    /**
     * Тестирование HomeWork14.arrayAfter4
     */
    @Test
    public void arrayAfter4() {
        // Создание тестовых массивов
        int[] arrinttest01 = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arrinttest02 = new int[]{4, 44, 5, 76, 45, 89, 9, 32, 33, 444};
        int[] arrinttest03 = new int[]{65, 7, 88, 333, 56};
        int[] arrinttest04 = new int[]{4};

        //тест1
        ArrayList<Integer> arrTest01 = new ArrayList<>(HomeWork14.arrayAfter4(arrinttest01));
        ArrayList<Integer> arrIntValid01 = new ArrayList<>(Arrays.asList(1, 7));
        Assert.assertEquals(arrTest01, arrIntValid01);

        //тест2
        ArrayList<Integer> arrTest02 = new ArrayList<>(HomeWork14.arrayAfter4(arrinttest02));
        ArrayList<Integer> arrIntValid02 = new ArrayList<>(Arrays.asList(44, 5, 76, 45, 89, 9, 32, 33, 444));
        Assert.assertEquals(arrTest02, arrIntValid02);

        //тест3
        ArrayList<Integer> arrTest03 = new ArrayList<>(HomeWork14.arrayAfter4(arrinttest03));
        ArrayList<Integer> arrIntValid03 = new ArrayList<>();
        Assert.assertEquals(arrTest03, arrIntValid03);

        //тест4
        ArrayList<Integer> arrTest04 = new ArrayList<>(HomeWork14.arrayAfter4(arrinttest04));
        ArrayList<Integer> arrIntValid04 = new ArrayList<>();
        Assert.assertEquals(arrTest04, arrIntValid04);
    }
    /**
     * Тестирование HomeWork14.arrayPresenc1or4
     */
    @Test
    public void arrayPresenc1or4(){
        // Создание тестовых массивов
        int[] arrinttest01 = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
        int[] arrinttest02 = new int[]{1, 1, 1, 1, 1, 1};
        int[] arrinttest03 = new int[]{4, 4, 4, 4};
        int[] arrinttest04 = new int[]{1, 4, 4, 1, 1, 4, 3};

        // Валидные результаты
        boolean boValid01=true;
        boolean boValid02=false;
        boolean boValid03=false;
        boolean boValid04=false;

        // тест1
        boolean boTest01=HomeWork14.arrayPresenc1or4(arrinttest01);
        Assert.assertEquals(boTest01, boValid01);

        // тест2
        boolean boTest02=HomeWork14.arrayPresenc1or4(arrinttest02);
        Assert.assertEquals(boTest02, boValid02);

        // тест3
        boolean boTest03=HomeWork14.arrayPresenc1or4(arrinttest03);
        Assert.assertEquals(boTest03, boValid03);

        // тест4
        boolean boTest04=HomeWork14.arrayPresenc1or4(arrinttest04);
        Assert.assertEquals(boTest04, boValid04);
    }


}
