package gb_java_exception.sem1;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1,2,3,null, 2});
    }

//    Задание №4
//    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
//    целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что он не равен null.
//    А теперь реализуйте следующую логику:
//            1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
//    пользователя
//            2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
//    “подсветить”
    public static void checkArray(Integer[] arr){
        List list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                list.add(i);
            }
        }
         if(!list.isEmpty()){
             throw new RuntimeException("В массиве присутсвуют NULL на следующих элементах: "+ list);
         }
        System.out.println("В массиве нет null");
    }
}
