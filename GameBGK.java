import java.util.Random;
import java.util.Scanner;

public class GameBGK {
    public static void main(String[] args) {
                //ini para variabel
                String welkom, trims, name, question;
                int player, bot, randombot;
                int minrand, maxrand;
                Scanner choose, insert;
                Random number;
                //nilai variable
                welkom = "=============>> This is BATU GUNTING KERTAS GAME Vs BOT <<=============";
                trims = "Terima Kasih Bro Telah Mencoba Game ini\nWalau Game Sangat Simple :) <3";
                question = "CHOOSE (1 FOR BATU) / (2 FOR GUNTING) / (3 FOR KERTAS) ===>>> ";
                choose = new Scanner(System.in);
                insert = new Scanner(System.in);
                number = new Random();
                minrand = 1;
                maxrand = 3;
                randombot = minrand + number.nextInt(maxrand);

                System.out.println(welkom);
                System.out.println();
                System.out.print("Enter Your Name ==>> ");
                name = insert.nextLine();
                System.out.print("\n" + question);
                player = choose.nextInt();
                bot = randombot;
                name = name.toUpperCase();
                if ((player == 1) && (bot == 2) || (player == 2) && (bot == 3) || (player == 3) && (bot == 1)){
                    System.out.println("BOT CHOOSE ==>> " + bot);
                    System.out.println();
                    System.out.println("CONGRATULATION FOR " + name + "\n" + name + " WIN the Game\n");
                    System.out.println(trims);
                }
                else if ((player == 1) && (bot == 1) || (player == 2) && (bot == 2) || (player == 3) && (bot == 3)){
                    System.out.println("BOT CHOOSE ==>> " + bot);
                    System.out.println();
                    System.out.println("CONGRATULATION FOR " + name + " and BOT" + "\n" + name + " DRAW the Game\n");
                    System.out.println(trims);
                }
                else if ((player == 1) && (bot == 3) || (player == 2) && (bot == 1) || (player == 3) && (bot == 2)){
                    System.out.println("BOT CHOOSE ==>> " + bot);
                    System.out.println();
                    System.out.println("CONGRATULATION FOR BOT \n" + name + " LOSE the Game\n");
                    System.out.println(trims);
                }
                else {
                    System.out.println("Pilihan anda SALAH BRO");
                }


    }

    
}