package ru.skypro.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
         /*
        1 задача
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
         - Подсказка
        ```java
        //объявление массива из 12-ти элементов, заполненного нулями
        int [] weight = new int [12];
        ```

        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
         - Подсказка
        ```java
        //объявление целочисленного массива, заполненного 12 элементами
        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        ```

         3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
         создания массива: с помощью ключевого слова или сразу заполненный элементами.
          - **Критерии оценки**
          - Целочисленный массив создан с помощью ключевого слова new
          - Массив с дробными числами создан и сразу заполнен значениями
          - Создан любой произвольный массив одним из двух способов, рассмотренных в уроке
         */
        System.out.println("Задача 1 условие 1");
        int [] weight = new int [3];
        int j = 1;
        for (int i = 0; i < weight.length; i++){
            weight[i] = j++;
        }
        System.out.println(Arrays.toString(weight));
        System.out.println();

        System.out.println("Задача 1 условие 2");
        float [] arrey = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arrey));
        System.out.println();

        System.out.println("Задача 1 условие 3");
        int [] variable = {90, 91, 93, 92, 85, 87, 84, 83};
        System.out.println(Arrays.toString(variable));
        System.out.println();

        // Задача 2 вывод массивов на консоль в порядке возрастания индексов
        Task2int(weight);
        Task2flot(arrey);
        Task2int(variable);
        // Задача 3 вывод массивов на консоль в порядке убывания индексов
        Task3int(weight);
        Task3flot(arrey);
        Task3int(variable);
        // Задача 4 вывод массива и замена нечетных элементов на четные
        Task4int(weight);
        Task4int(variable);
    }

    public static void Task2int(int [] wei) {
        /*
        2 задача
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую. Запятая между последним элементом одного
        массива и первым элементом следующего не нужна.
        - **Критерии оценки**
          - В консоль выведены все элементы первого массива в верном порядке через запятую
          - В консоль выведены все элементы второго массива в верном порядке через запятую
          - В консоль выведены все элементы третьего массива в верном порядке через запятую
          - На одной строчке расположены элементы только одного массива
         */
        System.out.println("Задача 2 условие для int");
        for (int i = 0; i < wei.length; i++ ){
            String comma = ", ";
            int j = i;
            if (++j == wei.length) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    public static void Task2flot(float [] wei) {
        /*
        2 задача описание выше
        */
        System.out.println("Задача 2 условие для float");
        for (int i = 0; i < wei.length; i++ ){
            String comma = ", ";
            int j = i;
            if (++j == wei.length) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    public static void Task3int(int [] wei) {
        /*
        3 задача
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не
        с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
        при этом элементы одного массива располагаются на одной строчке, а элементы другого массива
        – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        Если во втором задании в консоль у вас вывелся результат
         1, 2, 3
         1.57, 7.654, 9.986
        *произвольные элементы третьего массива*
        То в третьем задании результат должен быть
         3, 2, 1
         9.986, 7.654, 1.57
        *произвольные элементы третьего массива в обратном порядке*
         */
        System.out.println("Задача 3 условие для int");
        for (int i = wei.length - 1; i > -1 ; i-- ){
            String comma = ", ";
            int j = i;
            if (j == 0) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }
    public static void Task3flot(float [] wei) {
        /*
        3 задача описание выше
        */
        System.out.println("Задача 3 условие для float");
        for (int i = wei.length - 1; i > -1 ; i-- ){
            String comma = ", ";
            int j = i;
            if (j == 0) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    public static void Task4int(int [] wei) {
        /*
        4 задача
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
        сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для
        решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль.
         */
        System.out.println("Задача 4 условие для int");
        String comma = ", ";
        for (int i = 0; i < wei.length; i++ ){
            if ( wei[i] % 2 != 0 ) {
                wei[i]++;
            }

            int j = i;
            if (++j == wei.length) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }
 }

