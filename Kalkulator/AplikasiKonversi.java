package Kalkulator;

import java.util.Scanner;

import Kalkulator.suhu.Celsius;
import Kalkulator.suhu.Fahrenheit;
import Kalkulator.suhu.Kelvin;
import Kalkulator.suhu.Reamur;
import Kalkulator.suhu.Suhu;
import Kalkulator.waktu.Detik;
import Kalkulator.waktu.Hari;
import Kalkulator.waktu.Jam;
import Kalkulator.waktu.Menit;
import Kalkulator.waktu.Minggu;
import Kalkulator.waktu.Waktu;

public class AplikasiKonversi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("\tNama  : Sumitra Adriansyah");
        System.out.println("\tNIM   : 1217050137");
        System.out.println("\tKelas : C");
        System.out.println("================================================");
        int menu;

        do {
            System.out.println("\n================================================");
            System.out.println("\t\tMENU KALKULATOR");
            System.out.println("================================================");
            System.out.println("1. Konversi Suhu");
            System.out.println("2. Konversi Waktu");
            System.out.println("0. Keluar");
            System.out.println("--------------------------------------------------");
            System.out.print("Input pilihan menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n================================================");
                    System.out.println("\t\tMenu Konversi Suhu");
                    System.out.println("================================================");
                    System.out.println("Pilihan konversi suhu:");
                    System.out.println("1. Celsius");
                    System.out.println("2. Fahrenheit");
                    System.out.println("3. Reamur");
                    System.out.println("4. Kelvin");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Pilih jenis suhu yang akan dikonversi: ");
                    int menuSuhu = scanner.nextInt();

                    System.out.print("Masukkan suhu sesuai menu yang anda pilih [C/F/R/K]: ");
                    double suhuValue = scanner.nextDouble();

                    Suhu suhu;

                    switch (menuSuhu) {
                        case 1:
                            suhu = new Celsius(suhuValue);
                            break;
                        case 2:
                            suhu = new Fahrenheit(suhuValue);
                            break;
                        case 3:
                            suhu = new Reamur(suhuValue);
                            break;
                        case 4:
                            suhu = new Kelvin(suhuValue);
                            break;
                        default:
                            System.out.println("Pilihan menu yang anda pilih tidak ada. Kembali ke menu utama.");
                            continue;
                    }
                    System.out.println("\n================================================");
                    System.out.println("\t\tHasil Konversi");
                    System.out.println("================================================");
                    System.out.println("Celsius     : " + suhu.toCelsius());
                    System.out.println("Fahrenheit  : " + suhu.toFahrenheit());
                    System.out.println("Reamur      : " + suhu.toReamur());
                    System.out.println("Kelvin      : " + suhu.toKelvin());
                    break;

                case 2:
                    System.out.println("\n================================================");
                    System.out.println("\t\tMenu Konversi Waktu");
                    System.out.println("================================================");
                    System.out.println("Pilihan konversi waktu:");
                    System.out.println("1. Detik");
                    System.out.println("2. Menit");
                    System.out.println("3. Jam");
                    System.out.println("4. Hari");
                    System.out.println("5. Minggu");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Pilih jenis waktu yang akan dikonversi: ");
                    int menuWaktu = scanner.nextInt();

                    System.out.print("Masukkan waktu [Detik/Menit/Jam/Hari/Minggu]: ");
                    int waktuValue = scanner.nextInt();

                    Waktu waktu;

                    switch (menuWaktu) {
                        case 1:
                            waktu = new Detik(waktuValue);
                            System.out.println("\n================================================");
                            System.out.println("\t\tHasil Konversi");
                            System.out.println("================================================");
                            System.out.println("Detik   : " + waktu.toDetik());
                            System.out.println("Menit   : " + waktu.toMenit());
                            System.out.println("Jam     : " + waktu.toJam());
                            System.out.println("Hari    : " + waktu.toHari());
                            System.out.println("Minggu  : " + waktu.toMinggu());
                            break;
                        case 2:
                            waktu = new Menit(waktuValue);
                            System.out.println("\n================================================");
                            System.out.println("\t\tHasil Konversi");
                            System.out.println("================================================");
                            System.out.println("Detik   : " + waktu.toDetik());
                            System.out.println("Menit   : " + waktu.toMenit());
                            System.out.println("Jam     : " + waktu.toJam());
                            System.out.println("Hari    : " + waktu.toHari());
                            System.out.println("Minggu  : " + waktu.toMinggu());
                            break;
                        case 3:
                            waktu = new Jam(waktuValue);
                            System.out.println("\n================================================");
                            System.out.println("\t\tHasil Konversi");
                            System.out.println("================================================");
                            System.out.println("Detik   : " + waktu.toDetik());
                            System.out.println("Menit   : " + waktu.toMenit());
                            System.out.println("Jam     : " + waktu.toJam());
                            System.out.println("Hari    : " + waktu.toHari());
                            System.out.println("Minggu  : " + waktu.toMinggu());
                            break;
                        case 4:
                            waktu = new Hari(waktuValue);
                            System.out.println("\n================================================");
                            System.out.println("\t\tHasil Konversi");
                            System.out.println("================================================");
                            System.out.println("Detik   : " + waktu.toDetik());
                            System.out.println("Menit   : " + waktu.toMenit());
                            System.out.println("Jam     : " + waktu.toJam());
                            System.out.println("Hari    : " + waktu.toHari());
                            System.out.println("Minggu  : " + waktu.toMinggu());
                            break;
                        case 5:
                            waktu = new Minggu(waktuValue);
                            System.out.println("\n================================================");
                            System.out.println("\t\tHasil Konversi");
                            System.out.println("================================================");
                            System.out.println("Detik   : " + waktu.toDetik());
                            System.out.println("Menit   : " + waktu.toMenit());
                            System.out.println("Jam     : " + waktu.toJam());
                            System.out.println("Hari    : " + waktu.toHari());
                            System.out.println("Minggu  : " + waktu.toMinggu());
                            break;
                        default:
                            System.out.println("Pilihan menu yang anda pilih tidak ada. Kembali ke menu utama.");
                            continue;
                    }
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Maaf data yang anda input salah. Silakan pilih menu yang tersedia.");
                    break;
            }

            System.out.println();
        } while (menu != 0);

        scanner.close();
    }
}
