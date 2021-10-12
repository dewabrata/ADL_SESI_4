package com.adl.belajararray;

public class ModelDataMahasiswa {
	
	private String nama;
	private String nik;
	private int nilaiSemester1 = 0;
	private int nilaiSemester2 = 0;
	private int nilaiSemester3 = 0;
	private int nilaiAvg = 0;
	
	
	
	public String getNama() {
		return nama;
	}



	public void setNama(String nama) {
		this.nama = nama;
	}



	public String getNik() {
		return nik;
	}



	public void setNik(String nik) {
		this.nik = nik;
	}



	public int getNilaiSemester1() {
		return nilaiSemester1;
	}



	public void setNilaiSemester1(int nilaiSemester1) {
		this.nilaiSemester1 = nilaiSemester1;
	}



	public int getNilaiSemester2() {
		return nilaiSemester2;
	}



	public void setNilaiSemester2(int nilaiSemester2) {
		this.nilaiSemester2 = nilaiSemester2;
	}



	public int getNilaiSemester3() {
		return nilaiSemester3;
	}



	public void setNilaiSemester3(int nilaiSemester3) {
		this.nilaiSemester3 = nilaiSemester3;
	}



	public int getNilaiAvg() {
		return (nilaiSemester1+nilaiSemester2+nilaiSemester3)/3;
	}
	
	

}
