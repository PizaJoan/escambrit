import java.util.Scanner;

/**
 * Created by pizajoan on 14/1/17.
 */
public class Brisca {
    static void  EliminaCartes(Baralla b) {
        Carta.Numero[] num = Carta.Numero.values();
        Carta.Coll[] coll = Carta.Coll.values();
        int cont = 0;
        for (int i = 0; i < coll.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (b.b[cont].numerocarta == num[1] || b.b[cont].numerocarta == num[7] || b.b[cont].numerocarta == num[8]) {
                    b.b[cont] = null;
            }
                cont++;
            }
        }
    }

    static private Torn torn (Carta c, Carta cc, Torn jugador, Carta triomf){
        int numeros [] = {1,2,3,4};
        int valorC, valorCC, jerarquiaC, jerarquiaCC;
        valorC = Valor(c);
        valorCC = Valor(cc);
        jerarquiaC = Jerarquia(c);
        jerarquiaCC = Jerarquia(cc);
        if (c.collcarta == triomf.collcarta && cc.collcarta == triomf.collcarta && valorC > valorCC) {
            return Torn.HUMA;
        }
        if (c.collcarta == triomf.collcarta && cc.collcarta == triomf.collcarta && valorC < valorCC) {
            return Torn.ORDINADOR;
        }
        if (jerarquiaC == jerarquiaCC && valorC > valorCC) {
            return Torn.HUMA;
        }
        if (jerarquiaC == jerarquiaCC && valorC < valorCC) {
            return Torn.ORDINADOR;
        }

        return jugador;
    }

    static public int Valor(Carta c) {
        int valor;
        switch (c.numerocarta) {
            case un :
                return valor =  11;
            case tres:
                return valor = 10;
            case deu:
                return valor = 2;
            case onze:
                return valor = 3;
            case dotze:
                return valor = 4;
            default:
                return valor = 0;
        }
    }
    static public int Jerarquia(Carta c) {
        int valor;
        switch (c.collcarta) {
            case bastos:
                return valor = 100;
            case copes:
                return valor = 200;
            case oros:
                return valor = 300;
            case espases:
                return valor = 400;
            default:
                return valor = 0;
        }
    }

    enum Torn {
        HUMA, ORDINADOR
    }



    public static void main(String[] args) {
        Scanner escanejar = new Scanner(System.in);
        Baralla b = new Baralla();
        b.Baralla();
        EliminaCartes(b);
        Carta triomf = b.treuCarta();
        Huma huma = new Huma();
        Ordenador ord = new Ordenador();
        Torn torn = Torn.HUMA;
        huma.OmplirMa(b);
        ord.OmplirMa(b);
        Carta cartaOrd, cartaHuma;
        int contadorTorns = 0;
        while (true) {
            contadorTorns++;
            System.out.println("Torn del " + torn);
            System.out.println("Va de " + triomf.collcarta);
            if (torn == Torn.HUMA) {
                cartaHuma = huma.Juga();
                cartaOrd = ord.Juga(cartaHuma,torn,triomf,contadorTorns);
                torn = torn(cartaHuma,cartaOrd,torn,triomf);
                huma.OmplirMa(b);
                ord.OmplirMa(b);
                } else {
                cartaOrd = ord.Juga(triomf,torn,contadorTorns,triomf);
                cartaHuma = huma.Juga(cartaOrd);
                torn = torn(cartaHuma, cartaOrd, torn, triomf);
                ord.OmplirMa(b);
                huma.OmplirMa(b);
            }
            if (torn == torn.HUMA) {
                huma.setPuntuacio(Valor(cartaHuma)+Valor(cartaOrd));
            } else {
                ord.setPuntuacio(Valor(cartaHuma)+Valor(cartaOrd));
            }
            System.out.println("Ha guanyat: " + torn);
            System.out.println("L'ordinador du: " + ord.puntuacio + " punts");
            System.out.println("L'humà du: " + huma.puntuacio + " punts");
            System.out.println("Pitja algo per continuar: ");
            escanejar.nextLine();
            if (b.numcartes == 36) {
                break;
            }
            }
        }
    }
