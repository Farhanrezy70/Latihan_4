package Latihan_4;
import java.util.Scanner;

public class Keliling_lingkaran {
    
    public static void main (String []args){

        Scanner input =new Scanner(System.in);

        double keliling, phi = 3.14;
        int diameter;

        System.out.println("Masukkan diameter : ");
        diameter = input.nextInt();

        keliling = phi * diameter;

        System.out.println("keliling lingkaran adalah : " + keliling);
    }
}
