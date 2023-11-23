abstract class Karyawan {
    String nama, pekerjaan;
    Double gaji_pokok, potongan_gaji,tunjangan, gaji_bersih;
    int masa_kerja;

    public String set_nama(String nama){
        this.nama = nama;
        return this.nama;
    }
    public String set_pekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
        return this.pekerjaan;
    }
    public Double set_gaji_pokok(Double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
        return this.gaji_pokok;
    }
    public Double set_potongan_gaji(Double potongan_gaji){
        this.potongan_gaji = potongan_gaji;
        return this.potongan_gaji;
    }
    public int set_masa_kerja(int masa_kerja){
        this.masa_kerja = masa_kerja;
        return this.masa_kerja;
    }


    public String get_nama(){
        return this.nama;
    }
    public String get_pekerjaan(){
        return this.pekerjaan;
    }
    public Double get_gaji_pokok(){
        return this.gaji_pokok;
    }
    public Double get_potongan_gaji(){
        return this.potongan_gaji;
    }
    public int get_masa_kerja(){
        return this.masa_kerja;
    }

    public abstract void hitung();

}