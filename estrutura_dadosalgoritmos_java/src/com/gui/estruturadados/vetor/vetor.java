package com.gui.estruturadados.vetor;

public class vetor {
	private String[] elementos;
	private int tamanho;
	public vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
		
	}
	
	/*public void adiciona(String elemento) {
		for(int i = 0;i<= this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
	
		}
	}*/
	public void adiciona(String elemento) throws Exception {
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			
		}else {
			throw new Exception(" o numero de elementos e maior que o tamanho da string");
		}
	}
	public void vervetor() {
		for (String string : elementos) {
			System.out.print(string+",");
		}
		
	}
}
