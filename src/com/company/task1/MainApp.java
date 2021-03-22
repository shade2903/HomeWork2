package com.company.task1;

public class MainApp {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        average(array);                       //1
        min(array);                           //2
        firstEven(array);                     //3
        byteConverter(10, "kb");     //4
        System.out.println(isSorted(array));  //5
        System.out.println(isPrime(101)); //6

        sumDigits(10221);//7
        sqRoots(2,4,3); //10


    }

    private static void average(int[] array) { //1.метод возвращающий среднее значение чисел массива
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println(sum / array.length);

    }

    private static void min(int[] array) { //2.метод возвращающий минимальный элемент массива
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    private static void firstEven(int[] array) { //3. метод возвращающий из множества чисел первое четное
        int even = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                even = array[i];
                break;
            }
        }
        System.out.println(even);
    }

    private static void byteConverter(long size, String type) { //4. метод ковертирующий мб в кбайты, или байты
        long kb = size * 1024;
        if (size > 0 && size < 1000000) {
            switch (type) {
                case "kb":
                    System.out.println(kb + " кБайт");
                    break;
                case "b":
                    System.out.println(kb * 1024 + " Байт");
                    break;
            }
        } else {
            System.out.println("Ошибка: введен неверный диапазон");
        }

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

    private static void sumDigits(int num) { //7
        String string = String.valueOf(num);
        char[] array = string.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(String.valueOf(array[i]));

        }
        System.out.println(sum);
    }

    private static void sqRoots(double a, double b, double c) { //10. Метод для нахождения корней квадратного уравнения
        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        if (d > 0) {
            System.out.println("Уравнение имеет два корня x1: " + x1 + "x2: " + x2);
        }else if(d == 0) {
            System.out.println("Уравнение имеет один корень x: " + x1);

        } else  {
            System.out.println("Корней в уравнение нет");

        }
    }


}
