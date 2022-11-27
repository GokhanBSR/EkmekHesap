import java.util.Scanner;

public class IslemYapma {
    EkmekHesaplama ekmekHesaplama;
    Scanner scanner = new Scanner( System.in);

    void ekmekHesap(){
        System.out.println("------>Ekmek Hesaplama<----");
        System.out.println("------> Ekmek Adedi:");
        int x =scanner.nextInt();
        if (x>10){
            ekmekHesaplama=new Bakkal();

        System.out.println("Migros'ta Ekmek Fiyatı:" + ekmekHesaplama.ekmekAl (x) / x +"TL'dir" );
        System.out.println("Migros'tan Aldığınız --->  "  +  x  + "  <--- Ekmeğin Fiyatı" + ekmekHesaplama.ekmekAl (x) +   "TL'dir");

        } else {
            ekmekHesaplama=new Migros();
                System.out.println("Mutlu Bakkaliyesi'nde Ekmek Fiyatı:" + ekmekHesaplama.ekmekAl (x) / x +  "TL'dir");
                System.out.println("Mutlu Bakkaliyesi'nden Aldığınız --->  "  +  x  + "  <--- Ekmeğin Fiyatı:"  +  ekmekHesaplama.ekmekAl (x)  +  "TL'dir");
            }
            }
    void sakizAl() {
        int bonus;
        System.out.println("------>Sakız Fiyatı Hesaplama<------");
        System.out.println("Kaç Sakız Aldınız");
        int y =scanner.nextInt();
        System.out.println();

        if (y > 20)
        {
            ekmekHesaplama = new Migros();
            System.out.println("Migros'tan +1 Bonus Kazandınız--->   " +  y  + "  <--- Adet Sakızın Fiyatı:" + ekmekHesaplama.sakizAl (y) + "TL'dir. " + "    1 Sakız da Migros'un Hediyesidir");
        }

        else if (y < 10){
            ekmekHesaplama =new Bakkal();
            System.out.println("Mutlu Bakkaliyesi'nde Sakız Fiyatı:" + ekmekHesaplama.sakizAl(y) / y + "TL'dir");
            System.out.println("Mutlu Bakkaliyesi'nden Aldığınız--->  "  +  y  + "  <--- Sakızın Fiyatı:" + ekmekHesaplama.sakizAl (y) + "TL'dir");
        }
        else if ( y>10 && y< 20){
            ekmekHesaplama = new Migros();
            System.out.println("Migros'ta Sakız Fiyatı:" + ekmekHesaplama.sakizAl (y) / y + "TL'dir");
            System.out.println("Migros'tan Aldığınız--->  "  +  y  + "  <--- Adet Sakızın Fiyatı:" + ekmekHesaplama.sakizAl (y) + "TL'dir");
        }
    }
}

