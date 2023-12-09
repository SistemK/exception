package gb_java_exception.sem2.hw.task3;

class Expr {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double result = 0;
        try {
            if (b != 0) {
                result = (double) a / (double) b;
            }
            else {
                result = 0;
            }
        } catch (ArithmeticException e) {
            result = 0;
        }
        printSum(a,b);
        return result;
    }

        public static void printSum ( int a, int b){
            // Введите свое решение ниже
            System.out.println(a+b);
        }
    }

    public class Main {
        public static void main(String[] args) {
            int a;
            int b;

            if (args.length == 0) {
                a = 12;
                b = 0; // Default values if no arguments are provided
            } else {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }

            double result = Expr.expr(a, b);
            System.out.println(result);
        }
    }
