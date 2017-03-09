/**
 * Created by pizajoan on 28/1/17.
 */
public class Jugador {

    Carta[] Ma = new Carta[3];
    public int puntuacio;

    Jugador () {

    }

    void setPuntuacio(int puntuacio) {
        this.puntuacio += puntuacio;
    }

    void OmplirMa(Baralla b) {
        for (int i = 0; i < Ma.length; i++) {
            if (Ma[i] == null) {
                Ma[i] = b.treuCarta();
            }
        }
    }
}
