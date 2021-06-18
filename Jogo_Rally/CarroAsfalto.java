package Jogo_Rally;

import Jogo_Rally.Troco.TipoPiso;

public class CarroAsfalto extends Carro{
	
	//1.ATRIBUTOS
	
	
	//2.ACESSORES
	
	
	//3.CONSTRUTOR - default
	
	
	//4.CONSTRUTOR - com parâmetros
	public CarroAsfalto(Suspensao suspensao, Travoes travoes, Pneus pneus) {
		super(suspensao, travoes, pneus);
		this.TIPOCARRO = TipoPiso.ASFALTO;
	}
	
	
	//5.CONSTRUTOR - Cópia
	

	//6.COMPORTAMENTOS
	public int tempoGanhoAsfalto() {
		int tempo = -20000;
		return tempo;
	}
	
	public int tempoPerdidoOffroad() {
		int tempo = 15000;
		return tempo;
	}
	
	public int tempoPerdidoNeve() {
		int tempo = 15000;
		return tempo;
	}
	
	
	//7.MÉTODOS COMPLEMENTARES

	
}