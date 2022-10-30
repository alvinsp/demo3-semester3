public class Perhitungan extends Balok {

    static long luas, volume;

    void perhitungan() {
        Perhitungan sisi = new Perhitungan();
        volume(sisi);
        luas(sisi);
    }

    long luas(Balok sisi) {
        return sisi.getPanjang() * sisi.getLebar() * sisi.getTinggi();
    }

    long volume(Balok sisi) {
        return volume = 4 * sisi.getLebar() * sisi.getPanjang() * sisi.getTinggi();
    }

    static boolean isCube1(long input){
        return (Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) == input);
    }

    static boolean isCube(long input) {
        long cube = Math.round(Math.cbrt(input));
        System.out.println(cube * cube * cube);
        return (cube * cube
                * cube) == input;
    }
}
