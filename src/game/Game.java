/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа задумала число от 0 до 9, отгадай какое?: ");
        int attempt = 4;
        //for (int i = 0; i < 5; i++) {
        int i = 0;
        do{
            int number = random.nextInt(10);
            //System.out.print(number); для проверки
            int userNumber = scanner.nextInt();
            if (userNumber == number) {
                System.out.println("Вы угодали число!");
                break;
            }
            else
                if(i < attempt){
                    System.out.println("Неправильно, попробуйте ещё раз:");   
                }
                else{
                    System.out.println("Вы проиграли!");   
                }
                i++;
        }while(true);
        }
    }
