/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_18112022_A;



/**
 *
 * @author user
 */
public class WarnetraniExample {
    public static void main (String[] args) {
        Warnetrani student1 = new Warnetrani();
        //
        student1.setCustomername("Ani");
        student1.setCustomertype("Tetap");
        student1.setEntrydate("10 Nov 2022");
        student1.setEntrytime("08:00");
        student1.setTimeout("12:00");
        
        
        
        //
        
        System.out.println("Nama Pelanggan               :"+student1.getCustomername());
        System.out.println("Jenis Pelanggan              :"+student1.getCustomertype());
        System.out.println("Tanggal Masuk                :"+student1.getEntrydate());
        System.out.println("Waktu Masuk                  :"+student1.getEntrytime());
        System.out.println("Waktu Keluar                 :"+student1.getTimeout());
        System.out.println("Durasi                       :"+student1.getDuration());
        System.out.println("Tarif                        :"+student1.getPrice());
        }
}

 
