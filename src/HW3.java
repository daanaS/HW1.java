import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        double[] numbers = {1.1, 2.2, -3.3, 4.4, -5.5, -6.6, 7.7, -8.8, -9.9, 10.1, -11.1, 12.2, -13.3, -14.4, 15.5};
        double sum = 0;
        int integers = 0;
        boolean wasNegative = false;
        for(double elem : numbers){
            if(elem<0&& !wasNegative){
                wasNegative = true;
            }else if(elem>0 && wasNegative){
                sum += elem;
                integers++;
            }
        }
        System.out.println("среднее арифметическое положительных чисел, расположенных после первого отрицательного числа:" + sum/integers);
    }
}


//Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами, первые 2 числа в массиве должны быть положительными;
//Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел, расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3