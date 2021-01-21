//Package (Kumpulan class class)
package main;

/**
 *
 * @author Yusuf Isra
 */

//Class (Dimana class disini bukan public tetapi class biasa, pada dasarnya sama sama bisa diakses oleh kelas lain)
class Main {

        //Method public static void main, untuk menjalankan script yang ada di class ini dan juga class lain yang terhubung
    public static void main(String[] args) {
        
        //Object dari class hewan
    hewan kucing = new hewan("kucing", 10);

        //Memanggil method dari class lain ("berjalan", dan "makan" dimana masing masing method diberi nilai/variabel)
    kucing.berjalan(2);
    kucing.makan("Ikan");
    }
    
}
