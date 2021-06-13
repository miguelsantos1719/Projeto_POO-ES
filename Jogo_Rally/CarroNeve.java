package Jogo_Rally;

import Jogo_Rally.Troco.TipoPiso;

public class CarroNeve extends Carro{
	
	//1.ATRIBUTOS
	
	
	//2.ACESSORES
	
	
	//3.CONSTRUTOR - default
	
	
	//4.CONSTRUTOR - com parâmetros
	public CarroNeve(Suspensao suspensao, Travoes travoes, Pneus pneus) {
		super(suspensao, travoes, pneus);
		this.TIPOCARRO = TipoPiso.NEVE;
	}
	
	
	//5.CONSTRUTOR - Cópia
	
	
	//6.COMPORTAMENTOS
	public int tempoPerdidoAsfalto() {
		int tempo = 15000;
		return tempo;
	}
	
	public int tempoPerdidoOffroad() {
		int tempo = 15000;
		return tempo;
	}
	
	public int tempoGanhoNeve() {
		int tempo = -20000;
		return tempo;
	}
	
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "CarroNeve [TIPOCARRO=" + TIPOCARRO + ", suspensao=" + getSuspensao() + ", travoes=" + getTravoes() + ", pneus=" + getPneus() + "]";
	}
	
}
