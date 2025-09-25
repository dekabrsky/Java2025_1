package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                double weight = Double.parseDouble(args[0]);
                double height = Double.parseDouble(args[1]) / 100.0;
                
                if (height == 0) {
                    System.out.println("Ошибка: рост не может быть нулевым");
                    return;
                }
                
                double bmi = weight / (height * height);
                if (bmi < 18.5) {
                    System.out.println("Ваш BMI<18.5, это говорит о недостаточном весе");
                } else if (bmi < 25.0) {
                    System.out.println("Ваш BMI в пределах нормы, продолжайте в том же духе");
                } else if (bmi < 30.0) {
                    System.out.println("Ваш BMI в пределах от 25 до 30, это говорит об избыточном весе");
                } else {
                    System.out.println("Ваш BMI больше 30, это говорит об ожирении");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, не все аргументы являются числами");
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } else {
            System.out.println("Wrong format. Использование: программа <вес> <рост>");
        }
    }
}
