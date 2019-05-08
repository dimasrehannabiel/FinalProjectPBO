package finalproject;

public class Elektronik {
	private int harga, stok, watt;
	private String kategori, nama_merk, nama_model, warna;
	
	public Elektronik(String Kategori, String NamaMerk, String NamaModel, String Warna, int Harga, int Stok, int Watt)
	{
		this.kategori = Kategori;
		this.nama_merk = NamaMerk;
		this.nama_model = NamaModel;
		this.warna = Warna;
		this.harga = Harga;
		this.stok = Stok;
		this.watt = Watt;
	}
	
	//SETTER
	public void setHarga(int a)
	{
		this.harga = a;
	}
	
	public void setStok(int a)
	{
		this.stok = a;
	}
	
	public void setWatt(int a)
	{
		this.watt = a;
	}
	
	public void setKategori(String a)
	{
		this.kategori = a;
	}
	
	public void setNamaMerk(String a)
	{
		this.nama_merk = a;
	}
	
	public void setNamaModel(String a)
	{
		this.nama_model = a;
	}
	
	public void setWarna(String a)
	{
		this.warna = a;
	}
	
	
	//GETTER
	public int getHarga()
	{
		return this.harga;
	}
	
	public int getStok()
	{
		return this.stok;
	}
	
	public int getWatt()
	{
		return this.watt;
	}
	
	public String getKategori()
	{
		return this.kategori;
	}
	
	public String getNamaMerk()
	{
		return this.nama_merk;
	}
	
	public String getNamaModel() 
	{
		return this.nama_model;
	}
	
	public String getWarna()
	{
		return this.warna;
	}
	
}
