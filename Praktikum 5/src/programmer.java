import com.sun.org.glassfish.external.statistics.BoundaryStatistic;

public class programmer extends pegawai {
    private double Bonus;

    programmer (double Bonus) {
        super("ACHMAD MAHFUD ",5000000);
        this.Bonus = Bonus;

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
    public void setBonus(double Bonus){
        this.Bonus = Bonus;
    }
    public double getBonus(){
        return this.Bonus;
    }


    void cetakInfo() {
        super.cetakinfo();
        System.out.println("Bonus = " + getBonus());

    }
}
