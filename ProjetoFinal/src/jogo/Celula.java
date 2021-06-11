package jogo;

import java.awt.Graphics;
import java.util.ArrayList;

import agente.Agente;

public class Celula {
	private ArrayList<Agente> meusAgentes;
	private int i;
	private int j;
	private int x;
	private int y;
	private boolean estudante;
	private Agente agenteEstudante;
	
	public Celula(int i, int j, int x, int y) {
		this.i = i;
		this.j = j;
		this.x = x;
		this.y = y;
		estudante = false;
		agenteEstudante = null;
		meusAgentes = new ArrayList<Agente>();
	}

	public void adicionaAgente(Agente agente) {
		if(agente.getTipoAgente() == 'E') {
			estudante = true;
			agenteEstudante = agente;
		}
		meusAgentes.add(agente);
	}
	
	public void retiraAgente(Agente agente) {
		if(agente.getTipoAgente() == 'E') {
			estudante = false;
			agenteEstudante = null;
		}
		meusAgentes.remove(agente);
	}
	
	public void pintarTela(Graphics g) {
		for(int i = 0; i < meusAgentes.size(); i++) {
			g.drawImage( meusAgentes.get(i).getImagem(), x, y, null);
		}
	}
	
	public void mover() {
		for(int i = 0; i < meusAgentes.size(); i++) {
			meusAgentes.get(i).mover();
		}
	}
	
	public void colisao() {
		if(estudante == true) {
			for(int i = 0; i < meusAgentes.size(); i++) {
					agenteEstudante.colisao(meusAgentes.get(i).getTipoAgente());
				}
		}
	}
	
}
