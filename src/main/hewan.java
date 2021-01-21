//Package (Kumpulan class class)
package main;

/**
 *
 * @author Yusuf Isra
 */

//Class (Dimana class disini bukan public tetapi class biasa, pada dasarnya sama sama bisa diakses oleh kelas lain)
class hewan {
    
      //Menentukan jenis variabel (String)
      String nama;
  //Menentukan jenis variabel (Int)
  int energi;
  
  //Object yang akan digunakan di class main
  hewan(String nama, int energi){
      
      //this = menyatakan variabel yang ada di dalam class
    this.nama = nama;
    this.energi = energi;
  }

  //Method void, dimana method ini akan digunakan di class Main untuk dijalankan
  
  /*
  "berjalan" merupakan nama dari method perulangan ini, yang di dalamnya terdapat 
  variabel dengan tipe data integer sebagai penunjuk jumlah langkah yang diinginkan
  */
  void berjalan(int langkah){
      
      //Perulangan dimana perulangan ini akan mengulang suatu kata (String) dalam jumlah tertentu (tergantung berapa nilai "langkah")
    for(int i = 1;i<=langkah;i++){
        //Mencetak kata melangkah (output)
      System.out.println("melangkah");
      //energi akan berkurang
      this.energi--;
    }
  }

  //Method void, dimana method ini nantinya akan digunakan di class Main untuk dijalankan bersama dengan method lainnya
  /*
  "makan" disini merupakan nama dari method percabangan ini. Dan didalam method ini
  terdapat nilai yang tipe datanya String (kata), dimana nilai ini nantinya akan didapat saat method didalam class main
  diberi nilai/variabel/nama.
  */
  void makan(String makanan){
      //Percabangan If dan Else
      //Jika energi lebih besar dari 5, maka akan mencetak pesan "Kenyang!!"
    if(this.energi > 5){
      System.out.println("Masih Kuat & Kenyang Bosku!!");
      //Sementara jika energi sudah habis atau energi lebih kecil dari 5, akan mencetak  output "Oke, lancar!!"
    }else{
      //Mencetak kata "Oke, lancar!!" (output)
      System.out.println("Capek Bosku, butuh makan!!");
    } 
  }
}
