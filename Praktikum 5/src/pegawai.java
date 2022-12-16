public class pegawai {
    private String Nama;
    private double GajiPokok;


    pegawai(String Nama, double GajiPokok) {
        this.Nama = Nama;
        this.GajiPokok = GajiPokok;
    }

    float Nama() {
        System.out.println("Nama : "+this.Nama) ;
        return 0;
    }

    float GajiPokok() {
        System.out.println("GajiPokok "+ this.GajiPokok);
        return 0;
    }
    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void  setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }
    public String getNama(){
        return this.Nama;
    }
    public double getGajiPokok(){
        return this.GajiPokok;
    }
    void cetakinfo(){
        System.out.println("Nama      : "+getNama());
        System.out.println("GajiPokok : "+ getGajiPokok());
    }
}
