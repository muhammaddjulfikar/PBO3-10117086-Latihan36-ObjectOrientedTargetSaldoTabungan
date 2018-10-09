/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan36.objectorientedtargetsaldotabungan;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM : program tentang target saldo tabungan
 */
public class PBO310117086Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo, saldoTarget);
    }

}
