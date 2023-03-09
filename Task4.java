package Java_hw_2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = in.nextInt();
        System.out.println("Введите операцию: +,-,*,/");
        char oper = in.next().charAt(0);
        System.out.println("Введите второе число: ");
        int numberTwo = in.nextInt();
        String text ="";
        if (oper == '+'){
            summ(numberOne,numberTwo);
            text = String.valueOf(numberOne) + "+" + String.valueOf(numberTwo) 
            + "=" + String.valueOf(numberOne+numberTwo) + "\n";
            
        }
        if (oper == '-'){
            sub(numberOne,numberTwo);
            text = String.valueOf(numberOne) + "-" + String.valueOf(numberTwo) 
            + "=" + String.valueOf(numberOne-numberTwo) + "\n";
        }
        if (oper == '*'){
            mult(numberOne, numberTwo);
            text = String.valueOf(numberOne) + "*" + String.valueOf(numberTwo) 
            + "=" + String.valueOf(numberOne*numberTwo) + "\n";
        }
        if (oper == '/'){
            dev(numberOne, numberTwo);
            text = String.valueOf(numberOne) + "/" + String.valueOf(numberTwo) 
            + "=" + String.valueOf(numberOne/numberTwo) + "\n";
        }
        in.close();
        try (FileWriter writer = new FileWriter("Java_hw_2//log2.txt", true)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }    

    }
        static void summ(int a, int b) {
            System.out.printf("%d + %d = %d",a,b,a+b);
    }
        static void sub(int a, int b) {
            System.out.printf("%d - %d = %d",a,b,a-b);
    }
        static void mult(int a, int b) {
            System.out.printf("%d * %d = %d",a,b,a*b);
    }
        static void dev(int a, int b) {
            System.out.printf("%d / %d = %d",a,b,a/b);
        }
    
}