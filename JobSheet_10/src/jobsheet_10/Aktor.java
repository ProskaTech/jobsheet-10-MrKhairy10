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

public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n,int u){ //aktor adalah constructor
        nama=n;
        umur=u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : "+ nama);
        System.out.println("Umurku : "+ umur +" tahun");
    }
    
    public static void main(String[] args){
        Aktor a;
        a = new Aktor("Ronaldo",33);
        a.tampilAktor();
        System.out.println("==========");
        
        a = new Aktor("Messi",34);
        a.tampilAktor();
        System.out.println("==========");
    }
}
