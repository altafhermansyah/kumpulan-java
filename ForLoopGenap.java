import java.util.Scanner;

public class ForLoopGenap {
    public static void main(String[] args) {
        String nama;
        int firstnum, lastnum, result, total;
        Scanner enter;

        nama = "Aplikasi Loop Increment / Decrement Genap";
        enter = new Scanner(System.in);
        total = 0;

        System.out.println(nama);
        System.out.print("Enter First Number ==> ");
        firstnum = enter.nextInt();
        System.out.print("Enter Last Number ==> ");
        lastnum = enter.nextInt();
        if (firstnum < lastnum){
            for (result = firstnum ; result <= lastnum ; result++){
                if (result % 2 == 0){
                    total += result;
                    System.out.println("Number => " + result);
                }
            }
            System.out.println("Total => " + total);
        }
        else if (firstnum > lastnum){
            for (result = firstnum ; result >= lastnum ; result--){
                if (result % 2 == 0){
                    total += result;
                    System.out.println("Number => " + result);
                }
            } 
            System.out.println("Total => " + total);
        }
        else {
            System.out.println("Kalo angka mu sama itu bukan perulangan bang -_-");
        }

    }
    
}
