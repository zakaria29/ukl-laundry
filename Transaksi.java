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
public class Transaksi {
    JenisLaundry selectedLaundry;
    double jumlah;
    double total;

    public Transaksi(JenisLaundry selectedLaundry, double jumlah) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
    }
    
}
