class Subdivisi {
  int MAX_KELIPATAN_KELOPAK = 3;

  protected String namaSubdivisi;
  // reproduksi
  protected String biji;
  protected String alatReproduksi;
  protected String pembuahan;
  protected String ovarium;

  // bentuk
  protected String bentukTubuh;
  protected String batang;
  protected String kambium;
  protected String tulangDaun;
  protected String akar;

  // sel
  protected String jumlahSel;

  // sumber makanan
  protected String sumberMakanan;

  public Subdivisi(String namaSubdivisi, String biji, String alatReproduksi, String pembuahan, String ovarium) {
    this.namaSubdivisi = namaSubdivisi;
    this.biji = biji;
    this.alatReproduksi = alatReproduksi;
    this.pembuahan = pembuahan;
    this.ovarium = ovarium;
  }
}

abstract class Gymospermae extends Subdivisi {

  public Gymospermae() {
    super("Gymospermae", "Terbuka", "Strobilus", "Tunggal", "Tidak Punya");

  }

  public abstract void cekKelopakBunga();

}

abstract class Angiospermae extends Subdivisi {

  public Angiospermae() {
    super("Angiospermae", "Tertutup", "Bunga", "Ganda", "Tidak Punya");
  }

  public abstract void cekKelopakBunga();

}
