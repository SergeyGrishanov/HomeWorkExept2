package work1;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) {
    boolean work = true;
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float fNumber = Float.parseFloat(num.readLine());
                System.out.printf("Число = %.3f\n", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод! Пожалуйся, ");
            }
    }
}
}
