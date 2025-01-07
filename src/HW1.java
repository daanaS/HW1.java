import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        String AmountOfPassengers;
        final int NUM = 0;
        String word = "passengers";
        AmountOfPassengers = NUM + word;
        System.out.println(NUM);
        System.out.println(word);
        System.out.println(AmountOfPassengers);
        if(NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }else if(NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = input.nextLine();
        System.out.println("Привет," + name);
    }
}

