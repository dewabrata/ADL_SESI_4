package com.adl.belajararray;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainApplication main = new MainApplication();
		main.insertDataMahasiswa();
		

	}
	
	public void insertData() {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		System.out.print("Masukan banyak data : ");

		int jmlData = scan.nextInt();
		
		ModelData[] data  = new ModelData[jmlData];
		
		
		for (int i = 0; i < jmlData; i++) {
			data[i] = new ModelData();
			System.out.print("Masukan nama anda :");
			String nama = scan.next();
			
			data[i].setNama(nama);
			
			System.out.print("Masukan alamat anda :");
			String alamat = scan.next();
			data[i].setAlamat(alamat);
		}
		
		//cara for each
		for (ModelData modelData : data) {
			
			System.out.println("=============================");
			System.out.println("Nama :" + modelData.getNama());
			System.out.println("Alamat :" + modelData.getAlamat());
			System.out.println("=============================");
			
		}
		
		//cara for next
		for (int i = 0; i < jmlData; i++) {
			System.out.println("=============================");
			System.out.println("Nama :" + data[i].getNama());
			System.out.println("Alamat :" + data[i].getAlamat());
			System.out.println("=============================");
			
		}
		
		
		
		
		
		
	}

	
	/*
	 * Masukan jumlah mahasiswa : 2
	 * 
	 * =============================
	 * Masukan nama mahasiswa : Hanif
	 * Masukan nik mahasiswa : 12345
	 * Masukan nilai semester1 : 9
	 * Masukan nilai semester2 : 9
	 * Masukan nilai semester3 : 9
	 * =============================
	 * 
	 *==============================
	 * Masukan nama mahasiswa : Aqil
	 * Masukan nik mahasiswa : 2345
	 * Masukan nilai semester1 : 7
	 * Masukan nilai semester2 : 7
	 * Masukan nilai semester3 : 7
	 * =============================
	 * 
	 * 
	 *=============================
	 *Nama        | Nik   | Nilai Rata 
	 *Hanif       | 12345 |  9
	 *Aqil        | 2345  |  7
	 *
	 *Nama Nik nilai1-3 dan rata2 dalam satu Model --> ModelMahasiswa
	 *
	 */
	public void insertDataMahasiswa() {
Scanner scan = new Scanner(System.in);
		
		
		
		
		
		System.out.print("Masukan banyak data : ");

		int jmlData = scan.nextInt();
		
		ModelDataMahasiswa[] data  = new ModelDataMahasiswa[jmlData];
		
		
		for (int i = 0; i < jmlData; i++) {
			data[i] = new ModelDataMahasiswa();
			System.out.print("Masukan nama anda :");
			String nama = scan.next();
			
			data[i].setNama(nama);
			
			System.out.print("Masukan Nik anda :");
			String nik = scan.next();
			data[i].setNik(nik);
			
			System.out.print("Masukan Nilai Semester 1 anda :");
			int nilai1 = scan.nextInt();
			data[i].setNilaiSemester1(nilai1);
			System.out.print("Masukan  Nilai Semester 2  anda :");
			int nilai2 = scan.nextInt();
			data[i].setNilaiSemester2(nilai2);
			System.out.print("Masukan  Nilai Semester 3  anda :");
			int nilai3 = scan.nextInt();
			data[i].setNilaiSemester3(nilai3);
		
		}
		
		//cara for each
		for (ModelDataMahasiswa modelData : data) {
			
			System.out.println("=============================");
			System.out.println("  Nama         Nik          Nilai Rata-rata");
			System.out.println(" " + modelData.getNama()  +"    |     " + modelData.getNik() +" |        " +modelData.getNilaiAvg());
		
			System.out.println("=============================");
			
		}
		
		//cara for next
//		for (int i = 0; i < jmlData; i++) {
//			System.out.println("=============================");
//			System.out.println("Nama :" + data[i].getNama());
//			System.out.println("Alamat :" + data[i].getAlamat());
//			System.out.println("=============================");
//			
//		}
	}
}
