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
public class Pertemuan1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] datas = {
            "191011401643", "Robby Maulana", "A"
        };
        
        double[] nilai = {
            90, 90
        };
        
        String nim, nama, grade;
        double uts, uas, rata;
        
        System.out.println("Data :");
        System.out.println("NIM :"); 
//        nim = input.next();
        nim = datas[0];
        System.out.println("Nama :"); 
//        nama = input.next();
        nama = datas[1];
        System.out.println("Nilai UTS :");
//        uts = input.nextDouble();
        uts = nilai[0];
        System.out.println("Nilai Uas :");
//        uas = input.nextDouble();
        uas = nilai[1];
        
        rata = (uts*uas)/2;
        
        if (rata <= 50) {
            grade = "E";
        }else if (rata < 60) {
            grade = "D";
        }else if (rata < 70) {
            grade = "C";
        }else if (rata < 80) {
            grade = "B";
        }else {
            grade = "A";
        }
        
        System.out.println("====================================================");
        System.out.println("NIM\t\tNama\t\tUTS\tUAS\tGrade");
        System.out.println("====================================================");
        System.out.println(nim + "\t" + nama + "\t" + uts + "\t" + uas + "\t" + grade);
        System.out.println("");
        System.out.println("");
    }
    
}
