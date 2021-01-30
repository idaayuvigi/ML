public class Tumbuhan implements Divisi {

  String preparat;
  String waktu;
  String subdivisi = "";
  String kelas = "";

  public Tumbuhan(String preparat, String waktu, String subdivisi, String kelas) {
    this.preparat = preparat;
    this.waktu = waktu;
    this.subdivisi = subdivisi;
    this.kelas = kelas;
  }

  public void informasi_umum() {
    System.out.println("INFORMASI UMUM ===========================");
    System.out.println("Tumbuhan " + preparat + " ditemukan pada " + waktu);
  }

  public void informasi_taksonomi() {
    System.out.println("INFORMASI TAKSONOMI ======================");
    System.out.println("Divisi              : " + DIVISI);
    System.out.println("Subdivisi           : " + subdivisi);
    System.out.println("Kelas               : " + kelas);

  }

  public void informasi_sel() {
    System.out.println("INFORMASI SEL ============================");
    System.out.println("Jumlah Sel          : " + "");
  }

  public void informasi_bentuk() {
    System.out.println("INFORMASI BENTUK =========================");
    System.out.println("Bentuk Tubuh        : " + "");
    System.out.println("Batang              : " + "");
    System.out.println("Kambium             : " + "");
    System.out.println("Tulang Daun         : " + "");
    System.out.println("Akar                : " + "");
  }

  public void informasi_reproduksi() {
    System.out.println("INFORMASI REPRODUKSI =====================");
    System.out.println("Biji                : " + "");
    System.out.println("Alat Reproduksi     : " + "");
    System.out.println("Ovarium             : " + "");
    System.out.println("Pembuahan           : " + "");
  }

  public void informasi_sumber_energi() {
    System.out.println("INFORMASI SUMBER ENERGI ==================");
    System.out.println("Sumber Makanan      : " + "");
    System.out.println("Fotosintesis dilakukan di daun. Lalu hasilnya dikirimkan ke seluruh kloroplas");

  }
}
