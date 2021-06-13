package Jogo_Rally;

import Jogo_Rally.Troco.TipoPiso;

public class Carro {
	protected static enum Suspensao {MUITOBOA, BOA, DANIFICADA, MUITODANIFICADA, ESTRAGADA};
	protected static enum Travoes {MUITOBONS, BONS, DANIFICADOS, MUITODANIFICADOS, ESTRAGADOS};
	protected static enum Pneus{NOVOS, SEMINOVOS, GASTOS, MUITOGASTOS,CARECAS};
	protected TipoPiso TIPOCARRO;
	
	//1.ATRIBUTOS
	private Suspensao suspensao;
	private Travoes travoes;
	private Pneus pneus;
	
	//2.ACESSORES
	public Suspensao getSuspensao() {
		return suspensao;
	}
	
	public Travoes getTravoes() {
		return travoes;
	}
	
	public Pneus getPneus() {
		return pneus;
	}
	
	public TipoPiso getTIPOCARRO() {
		return TIPOCARRO;
	}
	
	//3.CONSTRUTOR - default
	
	
	//4.CONSTRUTOR - com par�metros
	public Carro(Suspensao suspensao, Travoes travoes, Pneus pneus) {
		super();
		this.suspensao = suspensao;
		this.travoes = travoes;
		this.pneus = pneus;
		this.TIPOCARRO = null;
	}
	
	
	//5.CONSTRUTOR - C�pia
	
	
	//6.COMPORTAMENTOS
	public int tempoAfetadoCondicoesCarro() {
		int tempo = 0;
		if(suspensao == Suspensao.MUITOBOA) {
			tempo = tempo + 0;
		} else if(suspensao == Suspensao.BOA) {
			tempo = tempo + 10000;
		} else if(suspensao == Suspensao.DANIFICADA) {
			tempo = tempo + 20000;
		} else if(suspensao == Suspensao.MUITODANIFICADA) {
			tempo = tempo + 30000;
		} else if(suspensao == Suspensao.ESTRAGADA) {
			tempo = tempo + 40000;
		}
		
		if(travoes == Travoes.MUITOBONS) {
			tempo = tempo + 0;
		} else if(travoes == Travoes.BONS) {
			tempo = tempo + 10000;
		} else if(travoes == Travoes.DANIFICADOS) {
			tempo = tempo + 20000;
		} else if(travoes == Travoes.MUITODANIFICADOS) {
			tempo = tempo + 30000;
		} else if(travoes == Travoes.ESTRAGADOS) {
			tempo = tempo + 40000;
		}
		
		if(pneus == Pneus.NOVOS) {
			tempo = tempo + 0;
		} else if(pneus == Pneus.SEMINOVOS) {
			tempo = tempo + 10000;
		} else if(pneus == Pneus.GASTOS) {
			tempo = tempo + 20000;
		} else if(pneus == Pneus.MUITOGASTOS) {
			tempo = tempo + 30000;
		} else if(pneus == Pneus.CARECAS) {
			tempo = tempo + 40000;
		}
		
		return tempo;
	}
	
	
	//7.M�TODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Carro [Tipo Carro=" + TIPOCARRO + ", Suspens�o=" + suspensao + ", Trav�es=" + travoes + ", Pneus=" + pneus + "]";
	}
	
}
