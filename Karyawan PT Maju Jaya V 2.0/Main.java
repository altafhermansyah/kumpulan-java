import java.util.Scanner;
public class Main {
    public Main(){
        System.out.println("Data Karyawan PT Maju Jaya");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Karyawan pro = new Programmer();
        Karyawan man = new ProjectManager();
        Karyawan vis = new SuperVisor();
        Scanner input = new Scanner(System.in);
        int pilih;

        System.out.println("1. Programmer");
        System.out.println("2. Project Manager");
        System.out.println("3. Super Visor");
        System.out.print("Pilih pekerjaan anda : ");
        pilih = input.nextInt();
        System.out.println();

        if (pilih == 1){
            pro.set_gaji_pokok(3000000.0);
            pro.set_potongan_gaji(0.02);
            System.out.println("Masukan Data ");
            System.out.print("Nama        : " );
            pro.set_nama(input.next());
            System.out.print("Masa Kerja  : ");
            pro.set_masa_kerja(input.nextInt());
            pro.hitung();
        }
        else if (pilih == 2){
            man.set_gaji_pokok(3500000.0);
            man.set_potongan_gaji(0.02);
            System.out.println("Masukan Data ");
            System.out.print("Nama        : " );
            man.set_nama(input.next());
            System.out.print("Masa Kerja  : ");
            man.set_masa_kerja(input.nextInt());
            man.hitung();
        }
        else if (pilih == 3){
            vis.set_gaji_pokok(4500000.0);
            vis.set_potongan_gaji(0.02);
            System.out.println("Masukan Data ");
            System.out.print("Nama        : " );
            vis.set_nama(input.next());
            System.out.print("Masa Kerja  : ");
            vis.set_masa_kerja(input.nextInt());
            vis.hitung();
        }
    }
}
