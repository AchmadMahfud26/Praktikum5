public class manager extends pegawai{
    private double Tunjangan;

    public manager(double Tunjangan){
        super("IRFAN MAULANA",5000000);
        this.Tunjangan = Tunjangan;

    }

    @Override
    float Nama() {
        return super.Nama();
    }

    @Override
    float GajiPokok() {
        return super.GajiPokok();
    }

    //setter
    public void settunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    public double gettunjangan(){
        return this.Tunjangan;
    }
    void cetakInfo() {
        super.cetakinfo();
        System.out.println("Tunjangan : " + gettunjangan());

    }
}

