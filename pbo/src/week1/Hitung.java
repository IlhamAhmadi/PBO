package week1;

public class Hitung {

	public static void main(String[] args) {
		// Keliling Lingkaran
		double diameterlingkaran = 10;
		double jarijari = diameterlingkaran / 2;
		double kelilinglingkaran = Math.PI * diameterlingkaran;
		System.out.println("Keliling Lingkaran adalah: " + kelilinglingkaran);

		System.out.println("");
		
		// Luas Segitiga Siku-Siku
		double alas = 6;
		double tinggi = 8;
		double luassegitiga = (alas+tinggi) / 2;
		System.out.println("Luas Segitiga Siku-Siku adalah: " + luassegitiga);
		
		System.out.println("");
		
		//Volume Tabung
		double diameter = 5;
		double tinggitabung = 10;
		double jarijaritabung = diameter / 2;
		double volumetabung = Math.PI * Math.pow(jarijaritabung, 2) * tinggitabung;
		System.out.println("Volume Tabung adalah: " + volumetabung);
	}

}
