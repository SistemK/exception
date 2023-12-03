package gb_java_exception.sem1.hw.task1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] arr = new int[]{1,2};
        System.out.println(arr[4]);


    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        System.out.println(10/0);

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "asd";
        System.out.println(Integer.parseInt(str));

    }
}

public class Main  {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}


