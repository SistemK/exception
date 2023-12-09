package gb_java_exception.sem2.cw.task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "src\\main\\java\\gb_java_exception\\sem2\\cw\\task3\\names.txt";
        List<String[]> arrayNames = readFile(path);
        upArray(arrayNames);
        writeFile(path, arrayNames);
    }

    public static List<String[]> readFile(String path){
        List<String[]> arrayNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null){
                arrayNames.add(line.split("="));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return arrayNames;
    }

    public static void upArray(List<String[]> arrrayNames){
        for (String[] i: arrrayNames) {
            if (!i[1].equals("?") && !checkString(i[1])){
                throw new IllegalArgumentException("Элемент не ? и не число");
            }
            i[1] = String.valueOf(i[0].length());
        }
    }

    public static boolean checkString(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeFile(String path, List<String[]> arrayNames){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (String[] i:arrayNames ) {
                bufferedWriter.write(i[0] + "=" + i[1] + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
