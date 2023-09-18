package Latihan_4;
import java.util.Scanner;

public class Luas_persegi {

    public static void main(String[]args){
    
        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.println("Masukkan panjang persegi : ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar persegi : ");
        lebar = input.nextInt();

        luas = panjang*lebar;

        System.out.println("luas persegi panjang adalah : " + luas);
    }
}
