package finalproject;

public class Menu {
	Elektronik barang;
	Pelanggan customer;
	
	public void TampilanPertama()
	{
		System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
		System.out.println("Selamat datang di Toko Elektronik RDMU.");
		System.out.println("Berikut adalah daftar kategori yang kami jual : ");
		System.out.println("-- 1. Mesin Cuci");
		System.out.println("-- 2. Kulkas");
		System.out.println("-- 3. TV");
		System.out.print("Apa pilihan anda? [ Masukkan Angka ] : ");
	}
	
	public void TampilanKedua(int pilihanKategori) 
	{
		if( pilihanKategori == 1 )
		{
			System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
			System.out.println("Anda memilih kategori [Mesin Cuci]");
			System.out.println("Berikut adalah mesin cuci yang kami jual : ");
		}
		else if( pilihanKategori == 2)
		{
			System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
			System.out.println("Anda memilih kategori [Kulkas]");
			System.out.println("Berikut adalah kulkas yang kami jual : ");
		}
		else if( pilihanKategori == 3)
		{
			System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
			System.out.println("Anda memilih kategori [TV]");
			System.out.println("Berikut adalah tv yang kami jual : ");
		}
	}
	
	public void TampilanDetail(Elektronik Barang)
	{
		this.barang = Barang;
		System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
		System.out.println("Anda memilih model [" + barang.getNamaModel() + "]");
		System.out.println("Berikut detail dari barang tersebut : ");
		System.out.println("Kategori       : " + barang.getKategori());
		System.out.println("Nama Merk      : " + barang.getNamaMerk());
		System.out.println("Nama Model     : " + barang.getNamaModel());
		System.out.println("Warna Model    : " + barang.getWarna());
		System.out.println("Harga Model    : Rp." + barang.getHarga());
		System.out.println("Stok Model     : " + barang.getStok());
		System.out.println("Pemakaian Watt : " + barang.getWatt() + "W");
	}
	
	public void TampilanForm()
	{
		System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
		System.out.println("Silahkan mengisi data-data berikut : ");
		System.out.println();
	}
	
//	public void TampilanKedua()
//	{
//		System.out.println("========== DAFTAR KATEGORI ELEKTRONIK ==========");
//		System.out.println("Berikut adalah daftar kategori barang kami : ");
//		System.out.println("1. Mesin Cuci");
//		System.out.println("2. Kulkas ");
//		System.out.println("3. TV");
//		System.out.print("Masukkan pilihan anda : ");
//	}
//	
//	public void TampilanKetiga(int Kategori) 
//	{
//		if( Kategori == 1)
//		{
//			System.out.println("========== DAFTAR MERK MESIN CUCI ==========");
//			System.out.println("Berikut adalah daftar merk mesin cuci kami : ");
//			System.out.println("1. SANKEN");
//			System.out.println("2. SHARP");
//			System.out.print("Masukkan pilihan anda : ");
//		}
//		else if( Kategori == 2)
//		{
//			System.out.println("========== DAFTAR MERK KULKAS ==========");
//			System.out.println("Berikut adalah daftar merk kulkas kami : ");
//			System.out.println("1. PANASONIC");
//			System.out.println("2. POLYTRON");
//			System.out.print("Masukkan pilihan anda : ");
//		}
//		else if( Kategori == 3)
//		{
//			System.out.println("========== DAFTAR MERK TV ==========");
//			System.out.println("Berikut adalah daftar merk tv kami : ");
//			System.out.println("1. LG");
//			System.out.println("2. SONY");
//			System.out.print("Masukkan pilihan anda : ");
//		}
//		
//	}
//	
//	public void TampilanKeempat(int Kategori, int Merk)
//	{
//		if(Kategori == 1 && Merk == 1) //Mesin Cuci merk [SANKEN]
//		{
//			
//		}
//		else if(Kategori == 1 && Merk == 2) //Mesin Cuci merk [SHARP]
//		{
//			
//		}
//		else if(Kategori == 2 && Merk == 1)
//		{
//			
//		}
//	}
	
	//Problem : 
/* Bagaimana cara agar bisa menyimpan data dari array of objects
 * Sehingga dapat dipakai untuk membuat tampilan dasar
 * 
 */
}
