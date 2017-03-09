import java.util.Arrays;
import java.util.Random;

/**
 * Created by pizajoan on 14/1/17.
 */
public class Baralla {

    Carta[] b = new Carta[48];
    public int numcartes;

    Baralla() {
        Carta.Numero[] num = Carta.Numero.values();
        Carta.Coll[] coll = Carta.Coll.values();
        int contador = 0;
        for (int i = 0; i < coll.length; i++) {
            for (int j = 0; j < num.length; j++) {
                b[contador++] = new Carta(coll[i], num[j]);
            }
        }
        }

    void Baralla(){
        Random R = new Random();
        int c;
        for (int i = b.length-1; i > 0; i--) {
            c = R.nextInt(i+1);
            Carta t = b[i];
            b[i] = b[c];
            b[c] = t;
        }
    }

    public Carta treuCarta() {
        Carta c;
        numcartes++;
        for (int i = 0; i < this.b.length; i++) {
            if (this.b[i] != null) {
                c = this.b[i];
                this.b[i] = null;
                return c;
            }
            if (this.b[i] == null) {
                continue;
            }
        }
        return null;
    }
}
