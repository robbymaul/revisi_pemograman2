/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisipemrograman2;

/**
 *
 * @author TOSHIBA
 */
public class Mahasiswa {
    
    private String nim, nama, grade;

    
    private float uts, uas, nilakhir;
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    public float getUas() {
        return uas;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }
    
    public float getNilaiAkhir(){
      nilakhir = (uts + uas)/2; 
      return nilakhir;
    };
    public void setNilakhir(float nilakhir) {
        this.nilakhir = nilakhir;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getGrade(){
        if (nilakhir <= 50) {
            grade = "E";
        }else if (nilakhir < 60) {
            grade = "D";
        }else if (nilakhir < 70) {
            grade = "C";
        }else if (nilakhir < 80) {
            grade = "B";
        }else {
            grade = "A";
        }
        return grade;
    };
    
    
}
