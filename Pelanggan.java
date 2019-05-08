package finalproject;

public class Pelanggan {
	private String nama_pelanggan, alamat_pelanggan, alamat_email, no_telp;
	
	public Pelanggan(String namaPelanggan, String alamatPelanggan, String email, String noTelp)
	{
		this.nama_pelanggan = namaPelanggan;
		this.alamat_pelanggan = alamatPelanggan;
		this.alamat_email = email;
		this.no_telp = noTelp;
	}
	
	//SETTER
	public void setNoTelp(String a)
	{
		this.no_telp = a;
	}
	
	public void setNamaPelanggan(String a)
	{
		this.nama_pelanggan = a;
	}
	
	public void setAlamatPelanggan(String a)
	{
		this.alamat_pelanggan = a;
	}
	
	public void setAlamatEmail(String a)
	{
		this.alamat_email = a;
	}
	
	//GETTER
	public String getNoTelp()
	{
		return this.no_telp;
	}
	
	public String getNamaPelanggan()
	{
		return this.nama_pelanggan;
	}
	
	public String getAlamatPelanggan()
	{
		return this.alamat_pelanggan;
	}
	
	public String getAlamatEmail()
	{
		return this.alamat_email;
	}
}
