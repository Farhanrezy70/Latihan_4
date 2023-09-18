package Latihan_4;
import java.util.Scanner;

public class Luas_lingkaran {
    
    public static void main (String []args){
        
        Scanner input =new Scanner(System.in);

        double luas, phi = 3.14;
        int r;

        System.out.println("Masukkan jari jari : ");
        r = input.nextInt();

        luas = phi * r * r;

        System.out.println("Luas lingkaran adalah : " + luas);
    }
}
