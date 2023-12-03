package gb_java_exception.sem1;

public class Main {
    public static void main(String[] args) {
        System.out.println(arr(new int[]{1,2,3,4,5}, 6));
    }

//    Реализуйте метод, принимающий в качестве аргумента
//    целочисленный массив.
//    Если длина массива меньше некоторого заданного минимума,
//    метод возвращает -1, в качестве кода ошибки, иначе - длину
//    массива.
    public static int arr (int[] arr, int lenArr){
        if(arr.length < lenArr){
            return -1;
        }
        return arr.length;
    }
}
