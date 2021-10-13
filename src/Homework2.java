public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int a = 0;
        int b = 8;
        System.out.println(task1(a,b));

        System.out.println("Задание 2.");
        task2(5);

        System.out.println("Задание 3.");
        System.out.println(isNegative(-2));

        System.out.println("Задание 4.");
        printtext("Test text", 2);
    }

    public static boolean task1(int firstnumber, int secondnumber) {
        int sum = firstnumber + secondnumber;
        return 10 < sum && sum <= 20;
    }

    public static void task2(int number) {
        if (number >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printtext(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
