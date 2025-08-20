package c1.lesson2;

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
 * в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 * 2. Написать метод, которому в качестве параметра передается целое число, метод должен
 * напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
 * считаем положительным числом.
 * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен
 * вернуть true, если число отрицательное, и вернуть false если положительное.
 * 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
 * отпечатать в консоль указанную строку, указанное количество раз;
 * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
 * (високосный- true, не високосный- false). Каждый 4-й год является високосным, кроме каждого
 * 100-го, при этом каждый 400-й – високосный.
 */

public class HW_2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 7));  //#1
        checkPositiveNumber(5); //#2
        System.out.println(checkPositive(-3)); //#3
        Repeater(); //#4
        System.out.println(checkLeapYear(400));

    }

    public static boolean checkSum(int n1, int n2) {
        return n1 + n2 >= 10 && n1 + n2 <= 20;
    }

    public static void checkPositiveNumber(int n3) {
        if (n3 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkPositive(int n1) {
        return n1 < 0;
    }

    public static void Repeater() {
        int k = 5;
        String s = "Капибара";
        for (int i = 0; i < k; i++) {
            System.out.println(s);
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
