public class Balok {
    int panjang, lebar, tinggi;

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    protected void hasil() {
        Perhitungan ph = new Perhitungan();
        System.out.println("Hasil luas Balok: " + ph.luas(this));
        System.out.println("Hasil volume Balok: " + ph.volume(this));
    }

}