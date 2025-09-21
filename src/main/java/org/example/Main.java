package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Введите вес в кг");  
        double weight = input.nextDouble(); 
        System.out.println("Введите рост в см");  
        double height = input.nextDouble(); 
        double bmi = weight / (height*height/10000);
        System.out.println("Ваш индекс массы тела "+ bmi);
        if (bmi < 18.5) {
            System.out.println("У вас недостаточный вес");  
        }
        if (bmi < 25.0 && bmi >= 18.5){
            System.out.println("У вас нормальный вес");  
        }
        if (bmi < 30.0 && bmi >= 25.0){
            System.out.println("У вас избыточный вес");  
        }
        if (bmi >= 30){
            System.out.println("У вас ожирение");  
        }
    }
}