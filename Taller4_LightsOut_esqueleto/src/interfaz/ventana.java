package interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Top10;


public class ventana extends JFrame
{	
	private Tablero modelo;
	
	private PanelUno panelArriba;
	private PanelDos panelAbajo;
	private PanelTres panelDerecha;
	private PanelCuatro panelIzquierda;
	private PanelCinco panelCentro;
	
	public ventana()
	{
		setSize(800, 600);
		setTitle("Juego");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try 
		{
			modelo = new Tablero();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		setLayout(new BorderLayout());
	}
	
	public static void main (String[] args)
	{
		ventana ejemplo = new ventana();
		ejemplo.setLocationRelativeTo(null);
		ejemplo.setVisible(true);
	}	
}