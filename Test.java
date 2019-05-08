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
		//////////////
		
		//1.1 Tampilkan menu pertama
		for(int a = 0; a == 0;)//Pengulangan agar tetap di menu pertama
		{
			menu.TampilanPertama();
			int pilihKategori = scan.nextInt();
			scan.nextLine();
			System.out.println("==========================================");
			System.out.println();
			System.out.println();
			
			//2.1 Cek variabel pilihKategori
			if(pilihKategori == 1 || pilihKategori == 2 || pilihKategori == 3) //Jika variabel [pilihKategori] valid
			{
				//2.2 Tampilkan menu kedua
				for(int b = 0; b ==0;)//Pengulangan agar tetap di menu kedua
				{
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
					scan.nextLine();
					System.out.println("==========================================");
					System.out.println();
					System.out.println();
			/////////////////////////////////
					
					//3.1 Lakukan pengecekan untuk variabel [pilihModel]
					if(pilihModel == 1 || pilihModel == 2) //Jika variabel [pilihModel] valid
					{
						//3.2 Tampilkan detail barang berdasarkan variabel [pilihKategori] dan variabel [pilihModel]
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
							scan.nextLine();
							System.out.println("==========================================");
							System.out.println();
							System.out.println();
					//////////////////////
							
							//4.1 Lakukan pengecekan untuk variabel [pilihBeli]
							if(pilihBeli == 1 || pilihBeli == 2)//Jika variabel [pilihBeli] valid
							{
								//4.2 Tampilkan formulir pelanggan jika memilih untuk beli
								if(pilihBeli == 1)
								{
									for(int d = 0; d == 0;) //Pengulangan agar tetap di form pelanggan
									{
										menu.TampilanForm();
										
										System.out.print("Nama Lengkap    : ");
										String namaPembeli = scan.nextLine();	
							
										System.out.print("Alamat          : ");
										String alamatPembeli = scan.nextLine();
										
										System.out.print("Email           : ");
										String emailPembeli = scan.nextLine();
										
										System.out.print("Nomor Telephone : ");
										String notelpPembeli = scan.nextLine();
										
										//4.3 Menginisialisasikan data pembeli
										Pelanggan pembeli = new Pelanggan(namaPembeli, alamatPembeli, emailPembeli, notelpPembeli);
										System.out.println("==========================================");
										System.out.println();
										System.out.println();
										
										if(namaPembeli.equals("") || alamatPembeli.equals("") || emailPembeli.equals("") || notelpPembeli.equals(""))
										{
											System.out.println("==========================================");
											System.out.println("Terdapat form yang belum diisi atau tidak valid.");
											System.out.println("Silahkan isi ulang form kembali dengan benar.");
										}
										else 
										{
											//4.3 Penyelksian kategori dan model barang
											if(pilihKategori == 1 && pilihModel == 1) // [Mesin Cuci] dan [SN001]
											{
												struk.TampilanDetail(barang[1], pembeli);
												System.out.println("==========================================");
											}
											else if(pilihKategori == 1 && pilihModel == 2) // [Mesin Cuci] dan [SP002]
											{
												struk.TampilanDetail(barang[2], pembeli);
												System.out.println("==========================================");
											}
											else if(pilihKategori == 2 && pilihModel == 1) // [Kulkas] dan [PA003]
											{
												struk.TampilanDetail(barang[3], pembeli);
												System.out.println("==========================================");
											}
											else if(pilihKategori == 2 && pilihModel == 2) // [Kulkas] dan [PN004]
											{
												struk.TampilanDetail(barang[4], pembeli);
												System.out.println("==========================================");
											}
											else if(pilihKategori == 3 && pilihModel == 1) // [TV] dan [SY005]
											{
												struk.TampilanDetail(barang[5], pembeli);
												System.out.println("==========================================");
											}
											else if(pilihKategori == 3 && pilihModel == 2) // [TV] dan [LG006]
											{
												struk.TampilanDetail(barang[6], pembeli);
												System.out.println("==========================================");
											}
											break; //Menghentikan loop dari form pelanggan
										}
									}
								}
								else if(pilihBeli == 2)
								{
									System.out.println("==========================================");
									System.out.println("Terima kasih telah menggunakan aplikasi kami.");
									System.out.println("Silahkan melihat barang-barang kami kembali.");
									break; //Menghentikan loop dari menu detail barang
								}
								break; //Menghentikan loop dari menu detail barang
							}
							else if(pilihBeli < 1 || pilihBeli > 2) //Jika variabel [pilihBeli] tidak valid
							{
								System.out.println("==========================================");
								System.out.println("Maaf, kode angka yang dimasukkan tidak valid!");
								System.out.println("Silahkan masukkan kode angka yang valid kembali.");
							}
							///////////////
							
						}
						break; //Menghentikan loop dari menu kedua
					}
					else if(pilihModel < 1 || pilihModel > 2)//Jika variabel [pilihModel] tidak valid
					{
						System.out.println("==========================================");
						System.out.println("Maaf, kode angka yang dimasukkan tidak valid!");
						System.out.println("Silahkan masukkan kode angka yang valid kembali.");
					}
				}		
				break; //Menghentikan loop dari menu pertama
			}
			else if(pilihKategori < 1 || pilihKategori > 3)//Jika variabel [pilihKategori] tidak valid
			{
				System.out.println("==========================================");
				System.out.println("Maaf, kode angka yang dimasukkan tidak valid!");
				System.out.println("Silahkan masukkan kode angka yang valid kembali.");
			}
			////////
		}

		/////////////////////
	}
}
