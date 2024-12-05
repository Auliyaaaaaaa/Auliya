/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalmudah_2;
import java.util.Scanner;
public class SoalMudah_2 {
    public static void main(String[] args) {
        //tipe data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sebuah bilangan :  ");
        int bilangan = scanner.nextInt();
        //tipe data
        boolean prima = true;

        if (bilangan < 2) {
            prima = false;
        } else {
            for (int i = 2; i < bilangan; i++) { //perulangan
                if (bilangan % i == 0) { //aritmatika
                    prima = false;
                    break;
                }
            }
        }

        if (prima) { //perulangan
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

    }

}
