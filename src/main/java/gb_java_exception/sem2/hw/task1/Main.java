package gb_java_exception.sem2.hw.task1;

class IsFloat {
    public static float isFloat(String input) {
// Введите свое решение ниже
        float f;
        try {
            return Float.parseFloat(input);
        } catch (Exception e){
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
//            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
            input = "g.14"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}
