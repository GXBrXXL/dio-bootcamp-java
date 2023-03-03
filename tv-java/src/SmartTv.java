public class SmartTv {
  boolean power = false;
  int canal = 1;
  int volume = 20;
  String $power = "Deixa ligado então porrakk";

  public void turnOn() {
    // ligar
    power = true;
  }

  public void turnOff() {
    // desligar
    power = false;
  }

  public void volumeUp() {
    // volume +1
    volume++;
    System.out.println("Aumentando volume para: " + volume);
  }

  public void volumeDown() {
    // volume -1
    volume--;
    System.out.println("Diminuindo volume para: " + volume);
  }

  public void changeCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void canalUp() {
    canal++;
  }

  public void canalDown() {
    canal--;
  }
}
