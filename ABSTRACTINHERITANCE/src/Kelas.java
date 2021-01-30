class Monocotyledoneae extends Angiospermae {

  public Monocotyledoneae(String bentukTubuh, String batang, String kambium, String tulangDaun, String akar) {
    this.bentukTubuh = bentukTubuh;
    this.batang = batang;
    this.kambium = kambium;
    this.tulangDaun = tulangDaun;
    this.akar = akar;
  }

  @Override
  public void cekKelopakBunga() {
    System.out.print("Kelopak Bunga   : " + super.MAX_KELIPATAN_KELOPAK);
  }

}

abstract class Dicotyledoneae extends Angiospermae {

  // public Monocotyledoneae() {
  // super("Angiospermae", "Tertutup", "Bunga", "Ganda", "Punya");
  // }

  @Override
  public void cekKelopakBunga() {
    System.out.print("Kelopak Bunga   : " + super.MAX_KELIPATAN_KELOPAK);

  }
}

abstract class Cycadinae extends Gymospermae {

  // public Cycadinae() {
  // super("Gymnospermae", "Tertutup", "Bunga", "Ganda", "Punya");
  // }

  // @Override
  // public void cekKelopakBunga() {
  // System.out.print("Kelopak Bunga : " + super.MAX_KELIPATAN_KELOPAK);

  // }
}
