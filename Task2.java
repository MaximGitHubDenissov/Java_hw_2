package Java_hw_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task2 {
    public static void main(String[] args) {
        File f = new File("Java_hw_2//test.txt");
        try{
            try(BufferedReader br = new BufferedReader(new FileReader(f))){
                String line;
                String result = "";
                while((line=br.readLine()) != null){
                    result += line + "\n";
                }
                String[]arr = result.split("\n");
                for (String row : arr) {
                    String [] arr2 = row.split(",");
                    String name = arr2[0].substring(arr2[0].indexOf(":")+2, arr2[0].length()-1);
                    String mark = arr2[1].substring(arr2[1].indexOf(":")+2, arr2[1].length()-1);
                    String lesson = arr2[2].substring(arr2[2].indexOf(":")+2,arr2[2].length()-1);
                    System.out.printf("Студент %s получил %s по предмету %s", name,mark,lesson+"\n");                       
                    }
                }  
            
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}

