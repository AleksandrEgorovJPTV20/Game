package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        int i = 0;
        boolean victory = false;
        String choice = "yes";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while(choice.equals("yes")){
            int randomNum = random.nextInt(10);

            System.out.println("Программа загадала число от 0 до 9 пять раз. Отгадайте cлучайное число: ");
            
            do{
                int userNumber = scanner.nextInt();

                if(userNumber == randomNum){
                    System.out.println("Вы победили!");
                    victory = true;
                    break;
                }else{
                    System.out.println("Неверно, попробуйте ещё раз!\n");
                }
                if(i==4){
                    break;
                }
                i++;
            }while(true);
            
            if (!victory) {
                System.out.println("Попытки закончились! Случайное число: " + randomNum + "\n");
            }
            System.out.println("Введите yes, чтобы продолжить. \nВведите no, чтобы выйти из программы.");
            choice = scanner.next();
        }
    }
}