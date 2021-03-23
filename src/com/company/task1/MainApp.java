package com.company.task1;

public class MainApp {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[][] multiArray = {{-1, 2, 3}, {4, -3, 8}, {6, -7, 8, 4}};
        average(array);                            //1
        min(array);                                //2
        firstEven(array);                          //3
        System.out.println(byteConverter(10, "kb"));         //4
        System.out.println(isSorted(array));        //5
        System.out.println(isPrime(101));     //6
        sumDigits(521);                       //7
        sumDigitsSecond(10221);               //7
        showTime(765);                    //8
        replaceNegative(multiArray);               //9
        sqRoots(2, 8, 3);                //10


    }

    private static double average(int[] array) { //1.метод возвращающий среднее значение чисел массива
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;

    }

    private static int min(int[] array) { //2.метод возвращающий минимальный элемент массива
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        return min;
    }

    private static int firstEven(int... array) { //3. метод возвращающий из множества чисел первое четное
        int even = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                even = array[i];
                break;
            }
        }
        return even;
    }

    private static long byteConverter(long size, String type) { //4. метод ковертирующий мб в кбайты, или байты
        long kb = size * 1024;
        if (size > 0 && size < 1000000) {
            switch (type) {
                case "kb":
                    return kb ;
                case "b":
                    return kb * 1024 ;
            }
        }
           return 0;
    }

    private static boolean isSorted(int[] array) { //5. метод проверки сортировки массива по возрастанию??
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int num) { //6. метод проверки числа если чило простое, метод возвращает true
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumDigits(int num) { //7 Метод выводящий сумму цифр натурального числа
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;

        }
        return sum;
    }

    private static int sumDigitsSecond(int num) { //7 Метод выводящий сумму цифр натурального числа
        String string = String.valueOf(num);
        char[] array = string.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(String.valueOf(array[i]));

        }
        return sum;
    }

    private static void showTime(int seconds) { //8 Метод конвертирующий секунды в HH:MM:SS
        int hour = seconds / 3600;
        if (hour < 10) {
            System.out.print("0" + hour + ":");
        } else {
            System.out.print(hour + ":");
        }
        int minute = (seconds - hour * 3600) / 60;
        if (minute < 10) {
            System.out.print("0" + minute + ":");
        } else {
            System.out.print(minute + ":");
        }
        int sec = seconds - hour * 3600 - minute * 60;
        if (sec < 10) {
            System.out.println("0" + sec);
        } else {
            System.out.println(sec);
        }
    }

    private static void replaceNegative(int[][] multiArray) { //9. Метод заменяющий отрицательные значения в матрице на 0
        for (int i = 0; i < multiArray.length && i <20; i++) {
            for (int j = 0; j < multiArray[i].length && j <20; j++) {
                if (multiArray[i][j] < 0) {
                    multiArray[i][j] = 0;
                }
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void sqRoots(double a, double b, double c) { //10. Метод для нахождения корней квадратного уравнения
        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        if (d > 0) {
            System.out.println("Уравнение имеет два корня x1: " + x1 + "  x2: " + x2);
        } else if (d == 0) {
            System.out.println("Уравнение имеет один корень x: " + x1);

        }
            System.out.println("Корней в уравнении нет");


    }


}
