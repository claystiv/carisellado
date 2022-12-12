package carisellado;
import java.util.*;
import carisellado.*;
import carisellado.juego;

public class ejecutor
{
public static void main(String[] args)
 {
  juego juego = new juego();

    Scanner lector = new Scanner(System.in);
     
    juego.iniciar();
    juego.setJugador(lector.next());

      System.out.println(juego.getJugador() + " Realice su elección : \n 1. Cara \n 2. Sello");
      juego.setEleccion(lector.nextInt());
      
      juego.jugar();
      juego.finalizar();
       }
}