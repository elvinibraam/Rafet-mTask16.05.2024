import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Maksimum Daraq tutumu ne qederdir?:");
        int daraqTutumu = scanner.nextInt();
        System.out.println("Toplam senin Mermi sayini ne qederdir?:");
        int mermiSayi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Daraqdaki mermi ne qederdir?:");
        int currentDaraqCount = scanner.nextInt();
        while (currentDaraqCount > daraqTutumu){
            System.out.println("Xais olunur yeniden elave edin");
            currentDaraqCount=scanner.nextInt();
        }
        Ak47 ak47 = new Ak47( mermiSayi,daraqTutumu,currentDaraqCount);
        while (ak47.mermiSayi + ak47.currentDaraqCount>0) {
            ak47.shoot();
            System.out.println("Qalan Mermi sayi"+ ak47.currentDaraqCount);
            if(ak47.currentDaraqCount==0){
                System.out.println("How many bullet you want reload?");
                int dolduracaginBullet =scanner.nextInt();
                ak47.reLoad(dolduracaginBullet);
            }
        }
    }
}