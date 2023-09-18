package Latihan_4;
import java.util.Scanner;

public class Keliling_segitigasamakaki {
    
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int SisiA ;
        int SisiB ; 
        int SisiC ;
        int keliling;

        System.out.println("Masukkan Sisi A : ");
        SisiA = input.nextInt();
        System.out.println("Masukkan Sisi B : ");
        SisiB = input.nextInt();
        System.out.println("Masukkan Sisi C : ");
        SisiC = input.nextInt();

        keliling = SisiA + SisiB + SisiC;

        System.out.println("keliling segitiga sama kaki adalah : " + keliling);
    }
}
