/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vitrizatia.tugas_kelompok_1;
import java.util.Scanner;

/**
 *
 * @author vitrizanailaf
 */
public class Tugas_Kelompok_1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String NmPemesan;
        int JmlOrg;
        int JmlNasgor = 0, JmlAyamBkr = 0, JmlSteak = 0, JmlKwetiaw = 0, JmlKambing = 0;

        String Menu1 = "Nasi Goreng Spesial";
        String Menu2 = "Ayam Bakar Spesial";
        String Menu3 = "Steak Sirloin Spesial";
        String Menu4 = "Kwetiaw Siram Spesial";
        String Menu5 = "Kambing Guling Spesial";

        double HrgNasgor = 9999.99;
        double HrgAyamBkr = 12345.67;
        double HrgSteak = 21108.40;
        double HrgKwetiaw = 13579.13;
        double HrgKambing = 98765.43;

        int JmlMin = Math.min(0, 10);
        int JmlMax = Math.max(0, 10);
        int Disc = 10;

        System.out.println("Selamat Siang ...");
        System.out.print("Pesan Untuk Berapa Orang\t");
        System.out.print(": ");
        JmlOrg = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Pesanan Atas Nama\t\t");
        System.out.print(": ");
        NmPemesan = keyboard.nextLine();

        System.out.println("\n");
        System.out.println("================================================");
        System.out.println("\t\tMENU SPESIAL HARI INI");
        System.out.println("================================================");

        System.out.println("1. " + Menu1 + "\t\t@ Rp. " + String.format("%.2f", HrgNasgor));
        System.out.println("2. " + Menu2 + "\t\t@ Rp. " + String.format("%.2f", HrgAyamBkr));
        System.out.println("3. " + Menu3 + "\t@ Rp. " + String.format("%.2f", HrgSteak));
        System.out.println("3. " + Menu4 + "\t@ Rp. " + String.format("%.2f", HrgKwetiaw));
        System.out.println("3. " + Menu5 + "\t@ Rp. " + String.format("%.2f", HrgKambing));
        System.out.println("================================================");
        System.out.print("\nTekan Enter Untuk Melakukan Pesanan... ");
        keyboard.nextLine();

        // System.out.println("\nPesanan Anda [Batas Pesanan 0 - 10 Porsi]");
        System.out.println("\nPesanan Anda [Batas Pesanan " + JmlMin + " - " + JmlMax + " Porsi]");
        Boolean validOrderNasgor = false;
        while (!validOrderNasgor) {
            System.out.print("1. " + Menu1 + "\t\t= ");
            JmlNasgor = keyboard.nextInt();
            validOrderNasgor = checkValidMenuInput(JmlNasgor, JmlMin, JmlMax);
        }

        Boolean validOrderAyamBkr = false;
        while (!validOrderAyamBkr) {
            System.out.print("2. " + Menu2 + "\t\t= ");
            JmlAyamBkr = keyboard.nextInt();
            validOrderAyamBkr = checkValidMenuInput(JmlAyamBkr, JmlMin, JmlMax);
        }

        Boolean validOrderSteak = false;
        while (!validOrderSteak) {
            System.out.print("3. " + Menu3 + "\t= ");
            JmlSteak = keyboard.nextInt();
            validOrderSteak = checkValidMenuInput(JmlSteak, JmlMin, JmlMax);
        }

        Boolean validOrderKwetiaw = false;
        while (!validOrderKwetiaw) {
            System.out.print("4. " + Menu4 + "\t= ");
            JmlKwetiaw = keyboard.nextInt();
            validOrderKwetiaw = checkValidMenuInput(JmlKwetiaw, JmlMin, JmlMax);
        }

        Boolean validOrderKambing = false;
        while (!validOrderKambing) {
            System.out.print("5. " + Menu5 + "\t= ");
            JmlKambing = keyboard.nextInt();
            validOrderKambing = checkValidMenuInput(JmlKambing, JmlMin, JmlMax);
        }

        double TNasgor = JmlNasgor * HrgNasgor;
        double TAyamBkr = JmlAyamBkr * HrgAyamBkr;
        double TSteak = JmlSteak * HrgSteak;
        double TKwetiaw = JmlKwetiaw * HrgKwetiaw;
        double TKambing = JmlKambing * HrgKambing;
        double TotalPembelian = TNasgor + TAyamBkr + TSteak + TKwetiaw + TKambing;
        double Diskon = TotalPembelian * Disc / 100;
        double TotalStlhDiskon = TotalPembelian - Diskon;
        double PembelianPerOrg = TotalStlhDiskon / JmlOrg;

        System.out.println("\nSelamat Menikmati Makanan Anda ...");
        System.out.println("\nPembelian : ");
        System.out.println("1. " + Menu1 + "\t\t " + JmlNasgor + "\tPorsi " + "\tX Rp. \t"
                + String.format("%.2f", HrgNasgor) + " \t= Rp. " + "\t" + String.format("%.2f", TNasgor));
        System.out.println("2. " + Menu2 + "\t\t " + JmlAyamBkr + "\tPorsi " + "\tX Rp. \t"
                + String.format("%.2f", HrgAyamBkr) + " \t= Rp. " + "\t" + String.format("%.2f", TAyamBkr));
        System.out.println("3. " + Menu3 + "\t " + JmlSteak + "\tPorsi " + "\tX Rp. \t"
                + String.format("%.2f", HrgSteak) + " \t= Rp. " + "\t" + String.format("%.2f", TSteak));
        System.out.println("4. " + Menu4 + "\t " + JmlKwetiaw + "\tPorsi " + "\tX Rp. \t"
                + String.format("%.2f", HrgKwetiaw) + " \t= Rp. " + "\t" + String.format("%.2f", TKwetiaw));
        System.out.println("5. " + Menu5 + "\t " + JmlKambing + "\tPorsi " + "\tX Rp. \t"
                + String.format("%.2f", HrgKambing) + " \t= Rp. " + "\t" + String.format("%.2f", TKambing) + "\t+");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println("Total Pembelian\t\t\t\t\t\t\t\t= Rp. " + "\t" + String.format("%.2f", TotalPembelian));
        System.out.println(
                "\nDiskon 10% (Masa Promosi)\t\t\t\t\t\t= Rp. " + "\t" + String.format("%.2f", Diskon) + "\t-");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println(
                "Total Pembelian Setelah Discount 10%\t\t\t\t\t= Rp. " + "\t" + String.format("%.2f", TotalStlhDiskon));
        System.out.println("\nPembelian Per Orang (Untuk " + JmlOrg + " Orang)\t\t\t\t\t= Rp. " + "\t"
                + String.format("%.2f", PembelianPerOrg));
        System.out.println(
                "\n=================================================================================================");
        System.out.println("\t\t\t\tTerima Kasih Atas Kunjungan Anda...");
        System.out.println(
                "=================================================================================================");
        keyboard.nextLine();
        System.out.print("\t\t\t\t   Tekan Enter Untuk Keluar...");
        keyboard.nextLine();
    }
    private static Boolean checkValidMenuInput(int amount, int min, int max) {
        if (amount < min) {
            System.out.println("Maaf, Pesanan Anda Kurang Dari Batas Pesanan");
            return false;
        } else if (amount > max) {
            System.out.println("Maaf, Pesanan Anda Lebih Dari Batas Pesanan");
            return false;
        } else {
            return true;
        }
    }
}
