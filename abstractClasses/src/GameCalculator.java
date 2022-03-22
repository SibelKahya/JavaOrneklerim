public abstract class GameCalculator {
    //Not: abstract sınıflar asla new lenemez

    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
