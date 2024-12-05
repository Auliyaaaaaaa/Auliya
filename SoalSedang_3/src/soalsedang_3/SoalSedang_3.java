/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalsedang_3;

import java.util.Scanner;


public class SoalSedang_3 {
    public static void main(String[] args) {
        
        //tipe data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Jawablah soal-soal berikut. Ketik 'stop' untuk berhenti.");

        //perulangan
        while (true) {
            //tipe data
            int bil1 = (int) (Math.random() * 10) + 1; 
            int bil2 = (int) (Math.random() * 10) + 1;
            //aritmatika
            int jawabanBenar = bil1 + bil2;

            System.out.println("Berapa hasil dari: " + bil1 + " + " + bil2 + " ?");
            System.out.print("Jawaban Anda (atau ketik 'stop'): ");
            String input = scanner.nextLine();
            
            
            //percabangan
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
            //percabangan
            try {
                int jawabanUser = Integer.parseInt(input);
                if (jawabanUser == jawabanBenar) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah! Jawaban yang benar adalah: " + jawabanBenar);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka atau ketik 'stop'.");
            }
        }
    }
}

       
    
    

