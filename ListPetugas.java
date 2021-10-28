/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author ZAKARIA
 */
public class ListPetugas {
    /** pemeberian nilai pada array "list" dengan tipe class Petugas */
    Petugas[] list = {
        new Petugas(1, "Suni", "Medan", "0341", "Supervisor"),
        new Petugas(2, "Roni", "Pakis", "0341", "Kasir"),
        new Petugas(3, "Yuni", "Milan", "0341", "Manager"),
    };
    
    /** method untuk menampilkan data list petugas */
    public void viewListPetugas(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat \t Jabatan");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat() + " \t "
            + list[i].getJabatan());
        }
    }
    
    public int cariPetugas(int id){
        int foundIndex = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < list.length; i++) {
            
            /** jika id yang dicari ditemukan */
            if(list[i].getIdPetugas()== id){
                foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}
