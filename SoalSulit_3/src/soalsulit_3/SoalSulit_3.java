/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalsulit_3;

public class SoalSulit_3 {
    public static void main(String[] args) {
        // array
        int[] array = {3, 7, 3, 1, 7, 7, 5, 7, 7, 7};
        
        
        // variable
        int palingSeringMuncul = 0;
        int nilaiTertinggi = 0;
        
        // perulangan
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            
            // perulangan
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            
            // percabangan
            if (count > palingSeringMuncul) {
                palingSeringMuncul = count;
                nilaiTertinggi = array[i];
            }
        }

        System.out.println("Nilai tertinggi yang paling sering muncul adalah " + nilaiTertinggi + " sebanyak " + palingSeringMuncul + " kali");
    }
}
    
    

