package Jogo_Rally;

import Jogo_Rally.Troco.TipoPiso;

public class CarroOffroad extends Carro{
	
	//1.ATRIBUTOS
	
	
	//2.ACESSORES
	
	
	//3.CONSTRUTOR - default
	
	
	//4.CONSTRUTOR - com parâmetros
	public CarroOffroad(Suspensao suspensao, Travoes travoes, Pneus pneus) {
		super(suspensao, travoes, pneus);
		this.TIPOCARRO = TipoPiso.OFFROAD;
	}
	
	
	//5.CONSTRUTOR - Cópia
	
	
	//6.COMPORTAMENTOS
	public int tempoPerdidoAsfalto() {
		int tempo = 15000;
		return tempo;
	}
	
	public int tempoGanhoOffroad() {
		int tempo = -20000;
		return tempo;
	}
	
	public int tempoPerdidoNeve() {
		int tempo = 15000;
		return tempo;
	}
	
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "CarroOffroad [TIPOCARRO=" + TIPOCARRO + ", suspensao=" + getSuspensao() + ", travoes=" + getTravoes() + ", pneus=" + getPneus() + "]";
	}
	
}
