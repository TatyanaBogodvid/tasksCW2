import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
        System.out.print("Введите  целое число: ");
        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();
        String num=String.valueOf(number); //простой способ получить количество цифр в числе
        int sum = 0;
        for(int i=0;i<num.length();i++)
        {
            sum+=Math.pow(Character.getNumericValue(num.charAt(i)), num.length());
        }
        if(sum==number)
        {
            System.out.print(number + " является числом Армстронга");
        }
        else {
            System.out.print(number + " не является числом Армстронга");
        }

//        Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список.

        List <String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Masha");
        names.add("Anya");
        names.add("Ivan");
        names.add("Kolya");
        List <String> names2 = new ArrayList<>();
        for(String name : names){
            StringBuilder builder = new StringBuilder(name);
            builder.deleteCharAt(0);
            String result = builder.toString();
            names2.add(result);
        }
        names2.sort(Comparator.naturalOrder());
        System.out.println(names2);
    }
}
