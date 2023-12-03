package gb_java_exception.sem1.cw;

public class task3 {
    public static void main(String[] args) {
        System.out.println(summaArr(new int[][]{{1, 0, 1, 1}, {1, 1, 0, 0}, {1, 1, 0, 1}, {0, 1, 1, 0}}));

    }
    //    Задание №2
//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//    Необходимо посчитать и вернуть сумму элементов этого массива.
//    При этом накладываем на метод 2 ограничения: метод может работать только с
//    квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//    только значение 0 или 1.
//    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
//    ошибке.
    public static int summaArr(int[][] arr) {
        int res = 0;
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 1 & arr[i][j] != 0) {
                    throw new RuntimeException("В массиве присутствуют значения отличные от 1 или 0");
                }
                res += arr[i][j];
            }
        }
        return res;
    }

}
