
package praktikum_overriding_overloading;


public class praktikum_overriding {


    public static void main(String[] args) {
        System.out.println("== menampilkan dafatr spesifikasi hp ==");
        
        //membuat objek baru
        oppo oppo = new oppo();
        samsung samsung = new samsung();
        nokia nokia = new nokia();
        
        //nokia --> mengisi data dari spesifikasi nokia
        nokia.nama = "nokia 3310";
        nokia.layar = "Monochrome graphic";
        nokia.ram = 256;
        nokia.penyimpanan = 512;
        nokia.resolusi = 2;
        
        //oppo --> menisi data spesifikasi oppo
        oppo.nama = "oppo a39";
        oppo.warna = "krem";
        oppo.layar = " IPS LCD";
        oppo.ram = 3;
        oppo.penyimpanan = 32;
        oppo.resolusi = 13;
        
        //samsung --> mengisi data spesifikasi samsung
        samsung.nama = "samsung galaxy a12";
        samsung.warna = "biru";
        samsung.layar = "PLS IPS";
        samsung.ram = 6;
        samsung.penyimpanan = 128;
        samsung.resolusi = 48;
        
        //mencetak seluruh spesifikasi hp
        System.out.println("====| oppo |====");
        oppo.spek();
        System.out.println();
        System.out.println("====| samsung |====");
        samsung.spek();
        System.out.println();
        System.out.println("===| nokia |====");
        nokia.spek();
        
        
    }
    
}

//membuat parent class / super class yang diisi dengan sifat-sifat dasar objek
class hpdasar{
    String nama, layar, warna;
    int ram, penyimpanan, resolusi;
    
    void spek(){
        System.out.println("nama        : "+ nama);
        System.out.println("layar       : "+ layar);
        System.out.println("warna       : "+ warna);
        System.out.println("ram         : "+ ram +"Gb");
        System.out.println("penyimpanan : "+ penyimpanan +"Gb");
        System.out.println("resolusi    : "+ resolusi+ "mp");
    }
}

//membuat sub class oppo dengan super class hpdasar yang memiliki sifat yang serupa
class oppo extends hpdasar{ }

//membuat sub class samsung dengan super class hpdasar yang memiliki sifat yang serupa
class samsung extends hpdasar{ }

//membuat sub class nokia dengan super class hpdasar yang memiliki sifat yang mirip
class nokia extends hpdasar{
    
    //mengubah atau meng override method pada super class
    @Override
    void spek(){
        System.out.println("nama        : "+ nama);
        System.out.println("layar       : "+ layar);
        System.out.println("warna       : hijau");
        System.out.println("ram         : "+ ram+"mb");
        System.out.println("penyimpanan : "+ penyimpanan+"mb");
        System.out.println("resolusi    : "+ resolusi);
        System.out.println("note : hp masih berupa keyboard fisik dan hanya menjangkau sinyal 2g");
        
    }
}