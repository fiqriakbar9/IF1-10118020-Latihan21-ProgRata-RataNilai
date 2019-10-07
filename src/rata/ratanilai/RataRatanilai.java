/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan nilai 
 * rata-rata dari beberapa siswa/siswi
 */
public class RataRatanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int jumlahmhs;
       int i = 1;
       double ratanilai;
       double jumlahnilai = 0;
       double nilaimhs;
       
       Scanner input = new Scanner (System.in);
       
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahmhs = input.nextInt();
        
        while (i <= jumlahmhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            
            nilaimhs = input.nextInt();
            jumlahnilai = jumlahnilai + nilaimhs;
            i++;
        }
        System.out.println(" ");
        
        //menghitung rata-rata nilai
        ratanilai = jumlahnilai / jumlahmhs;
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratanilai);
        
        System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}
