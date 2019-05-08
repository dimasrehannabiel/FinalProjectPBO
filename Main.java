package finalproject;
import java.util.Scanner;

//public class Main{
//	public static void main(String[] args) {
//		//0.1 Inisialisasi Objek		
//		Menu menu = new Menu();
//		Checkout struk = new Checkout();
//		Elektronik[] barang = new Elektronik[7];
//		//0.2 Inisiliasisasi barang jualan dari objek [barang]
//		barang[1] = new Elektronik("Mesin Cuci", "SANKEN", "SN001", "Merah", 1000000, 2, 120);
//		barang[2] = new Elektronik("Mesin Cuci", "SHARP", "SP002", "Kuning", 1500000, 1, 130);
//		barang[3] = new Elektronik("Kulkas", "PANASONIC", "PA003", "Hijau", 2000000, 3, 145);
//		barang[4] = new Elektronik("Kulkas", "POLYTRON", "PN004", "Merah", 2200000, 2, 155);
//		barang[5] = new Elektronik("TV", "SONY", "SY005", "Kuning", 1750000, 4, 100);
//		barang[6] = new Elektronik("TV", "LG", "LG006", "Hijau", 1250000, 2, 110);
//		Scanner scan = new Scanner(System.in);
//		
//		//1.1 Tampilkan Menu pilih kategori
//		menu.TampilanPertama();
//		int pilihKategori = scan.nextInt();
//		System.out.println("==========================================");
//		System.out.println();
//		System.out.println();
//		
//		//2.1 Tampilkan Menu pilih barang 
//		menu.TampilanKedua(pilihKategori);
//		//2.2 Loop tampilkan list barang setelah menu.TampilanKedua(pilihKategori);
//		if(pilihKategori == 1)
//		{
//			for(int i = 1; i <= 2; i++)
//			{
//				System.out.println("-- "+ i +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
//			}
//			System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
//		}
//		else if(pilihKategori == 2)
//		{
//			int list = 0;
//			for(int i = 3; i <= 4; i++)
//			{
//				list += 1;
//				System.out.println("-- "+ list +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
//			}
//			System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
//		}
//		else if(pilihKategori == 3)
//		{
//			int list = 0;
//			for(int i = 5; i <= 6; i++)
//			{
//				list += 1;
//				System.out.println("-- "+ list +". "+barang[i].getNamaMerk()+" "+barang[i].getNamaModel());
//			}
//			System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
//		}
//
//		int pilihModel = scan.nextInt();
//		System.out.println("==========================================");
//		System.out.println();
//		System.out.println();
//		
//		//3.1 Tampilkan detail barang berdasarkan variabel [pilihKategori] dan variabel [pilihModel]
//		if(pilihKategori == 1 && pilihModel == 1) // [Mesin Cuci] dan [SN001]
//		{
//			menu.TampilanDetail(barang[1]);
//		}
//		else if(pilihKategori == 1 && pilihModel == 2) // [Mesin Cuci] dan [SP002]
//		{
//			menu.TampilanDetail(barang[2]);
//		}
//		else if(pilihKategori == 2 && pilihModel == 1) // [Kulkas] dan [PA003]
//		{
//			menu.TampilanDetail(barang[3]);
//		}
//		else if(pilihKategori == 2 && pilihModel == 2) // [Kulkas] dan [PN004]
//		{
//			menu.TampilanDetail(barang[4]);
//		}
//		else if(pilihKategori == 3 && pilihModel == 1) // [TV] dan [SY005]
//		{
//			menu.TampilanDetail(barang[5]);
//		}
//		else if(pilihKategori == 3 && pilihModel == 2) // [TV] dan [LG006]
//		{
//			menu.TampilanDetail(barang[6]);
//		}
//		System.out.println("Apakah anda ingin membeli barang ini?");
//		System.out.println("-- 1. Ya ");
//		System.out.println("-- 2. Tidak ");
//		System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
//		int pilihBeli = scan.nextInt();
//		System.out.println("==========================================");
//		System.out.println();
//		System.out.println();
//		
//		//4.1 Tampilkan formulir pelanggan jika memilih untuk beli
//		if(pilihBeli == 1)
//		{
//			menu.TampilanForm();
//			scan.nextLine();
//			
//			System.out.print("Nama Lengkap    : ");
//			String namaPembeli = scan.nextLine();	
//			
//
//			System.out.print("Alamat          : ");
//			String alamatPembeli = scan.nextLine();
//			
//			System.out.print("Email           : ");
//			String emailPembeli = scan.nextLine();
//			
//			System.out.print("Nomor Telephone : ");
//			String notelpPembeli = scan.nextLine();
//			
//			//4.2 Menginisialisasikan data pembeli
//			Pelanggan pembeli = new Pelanggan(namaPembeli, alamatPembeli, emailPembeli, notelpPembeli);
//			System.out.println("==========================================");
//			System.out.println();
//			System.out.println();
//			
//			//4.3 Penyelksian kategori dan model barang
//			if(pilihKategori == 1 && pilihModel == 1) // [Mesin Cuci] dan [SN001]
//			{
//				struk.TampilanDetail(barang[1], pembeli);
//				System.out.println("==========================================");
//			}
//			else if(pilihKategori == 1 && pilihModel == 2) // [Mesin Cuci] dan [SP002]
//			{
//				struk.TampilanDetail(barang[2], pembeli);
//				System.out.println("==========================================");
//			}
//			else if(pilihKategori == 2 && pilihModel == 1) // [Kulkas] dan [PA003]
//			{
//				struk.TampilanDetail(barang[3], pembeli);
//				System.out.println("==========================================");
//			}
//			else if(pilihKategori == 2 && pilihModel == 2) // [Kulkas] dan [PN004]
//			{
//				struk.TampilanDetail(barang[4], pembeli);
//				System.out.println("==========================================");
//			}
//			else if(pilihKategori == 3 && pilihModel == 1) // [TV] dan [SY005]
//			{
//				struk.TampilanDetail(barang[5], pembeli);
//				System.out.println("==========================================");
//			}
//			else if(pilihKategori == 3 && pilihModel == 2) // [TV] dan [LG006]
//			{
//				struk.TampilanDetail(barang[6], pembeli);
//				System.out.println("==========================================");
//			}
//		}
//		else if(pilihBeli == 2)
//		{
//			
//		}
//		
////		for(int i = 0; i == 0;)
////		{
////			menu.TampilanPertama();
////			int pilihanPertama = skan.nextInt();
////			
////			if(pilihanPertama == 1)
////			{
////				for(int j = 0; j == 0;)
////				{
////					menu.TampilanKedua();
////					int pilihanKedua = skan.nextInt();
////					
////					if(pilihanKedua == 1)
////					{
////						menu.TampilanKetiga(pilihanKedua);
////						int pilihanKetiga = skan.nextInt();
////						System.out.println();
////						System.out.println();
////						
////						if(pilihanKetiga == 1)
////						{
////							
////						}
////					}
////					else if(pilihanKedua == 2)
////					{
////						menu.TampilanKetiga(pilihanKedua);
////						System.out.println();
////						System.out.println();
////					}
////					else if(pilihanKedua == 3)
////					{
////						menu.TampilanKetiga(pilihanKedua);
////						System.out.println();
////						System.out.println();
////					}
////					else if(pilihanKedua < 1 || pilihanKedua > 3)
////					{
////						System.out.println();
////						System.out.println();
////						System.out.println("Maaf, silahkan masukkan angka yang valid!");
////					}
////					break;
////				}	
////			}
////			else if(pilihanPertama == 2)
////			{
////				System.out.print("Program telah dihentikan.");
////				break;
////			}
////			else if(pilihanPertama < 1 || pilihanPertama > 2)
////			{
////				System.out.println();
////				System.out.println();
////				System.out.println("Maaf, silahkan masukkan angka yang valid!");
////			}
////			break;
////		}
//		
//		
////		Elektronik[] Kulkas = new Elektronik[4];
////		Kulkas[0] = new Elektronik("Kulkas");
////		Kulkas[0].setKategori("Kulkas");
////		System.out.print(Kulkas[0].getKategori());
//	}
//}
