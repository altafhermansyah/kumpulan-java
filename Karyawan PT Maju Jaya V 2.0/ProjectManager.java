public class ProjectManager extends Karyawan{
    public void hitung (){
        if (masa_kerja <= 5){
            tunjangan = 0.00 * gaji_pokok;
            gaji_bersih = gaji_pokok + tunjangan - (potongan_gaji * gaji_pokok);
            System.out.println();
            System.out.println("Data Karyawan");
            System.out.println("Nama            : " + get_nama());
            System.out.println("Masa Kerja      : " + get_masa_kerja() + " Tahun");
            System.out.println("Gaji Pokok      : " + get_gaji_pokok());
            System.out.println("Potongan Gaji   : " + (get_potongan_gaji() * 100) + " %");
            System.out.println("Tunjangan Gaji  : " + tunjangan);
            System.out.println("Gaji Bersih     : " + gaji_bersih);
        }
        else if (masa_kerja <= 10){
            tunjangan = 0.03 * gaji_pokok;
            gaji_bersih = gaji_pokok + tunjangan - (potongan_gaji * gaji_pokok);
            System.out.println();
            System.out.println("Data Karyawan");
            System.out.println("Nama            : " + get_nama());
            System.out.println("Masa Kerja      : " + get_masa_kerja() + " Tahun");
            System.out.println("Gaji Pokok      : " + get_gaji_pokok());
            System.out.println("Potongan Gaji   : " + (get_potongan_gaji() * 100) + " %");
            System.out.println("Tunjangan Gaji  : " + tunjangan);
            System.out.println("Gaji Bersih     : " + gaji_bersih);
        }
        else if (masa_kerja <= 20){
            tunjangan = 0.05 * gaji_pokok;
            gaji_bersih = gaji_pokok + tunjangan - (potongan_gaji * gaji_pokok);
            System.out.println();
            System.out.println("Data Karyawan");
            System.out.println("Nama            : " + get_nama());
            System.out.println("Masa Kerja      : " + get_masa_kerja() + " Tahun");
            System.out.println("Gaji Pokok      : " + get_gaji_pokok());
            System.out.println("Potongan Gaji   : " + (get_potongan_gaji() * 100) + " %");
            System.out.println("Tunjangan Gaji  : " + tunjangan);
            System.out.println("Gaji Bersih     : " + gaji_bersih);
        }
        else if (masa_kerja > 20){
            tunjangan = 0.15 * gaji_pokok;
            gaji_bersih = gaji_pokok + tunjangan - (potongan_gaji * gaji_pokok);
            System.out.println();
            System.out.println("Data Karyawan");
            System.out.println("Nama            : " + get_nama());
            System.out.println("Masa Kerja      : " + get_masa_kerja() + " Tahun");
            System.out.println("Gaji Pokok      : " + get_gaji_pokok());
            System.out.println("Potongan Gaji   : " + (get_potongan_gaji() * 100) + " %");
            System.out.println("Tunjangan Gaji  : " + tunjangan);
            System.out.println("Gaji Bersih     : " + gaji_bersih);
        }
    }

}
