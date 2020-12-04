/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119053.deanghifarifaturrahman.no1;

import java.util.Scanner;
import model.Age;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program tandanya kamu
 */
public class UTSIF210119053DEANGHIFARIFATURRAHMANNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age age = new Age(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : "); age.setYearBirth(input.nextInt());
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " +  age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");        
        System.out.print("Tandanya kamu ");
        age.tandanyaKamu(age.hitungUmur());
        
    }
    
}
