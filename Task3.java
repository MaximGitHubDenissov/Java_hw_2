package Java_hw_2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        Ispalindrom(text);

    }

    static void Ispalindrom(String string) {
        Boolean Flag = true;
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length - 1 - i; j > arr.length - 2 - i; j--) {
                if (arr[i] != arr[j]) {
                    Flag = false;
                }
            }

        }
        System.out.println(Flag);

    }

}
