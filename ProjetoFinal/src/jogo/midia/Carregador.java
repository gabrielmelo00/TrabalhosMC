package jogo.midia;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Carregador {
	
	public static  ArrayList<ImageIcon> Imagens = new ArrayList<ImageIcon>();
	
	//lista de imagens
	public static final byte BACKGROUND_MENU = 0;
	public static final byte SELECAO_MENU_JOGAR = 1;
	public static final byte SELECAO_MENU_REGRAS = 2;
	public static final byte SELECAO_REGRAS_JOGAR = 3;
	public static final byte SELECAO_REGRAS_MENU = 4;
	public static final byte BACKGROUND_REGRAS = 5;
	public static final byte BACKGROUND_JOGO = 6;
	public static final byte BACKGROUND_QUINTAL = 7;
	public static final byte MACA = 8;
	public static final byte ESTUDANTE = 9;
	public static final byte BACKGROUND_GAMEOVER_MENU = 10;
	public static final byte BACKGROUND_GAMEOVER_JOGAR = 11;
	public static final byte OBJETIVO = 12;
	public static final byte MACA_LAGARTA = 13;
	public static final byte TRANSPARENTE = 14;

	public static void carregar() {
		Imagens.add(BACKGROUND_MENU, new ImageIcon(Carregador.class.getResource("background.png")));
		Imagens.add(SELECAO_MENU_JOGAR, new ImageIcon(Carregador.class.getResource("selecao_menu_jogar.png")));
		Imagens.add(SELECAO_MENU_REGRAS, new ImageIcon(Carregador.class.getResource("selecao_menu_regras.png")));	
		Imagens.add(SELECAO_REGRAS_JOGAR, new ImageIcon(Carregador.class.getResource("selecao_regras_jogar.png")));		
		
		Imagens.add(SELECAO_REGRAS_MENU, new ImageIcon(Carregador.class.getResource("selecao_regras_menu.png")));	
		
		Imagens.add(BACKGROUND_REGRAS, new ImageIcon(Carregador.class.getResource("background_regras.png")));	
		Imagens.add(BACKGROUND_JOGO, new ImageIcon(Carregador.class.getResource("background_jogo.png")));	
		Imagens.add(BACKGROUND_QUINTAL, new ImageIcon(Carregador.class.getResource("background_quintal.png")));	
		
		Imagens.add(MACA, new ImageIcon(Carregador.class.getResource("maca.png")));	
		
		Imagens.add(ESTUDANTE, new ImageIcon(Carregador.class.getResource("carinhaFeliz.png")));	
		
		Imagens.add(BACKGROUND_GAMEOVER_MENU, new ImageIcon(Carregador.class.getResource("gameover_menu.png")));
		Imagens.add(BACKGROUND_GAMEOVER_JOGAR, new ImageIcon(Carregador.class.getResource("gameover_jogar.png")));
		
		Imagens.add(OBJETIVO, new ImageIcon(Carregador.class.getResource("objetivo.png")));
		Imagens.add(MACA_LAGARTA, new ImageIcon(Carregador.class.getResource("maca_lagarta.png")));
		Imagens.add(TRANSPARENTE, new ImageIcon(Carregador.class.getResource("transparente.png")));
	}

}