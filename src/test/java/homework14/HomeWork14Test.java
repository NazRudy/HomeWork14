package homework14;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork14Test {

    @Test
    public void arrayAfter4(){
        // Создание тестовых массивов
        int[] arrinttest01=new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arrinttest02=new int[]{4, 44, 5, 76, 45, 89, 9, 32, 33, 444};
        int[] arrinttest03=new int[]{65, 7, 88, 333, 56};
        int[] arrinttest04=new int[]{4};

        //тест1
        ArrayList<Integer> arrTest01=new ArrayList<>(HomeWork14.arrayAfter4(arrinttest01));
        ArrayList<Integer> arrIntValid01=new ArrayList<>(Arrays.asList(1, 7));
        Assert.assertEquals(arrTest01, arrIntValid01);

        //тест2
        ArrayList<Integer> arrTest02=new ArrayList<>(HomeWork14.arrayAfter4(arrinttest02));
        ArrayList<Integer> arrIntValid02=new ArrayList<>(Arrays.asList(44, 5, 76, 45, 89, 9, 32, 33, 444));
        Assert.assertEquals(arrTest02, arrIntValid02);

        //тест3
        ArrayList<Integer> arrTest03=new ArrayList<>(HomeWork14.arrayAfter4(arrinttest03));
        ArrayList<Integer> arrIntValid03=new ArrayList<>();
        Assert.assertEquals(arrTest03, arrIntValid03);

        //тест4
        ArrayList<Integer> arrTest04=new ArrayList<>(HomeWork14.arrayAfter4(arrinttest04));
        ArrayList<Integer> arrIntValid04=new ArrayList<>();
        Assert.assertEquals(arrTest04, arrIntValid04);

    }
}
