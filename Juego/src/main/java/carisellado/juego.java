package carisellado;

import java.util.*;

public class juego 
{
    private int moneda;
	private String jugador;
	private int eleccion;

    public juego()
     {
        
    }
	public juego(int moneda, String jugador, int eleccion)
     {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }
    
    public int getMoneda() {
        return moneda;
    }
    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    public int getEleccion() {
        return eleccion;
    }
    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }

	
	public void iniciar()
    {
		System.out.println("Ingrese el nombre del jugador");

	}
	
	public void jugar()
     {
		Random aleatorio = new Random();
		moneda= aleatorio.nextInt(2) +1;  
		System.out.println("Moneda girando");		
	}
	
	public void finalizar() 
    {
		if(moneda==1 && eleccion==1) {
			System.out.println("Cayó Cara, Ganaste "+jugador);
		}
		else if(moneda==2 && eleccion==2) {
			System.out.println("Cayó Sello, Ganaste "+jugador);
		}
		else if(moneda==1 && eleccion==2) {
			System.out.println("Cayó Cara, Perdiste "+jugador);
		}
		else if(moneda==2 && eleccion==1) {
			System.out.println("Cayó Sello, Perdiste "+jugador);
		}
	}
    public void mostrarResultado()
    {
        System.out.println(jugador +"Su eleccion fue : "+ eleccion +" y salio : "+ moneda );
    }
    public void mostrarResultado(String jugador, int eleccion , int moneda)
    {
        System.out.println(jugador +"Su eleccion fue : "+ eleccion +" y salio : "+ moneda );
    }
}
