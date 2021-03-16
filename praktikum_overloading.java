
package praktikum_overriding_overloading;
import java.util.Scanner;

public class praktikum_overloading {


    public static void main(String[] args) {
        //deklarasi variabel
        char pilih;
        int a, b, c;
        
        //membuat objek baru
        Scanner input = new Scanner(System.in);
        kalkulator kalku = new kalkulator();
        
        //menginputkan banyak angka yang terlibat dalam operasi
        System.out.println("== kalkulator lebih dari 2 dan 3 angka ==");
        System.out.println("pilih operasi\n1. 2 angka\n2. 3 angka");
        int op = input.nextInt();
        
        //membuat percabangan dari hasil input untuk menentukan banyak angka yang terlibat
        if (op == 1){
            
            //menginputkan jenis operasi dan nilai dari angka yang akan di operasikan
            System.out.println("masukan jenis operasi\na. penjumlahan\nb. pengurangan\nc. perkalian\nd. pembagian");
            pilih = input.next().charAt(0);
            System.out.println("masukan angka ke-1 :");
            a = input.nextInt();
            System.out.println("masukan angka ke-2 :");
            b = input.nextInt();
            
            System.out.println("hasil dari operasi adalah\n==>"+kalku.operasi(a, b, pilih));
            }
        
        else if (op ==2){
            
            //menginputkan jenis operasi dan nilai dari angka yang akan di operasikan
            System.out.println("masukan jenis operasi\na. penjumlahan\nb. pengurangan\nc. perkalian\nd. pembagian");
            pilih = input.next().charAt(0);
            System.out.println("masukan angka ke-1 :");
            a = input.nextInt();
            System.out.println("masukan angka ke-2 :");
            b = input.nextInt();
            System.out.println("masukan angka ke-3 :");
            c = input.nextInt();
            
            System.out.println("hasil dari operasi adalah\n==>"+kalku.operasi(a, b, c, pilih));
            }
        
        else{
            System.out.println("maaf masukan tidak valid");
        }
        
    }
}

//membuat class baru untuk operasi angka
class kalkulator{
    
    //membuat method operasi yang memiliki parameter untuk memasukan 3 angka dan 1 pilihan operasi
    int operasi(int a, int b, int c, char pilih){
        
        //membuat percabangan untuk menentukan jenis operasi
        switch (pilih) {
            case 'a':
                return a+b+c;
            case 'b':
                return a-b-c;
            case 'c':
                return a*b*c;
            case 'd':
                return a/b/c;
            default:
                break;
        }
        return 0;
    }
    
    //membuat method operasi yang memiliki parameter untuk memasukan 2 angka dan 1 pilihan operasi
    int operasi(int a, int b, char pilih){
        
        //membuat percabangan untuk menentukan jenis operasi
        switch (pilih) {
            case 'a':
                return a+b;
            case 'b':
                return a-b;
            case 'c':
                return a*b;
            case 'd':
                return a/b;
            default:
                break;
        }
        return 0;
    }
    
    
}