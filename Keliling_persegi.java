package Latihan_4;
import java.util.Scanner;

public class Keliling_persegi {

    public static void main (String []args){

        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;

        System.out.println("Masukkan panjang persegi : ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar persegi : ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("keliling persegi panjang adalah : " + keliling);
    }
    
}
