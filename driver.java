public class driver {
    public static void main(String[] args) {
        Balok driv = new Balok();
        Perhitungan input = new Perhitungan();

        driv.setPanjang(12);
        driv.setLebar(12);
        driv.setTinggi(12);

        System.out.println(" ==== HASIL BALOK ==== ");
        driv.hasil();

        System.out.println("ya kotak " + input.isCube(729));

        // driv.hasil();

    }

}
