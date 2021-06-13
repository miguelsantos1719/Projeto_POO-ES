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
	


	//4.CONSTRUTOR - com par�metros
	public Pista(Troco[] trocos) {
		super();
		this.trocos = trocos;
	}
	
	//5.CONSTRUTOR - C�pia
	

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
	
}