package Jogo_Rally;

public class Carro {
	public static enum Suspensao {MUITOBOA, BOA, DANIFICADA, MUITODANIFICADA, ESTRAGADA};
	public static enum Travoes {MUITOBONS, BONS, DANIFICADOS, MUITODANIFICADOS, ESTRAGADOS};
	public static enum Pneus{NOVOS, SEMINOVOS, GASTOS, MUITOGASTOS,CARECAS};
	
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
	
	//3.CONSTRUTOR - default
	
	
	//4.CONSTRUTOR - com parâmetros
	public Carro(Suspensao suspensao, Travoes travoes, Pneus pneus) {
		super();
		this.suspensao = suspensao;
		this.travoes = travoes;
		this.pneus = pneus;
	}
	
	//5.CONSTRUTOR - Cópia
	
	
	//6.COMPORTAMENTOS
	public int tempoAfetadoCondicoesCarro() {
		int tempo = 0;
		if(suspensao == Suspensao.MUITOBOA) {
			tempo = tempo + 0;
		} else if(suspensao == Suspensao.BOA) {
			tempo = tempo + 30000;
		} else if(suspensao == Suspensao.DANIFICADA) {
			tempo = tempo + 60000;
		} else if(suspensao == Suspensao.MUITODANIFICADA) {
			tempo = tempo + 90000;
		} else if(suspensao == Suspensao.ESTRAGADA) {
			tempo = tempo + 120000;
		}
		
		if(travoes == Travoes.MUITOBONS) {
			tempo = tempo + 0;
		} else if(travoes == Travoes.BONS) {
			tempo = tempo + 30000;
		} else if(travoes == Travoes.DANIFICADOS) {
			tempo = tempo + 60000;
		} else if(travoes == Travoes.MUITODANIFICADOS) {
			tempo = tempo + 90000;
		} else if(travoes == Travoes.ESTRAGADOS) {
			tempo = tempo + 120000;
		}
		
		if(pneus == Pneus.NOVOS) {
			tempo = tempo + 0;
		} else if(pneus == Pneus.SEMINOVOS) {
			tempo = tempo + 30000;
		} else if(pneus == Pneus.GASTOS) {
			tempo = tempo + 60000;
		} else if(pneus == Pneus.MUITOGASTOS) {
			tempo = tempo + 90000;
		} else if(pneus == Pneus.CARECAS) {
			tempo = tempo + 120000;
		}
		
		return tempo;
	}
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Carro [suspensao=" + suspensao + ", travoes=" + travoes + ", pneus=" + pneus + "]";
	}
	
}
