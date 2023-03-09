// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
package Java_hw_2;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = new int[] { 3, 5, 7, 2, 1, 4 };
        PrintArr(arr);
        int temp;
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    text += "Элемент с индексом " + j + " заменен на элемент с индексом " + (j+1)+"\n";

                }
            }
        }
        PrintArr(arr);

        try (FileWriter writer = new FileWriter("Java_hw_2//log.txt", false)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void PrintArr(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += String.valueOf(arr[i]) + " ";
        }
        System.out.println(result);
    }

}
