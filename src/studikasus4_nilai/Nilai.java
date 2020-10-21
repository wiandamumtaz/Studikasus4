package studikasus4_nilai;

import java.util.Scanner;

public class Nilai {
    
public static void main(String [] args){
    
        String Nama;
        int Nilai_1, Nilai_2, Nilai_3;
        double Hasil_1, Hasil_2, Hasil_3, Hasil_akhir;
      
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Siswa : ");
        Nama = input.nextLine();
        System.out.print("Nilai Tugas : ");
        Nilai_1 = input.nextInt();
        System.out.print("Nilai UTS : ");
        Nilai_2 = input.nextInt();
        System.out.print("Nilai UAS : ");
        Nilai_3 = input.nextInt();
        
        Hasil_1 = 0.20*Nilai_1;
        Hasil_2 = 0.40*Nilai_2;
        Hasil_3 = 0.40*Nilai_3;
        Hasil_akhir = Hasil_1+Hasil_2+Hasil_3;
        
        System.out.println("Hasil nilai tugas : " + Hasil_1);
        System.out.println("Hasil nilai UTS : " + Hasil_2);
        System.out.println("Hasil nilai UAS : " + Hasil_3);
        System.out.println("Nilai akhir yang diperoleh yaitu : " + Hasil_akhir);
}
}