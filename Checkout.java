package finalproject;

public class Checkout extends Menu {

	public void TampilanDetail(Elektronik a, Pelanggan b)
	{
		this.barang = a;
		this.customer = b;
		
		System.out.println("========== TOKO ELEKTRONIK RDMU ==========");
		System.out.println("Berikut adalah detail transaksi anda : ");
		System.out.println("Nama Pembeli     : " + customer.getNamaPelanggan());
		System.out.println("Alamat Pembeli   : " + customer.getAlamatPelanggan());
		System.out.println("Nomor Telephone  : " + customer.getNoTelp());
		System.out.println("Jenis Elektronik : " + barang.getKategori());
		System.out.println("Nama Merk        : " + barang.getNamaMerk());
		System.out.println("Nama Model       : " + barang.getNamaModel());
		System.out.println("Total harga      : Rp." + barang.getHarga());
		System.out.println("");
		System.out.println("Silahkan melakukan pembyaran di kasir terdekat");
	}
}
