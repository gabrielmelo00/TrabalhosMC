package jogo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import midia.Carregador;

public class Lagarta extends Agente{	
	
	Image transparente;

	Lagarta(int i, int j, int escala) {
		super(i, j, escala);
		tipoAgente = 'V';
		transparente = new ImageIcon(Carregador.Imagens.get(Carregador.TRANSPARENTE).getImage().getScaledInstance(escala,escala, 1)).getImage();
	}
	
	Lagarta(int escala) {
		this(0,0,escala);
	}

	public void pintarTela(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public void mover() {}

	public Image getImagem() {
		return transparente;
	}

	public char getTipoAgente() {
		return tipoAgente;
	}

	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}

	public void colisao(char tipo) {}

}