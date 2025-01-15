package com.gui.estruturadados.vetor;

public class vetor {
	private String[] elementos;
	
	public vetor(int capacidade) {
		this.elementos = new String[capacidade];
		
	}
	
	public void adiciona(String elemento) {
		for(int i = 0;i<= this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
}
