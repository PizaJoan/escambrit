/**
 * Created by pizajoan on 18/1/17.
 */
public class Ordenador extends Jugador {

    public Carta Juga(Carta c, Brisca.Torn torn, Carta triomf, int torns) {
        return JugaB(true,torn,c,triomf);
    }

    public Carta Juga(Carta c, Brisca.Torn torn, int torns, Carta triomf) {
        return JugaB(false,torn,c,triomf);
    }

    public Carta JugaB(boolean torn, Brisca.Torn tornde, Carta c, Carta triomf ) {
        Carta cc = null;
        if (torn == true) {
            for (int i = 0; i < Ma.length; i++) {
                if (c.collcarta == triomf.collcarta && Brisca.Valor(Ma[i]) < Brisca.Valor(c) && Ma[i].numero < c.numero ) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
                if (c.collcarta == Ma[i].collcarta && Brisca.Valor(c) < Brisca.Valor(Ma[i])) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
                if (c.collcarta == Ma[i].collcarta && Brisca.Valor(c) > Brisca.Valor(Ma[i])) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
            }
            if (cc == null) {
                cc = Ma[0];
                Ma[0] = null;
            }
            System.out.println("L'ordinador ha jugat: " + cc);
            return cc;
        } else {
            for (int i = 0; i < Ma.length; i++) {
                if (c.collcarta == triomf.collcarta && Brisca.Valor(Ma[i]) < Brisca.Valor(c) && Ma[i].numero < c.numero ) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
                if (c.collcarta == Ma[i].collcarta && Brisca.Valor(c) < Brisca.Valor(Ma[i])) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
                if (c.collcarta == Ma[i].collcarta && Brisca.Valor(c) > Brisca.Valor(Ma[i])) {
                    cc = Ma[i];
                    Ma[i] = null;
                    return cc;
                }
            }
            if (cc == null) {
                cc = Ma[0];
                Ma[0] = null;
            }
            return cc;
        }
    }
}
