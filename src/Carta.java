/**
 * Created by pizajoan on 14/1/17.
 */
public class Carta {

    public Coll collcarta;
    public Numero numerocarta;
    public int numero;

    Carta (Coll c, Numero n) {
        this.collcarta = c;
        this.numerocarta = n;
        if (n.equals("un")) {
            numero = 1;
        }
        if (n.equals("dos")) {
            numero = 2;
        }
        if (n.equals("tres")) {
            numero = 3;
        }
        if (n.equals("quatre")) {
            numero = 4;
        }
        if (n.equals("cinc")) {
            numero = 5;
        }
        if (n.equals("sis")) {
            numero = 6;
        }
        if (n.equals("set")) {
            numero = 7;
        }
        if (n.equals("vuit")) {
            numero = 8;
        }
        if (n.equals("nou")) {
            numero = 9;
        }
        if (n.equals("deu")) {
            numero = 10;
        }
        if (n.equals("onze")) {
            numero = 11;
        }
        if (n.equals("dotze")) {
            numero = 12;
        }

    }

    @Override
    public String toString(){
        return this.numerocarta.toString() + " de " + this.collcarta.toString();
    }

    enum Coll  {
        oros, copes, bastos, espases
    }

    enum Numero {
        un, dos, tres, quatre, cinc, sis, set, vuit, nou, deu, onze, dotze;
    }

    @Override
    public boolean equals(Object o) {
        Carta carta = (Carta) o;
        return carta.collcarta == collcarta && carta.numerocarta == numerocarta;
    }

}
