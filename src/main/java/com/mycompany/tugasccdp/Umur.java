package com.mycompany.tugasccdp;

/**
 * Kelas yang merepresentasikan umur.
 */
public class Umur {
    private int umur;
    private int tahun;
    private final int tahunSekarang = 2025;
    
    /**
     * Konstruktor untuk membuat objek Umur baru.
     *
     * @param tahun tahun lahir
     */
    public Umur(int tahun) {
        this.tahun = tahun;
    }
    
    /**
     * Menghitung Selisih Umur.
     *
     * @return umur sekarang
     */
    private int hitungSelisihUmur() {
        umur = tahunSekarang - tahun;
        return umur;
    }
    
    /**
     * Menampilkan Umur Sekarang
     */
    public void tampilkanUmur() {
        umur  = hitungSelisihUmur();
        System.out.println("Umur anda adalah : "  + umur);
    }
}
