//PUNYA ALTAF MUHAMMAD HERMANSYAH
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        //INI VARIABEL
        String hello, terimakasih;
        Float angka1, angka2, hasil;
        Byte hitung;
        Scanner woi;
        //INI NILAI DARI VARIABEL
        hello = "INI KALKULATOR BOSS";
        terimakasih = "Terima Kasih telah Mencoba \n<3";
        woi = new Scanner(System.in);
        //INI SYSTEMNYA
        System.out.println(hello);
        System.out.print("Masukan Angka Pertama = ");
        angka1 = woi.nextFloat();
        System.out.print(" 1. + \n2. - \n3. * \n4. / \n5. %  = ");
        hitung = woi.nextByte();
        System.out.print("Masukan Angka Kedua = ");
        angka2 = woi.nextFloat();

        if (hitung == 1){
            hasil = angka1 + angka2;
            System.out.println("Jadi " + angka1 + " + " + angka2 + " = " + hasil);
            System.out.println(terimakasih);
        }
        else if (hitung == 2){
            hasil = angka1 - angka2;
            System.out.println("Jadi " + angka1 + " - " + angka2 + " = " + hasil);
            System.out.println(terimakasih);
        }
        else if (hitung == 3){
            hasil = angka1 * angka2;
            System.out.println("Jadi " + angka1 + " * " + angka2 + " = " + hasil);
            System.out.println(terimakasih);
        }
        else if (hitung == 4){
            hasil = angka1 / angka2;
            System.out.println("Jadi " + angka1 + " / " + angka2 + " = " + hasil);
            System.out.println(terimakasih);
        }
        else if (hitung == 5){
            hasil = angka1 % angka2;
            System.out.println("Jadi " + angka1 + " % " + angka2 + " = " + hasil); 
            System.out.println(terimakasih);
        }
        else {
            System.out.println("ERROR BANG \nTERIMA KASIH -_- ");
        }
    }
}
