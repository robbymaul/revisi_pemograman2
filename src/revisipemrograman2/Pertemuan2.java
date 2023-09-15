/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisipemrograman2;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Pertemuan2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[0];
        
        int jml, pil;
        double nuts, nuas;
        
        do { 
            System.out.println("Pilih Menu");
            System.out.println("================================================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar Program");
            System.out.println("================================================");
            System.out.println("Pilih Menu ?");
            pil = input.nextInt();
            System.out.println("");
            
            switch (pil) {
                case 1:
                    System.out.println("Jumlah Data :");
                    jml = input.nextInt();
                    mahasiswa = new Mahasiswa[jml];
                    for (var i = 0; i < jml; i++) {
                        mahasiswa [i] = new Mahasiswa();
                        System.out.println("Data ke: " + i+1);
                        System.out.println("Nim :");
                        mahasiswa[i].setNim(input.next());
                        System.out.println("Nama : ");
                        mahasiswa[i].setNama(input.next());
                        System.out.println("Nilai UTS");
                        nuts = input.nextFloat();
                        System.out.println("Nilai UAS");
                        nuas = input.nextFloat();
                        
                        mahasiswa[i].setUts((float) nuts);
                        mahasiswa[i].setUas((float) nuas);
                    }
                    break;
                case 2: 
                    System.out.println("Tampil Data");
                int i = 0;
                    while (i<mahasiswa.length) {                        
                        System.out.println("Data : " + i+1);
                        System.out.println("NIM" + mahasiswa[i].getNim());
                        System.out.println("Nama");
                        mahasiswa[i].getNama();
                        System.out.println("Nilai UTS: " + mahasiswa[i].getUts());
                        System.out.println("Nilai UAS: " + mahasiswa[i].getUas());
                        System.out.println("Nilai Akhir: " + mahasiswa[i].getNilaiAkhir());
                        System.out.println("Nilai grade: " + mahasiswa[i].getGrade());
                        i++;
                    }
                    break;
                 case 3:
                     System.out.println("Selesai");
                   
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pil < 3);
        
    }
    
}
