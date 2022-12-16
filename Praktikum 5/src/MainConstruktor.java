public class MainConstruktor {
    public static void main(String[] args) {
        manager manager = new manager(8000000);
        programmer anto = new programmer(7000000);

        manager.cetakinfo();
        System.out.println("Tunjangan : "+ manager.gettunjangan()+"\n");

        anto.cetakinfo();
        System.out.println("Bonus     : " + anto.getBonus());




    }
}
