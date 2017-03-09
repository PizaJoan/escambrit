import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pizajoan on 18/1/17.
 */
public class Huma extends Jugador{

    public Carta Juga(Carta c) {
        System.out.println("L'ordinador ha jugat: " + c);
        System.out.println("La teva ma és: ");
        for (int i = 0; i < Ma.length; i++) {
            System.out.println(Ma[i].toString());
        }
        Scanner s = new Scanner(System.in);
        int entrada = s.nextInt()-1;
        Carta c2 = Ma[entrada];
        Ma[entrada] = null;
        return c2;
    }

    public Carta Juga() {
        System.out.println("La teva ma és");
        for (int i = 0; i < Ma.length; i++) {
            System.out.println(Ma[i].toString());
        }
        Scanner s = new Scanner(System.in);
        int entrada = s.nextInt()-1;
        Carta c2 = Ma[entrada];
        Ma[entrada] = null;
        return c2;
    }
}
