class Computer {
  public void playMusic() {
    System.out.println("Playing Music");
  }

  public String getMePen() {
    return "Here is your pen";
  }
}


public class Demo {
  public static void main(String a[]) {
    Computer myComputer = new Computer();
    myComputer.playMusic();
    String pen = myComputer.getMePen();
    System.out.println(pen);
  }
}