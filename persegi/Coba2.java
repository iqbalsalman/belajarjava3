import java.io.*;
import java.util.Scanner;
public class Coba2{
	

	public static void HitungPersegi(){
    Scanner tes = new Scanner(System.in);
    System.out.print("Masukan Nilai Sisi Persegi : ");
    Double sisi = tes.nextDouble();

    System.out.println("Dengan Sisi "+sisi + "cm, Maka Luas Persegi Tersebut adalah "+((sisi*sisi)/100)+" m");

	 }

	public static void HitungLingkaran(){
    Scanner tes = new Scanner(System.in);
    System.out.print("Masukan Nilai Jari-jari : ");
    Double jari = tes.nextDouble();
    Double keliling=(Math.PI*2)*(jari*jari);
    System.out.println( "Maka Luas Persegi Tersebut adalah " +keliling);

	 }
	
	public static void HitungPersegipanajang(){
    Scanner tes = new Scanner(System.in);
    System.out.print("Masukan Nilai Panjang Persegi : ");
    Integer p = tes.nextInt();
    System.out.print("Masukan Lebar Persegi : ");
    Integer l = tes.nextInt();
    Integer luas = p*l;
    System.out.println( "Maka Luas Persegi Panjang " +luas);

	 }


	 public static void main(String[] args){
	 	Scanner tes = new Scanner(System.in);
	 	System.out.println("=======================================");
	 	System.out.println("1. Hitung Persegi");
	 	System.out.println("2. Hitung Lingkaran");
	    System.out.println("3. Persegi Panjang");
	    System.out.println("=======================================");
	    System.out.println("");
	    System.out.println("");
	    System.out.print("Masukan Nilai : ");
	    Integer baru = tes.nextInt();
	    if(baru==1){
	    	HitungPersegi();
	    }else if(baru==2){

        HitungLingkaran();
	    }else if(baru==3){
      HitungPersegipanajang();
         }else{
	    	System.out.println("Masukan Salah");
	    }

	  


	 }

}