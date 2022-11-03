/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package jobsheet_10;

/**
 *
 * @author ASUS
 */

public class InformatikaUNP {
    public static void main(String[] args){
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama : "+ informatika.nama);
        System.out.println("NIM : "+ informatika.nim);
        System.out.println("Jurusan : "+ informatika.jur);
        System.out.println("Status : "+ informatika.univ);
        
        System.out.println("-----------------------------");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama : "+ elektronika.nama);
        System.out.println("NIM : "+ elektronika.nim);
        System.out.println("Jurusan : "+ elektronika.jur);
        System.out.println("Status : "+ elektronika.univ);
    }
}
