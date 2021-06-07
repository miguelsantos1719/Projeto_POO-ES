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
		return trocos[idTroco];
	}
	
	//3.CONSTRUTOR - default
	


	//4.CONSTRUTOR - com parâmetros
	public Pista(Troco[] trocos) {
		super();
		this.trocos = trocos;
	}
	
	//5.CONSTRUTOR - Cópia
	

	//6.COMPORTAMENTOS
	public int tempoPistaTrocos() {
		int tempoPista = 0;
		for(int i = 0; i < trocos.length; i++) {
			System.out.println("====Troco "+ (i+1) +"====");
			int tempoTroco = trocos[i].tempoTroco();
			tempoPista = tempoPista + tempoTroco;
			
			if(i < trocos.length - 1) {
			System.out.println("Tempo pista até ao momento:" + tempoPista);
			} else if (i == trocos.length - 1)
				System.out.println("Tempo Total:" + tempoPista);
			
			System.out.println();
		}
		
		return tempoPista;
	}

		
	//7.METODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Pista [trocos=" + Arrays.toString(trocos) + "]";
	}
	
}