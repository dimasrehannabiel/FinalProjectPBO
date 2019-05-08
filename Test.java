package finalproject;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		//0.1
		Menu menu = new Menu();
		Checkout struk = new Checkout();
		Elektronik[] barang = new Elektronik[7];
		//0.2
		barang[1] = new Elektronik("Mesin Cuci", "SANKEN", "SN001", "Merah", 1000000, 2, 120);
		barang[2] = new Elektronik("Mesin Cuci", "SHARP", "SP002", "Kuning", 1500000, 1, 130);
		barang[3] = new Elektronik("Kulkas", "PANASONIC", "PA003", "Hijau", 2000000, 3, 145);
		barang[4] = new Elektronik("Kulkas", "POLYTRON", "PN004", "Merah", 2200000, 2, 155);
		barang[5] = new Elektronik("TV", "SONY", "SY005", "Kuning", 1750000, 4, 100);
		barang[6] = new Elektronik("TV", "LG", "LG006", "Hijau", 1250000, 2, 110);
		Scanner scan = new Scanner(System.in);
		
		for(int a = 0; a == 0;)//Pengulangan agar tetap di menu pertama
		{
			//1.1 Tampilkan menu pertama
			menu.TampilanPertama();
			int pilihKategori = scan.nextInt();
			System.out.println("==========================================");
			System.out.println();
			System.out.println();
			
			//2.1 Cek variabel pilihKategori
			if(pilihKategori == 1 || pilihKategori == 2 || pilihKategori == 3) //Jika variabel [pilihKategori] valid
			{
				for(int b = 0; b ==0;)//Pengulangan agar tetap di menu kedua
				{
					//2.2 Tampilkan menu kedua
					menu.TampilanKedua(pilihKategori);
					if(pilihKategori == 1)//2.3 Cek variabel pilih kategori agar list menyesuaikan
					{
						for(int i = 1; i <= 2; i++)//Pengulangan list array of object dari [1] sampai [2]
						{
							System.out.println("-- "+ i +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
						}
						System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
					}
					else if(pilihKategori == 2)
					{
						int list = 0;
						for(int i = 3; i <= 4; i++) //Pengulangan list array of object dari [3] sampai [4]
						{
							list += 1;
							System.out.println("-- "+ list +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
						}
						System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
					}
					else if(pilihKategori == 3)
					{
						int list = 0;
						for(int i = 5; i <= 6; i++) //Pengulangan list array of object dari [5] sampai [6]
						{
							list += 1;
							System.out.println("-- "+ list +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
						}
						System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
					}
					int pilihModel = scan.nextInt();
					System.out.println("==========================================");
					System.out.println();
					System.out.println();
					////////////
					
					
					if(pilihModel == 1 || pilihModel == 2) //Jika variabel [pilihModel] valid
					{
						//3.1 Tampilkan detail barang berdasarkan variabel [pilihKategori] dan variabel [pilihModel]
						for(int c = 0; c == 0;) //Pengulangan agar tetap di menu detail barang
						{
							if(pilihKategori == 1) //[Mesin Cuci]
							{
								if(pilihModel == 1)
								{
									menu.TampilanDetail(barang[1]); //Detail dari [SANKEN SN001]
								}
								else if(pilihModel == 2)
								{
									menu.TampilanDetail(barang[2]); //Detail dari [SHARP SP002]
								}
							}
							else if(pilihKategori == 2) //[Kulkas]
							{
								if(pilihModel == 1)
								{
									menu.TampilanDetail(barang[3]); //Detail dari [PANASONIC PA003]
								}
								else if(pilihModel == 2) 
								{
									menu.TampilanDetail(barang[4]); //Detail dari [POLYTRON PN004]
								}
							}
							else if(pilihKategori == 3) //[TV]
							{
								if(pilihModel == 1)
								{
									menu.TampilanDetail(barang[5]); //Detail dari [SONY SY005]
								}
								else if(pilihModel == 2)
								{
									menu.TampilanDetail(barang[6]); //Detail dari [SONY LG006]
								}
							}
							System.out.println("Apakah anda ingin membeli barang ini?");
							System.out.println("-- 1. Ya ");
							System.out.println("-- 2. Tidak ");
							System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
							int pilihBeli = scan.nextInt();
							System.out.println("==========================================");
							System.out.println();
							System.out.println();
							//////////
						}
					}
					else if(pilihModel < 1 || pilihModel > 2)//Jika variabel [pilihModel] tidak valid
					{
						System.out.println("==========================================");
						System.out.println("Maaf, kode angka yang dimasukkan tidak valid!");
						System.out.println("Silahkan masukkan kode angka yang valid kembali.");
					}
				}
			}
			else if(pilihKategori < 1 || pilihKategori > 3)//Jika variabel [pilihKategori] tidak valid
			{
				System.out.println("==========================================");
				System.out.println("Maaf, kode angka yang dimasukkan tidak valid!");
				System.out.println("Silahkan masukkan kode angka yang valid kembali.");
			}
			////////
		}
	}
}
