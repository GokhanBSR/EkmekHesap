public class Migros extends EkmekHesaplama{
    @Override
    double ekmekAl(int kacTane) {
        return kacTane*6;
    }

    @Override
    double sakizAl(int kacTane) {
        return kacTane*10;
    }
}
