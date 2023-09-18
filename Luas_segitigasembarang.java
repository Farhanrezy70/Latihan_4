package Latihan_4;
import java.util.Scanner;

public class Luas_segitigasembarang {
    
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);

        int alas;
        int tinggi;
        int luas;

        System.out.println("Masukkan alas : ");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        tinggi = input.nextInt();

        luas = alas *  tinggi / 2;

        System.out.println("luas segitiga sembarang adalah : " + luas);
    }
}
