import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //Data beserta variabel nya
        String tugas, nama;
        Scanner enter;
        int firstnum, lastnum, total, result;

        
        tugas = "Ini adalah Tugas FOR LOOP";
        nama = "ALTAF MUHAMMAD HERMANSYAH";
        enter = new Scanner(System.in);
        total = 0;

        //main
        System.out.println(tugas);
        System.out.println("Punya " + nama);

        System.out.print("Input First Number ==> ");
        firstnum = enter.nextInt();
        System.out.print("Input Last Number ==> ");
        lastnum = enter.nextInt();
        if (firstnum < lastnum){
            for (result = firstnum ; result <= lastnum ; result++){
                System.out.println("Number " + result);
                total += result;
            }
            System.out.println("Totalnya = " + total);
            System.out.println("THIS IS INCREMENT LOOP");
        }
        else if (firstnum > lastnum){
            for (result = firstnum ; result >= lastnum ; result--){
                System.out.println("Number " + result);
                total += result;
            }
            System.out.println("Totalnya = " + total);
            System.out.println("THIS IS Decrement LOOP");
        }
        else {
            System.out.println("ANGKA MU SAMA ITU BUKAN PERULANGAN  -_-");
        }


    }
    
}
