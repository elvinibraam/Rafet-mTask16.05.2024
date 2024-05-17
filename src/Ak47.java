public class Ak47 extends Weapon implements Fireable {


    @Override
    public void reLoad(int reloadAmount) {
        if (reloadAmount <= daraqTutumu) {
            mermiSayi -= reloadAmount;
            currentDaraqCount += reloadAmount;
            System.out.println("Yerde qalan mermi sayi:"+currentDaraqCount);

        }else System.out.println("It can't more than capacity");

    }

    @Override
    public void shoot() {
        if (currentDaraqCount <= daraqTutumu) {
            currentDaraqCount -= 1;
        }
    }

    public Ak47(int mermiSayi, int daraqTutumu,int currentDaraqCount) {
        this.mermiSayi=mermiSayi;
        this.daraqTutumu=daraqTutumu;
        this.currentDaraqCount=currentDaraqCount;
    }
}
