package Jogo_Rally;

import java.util.Arrays;

public class Pista {
	//1.ATRIBUTOS
	private Troco[] trocos;
	
	
	//2.ACESSORES
	public void getTrocos() {
		for(int i = 0; i < trocos.length; i++) {
			System.out.println("Troco " + (i+1) + ": " + trocos[i].toString());
		}
	}
	
	private Troco[] getTrocos2() {
		return trocos;
	}
	
	public Troco getTroco(int idTroco) {
		if(idTroco <= 0) {
			idTroco = 0;
		} else if (idTroco > trocos.length) {
			idTroco = trocos.length - 1;
		} else {
			idTroco = idTroco - 1;
		}
		
		return trocos[idTroco];
	}
	
	
	//3.CONSTRUTOR - default
	public Pista() {
		
	}


	//4.CONSTRUTOR - com parâmetros
	public Pista(Troco[] trocos) {
		super();
		this.trocos = trocos;
	}
	
	
	//5.CONSTRUTOR - Cópia
	public Pista(Pista pista) {
		this.trocos = pista.getTrocos2();
	}
	

	//6.COMPORTAMENTOS
	public int[] tempoPistaTrocos() {
		int[] tempoPista = new int[trocos.length];
		for(int i = 0; i < trocos.length; i++) {
			int tempoTroco = trocos[i].tempoTroco();
			tempoPista[i] = tempoTroco;
		}
		
		return tempoPista;
	}
	
	
	//7.METODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Pista " + Arrays.toString(trocos);
		// "Pista " + Arrays.toString(getTrocos());
	}
	
	public Pista clone() {
		return new Pista(this);
	}
	
	public boolean equals(Pista pista) {
		if(pista == null) {
			return false;
		}
		
		if(trocos.equals(pista.getTrocos2())) {
			return true;
		} else 
			return false;
	}
	
}