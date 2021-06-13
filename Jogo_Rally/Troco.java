package Jogo_Rally;

public class Troco {
	
	public static enum TipoPiso {ASFALTO, OFFROAD, NEVE};
	public static enum EstadoPiso {MUITOBOMESTADO, BOMESTADO, MAUESTADO, MUITOMAUESTADO};
	public static enum Inclinacao {DESCIDA, SEMINCLINACAO, SUBIDA};
	public static enum QuantidadeCurvas {POUCASCURVAS, ALGUMASCURVAS, MUITASCURVAS};
	
	//1.ATRIBUTOS
	private TipoPiso tipoPiso;
	private EstadoPiso estadoPiso;
	private Inclinacao inclinacao;
	private QuantidadeCurvas quantidadeCurvas;
	
	
	//2.ACESSORES
	public TipoPiso getTipoPiso() {
		return tipoPiso;
	}

	public EstadoPiso getEstadoPiso() {
		return estadoPiso;
	}

	public Inclinacao getInclinacao() {
		return inclinacao;
	}

	public QuantidadeCurvas getQuantidadeCurvas() {
		return quantidadeCurvas;
	}
	

	//3.CONSTRUTOR - default
	public Troco() {
		
	}
	
	
	//4.CONSTRUTOR - com parâmetros
	public Troco(TipoPiso tipoPiso, EstadoPiso estadoPiso, Inclinacao inclinacao, QuantidadeCurvas quantidadeCurvas) {
		super();
		this.tipoPiso = tipoPiso;
		this.estadoPiso = estadoPiso;
		this.inclinacao = inclinacao;
		this.quantidadeCurvas = quantidadeCurvas;
	}
	
	
	//5.CONSTRUTOR - Cópia
	
	
	//6.COMPORTAMENTOS
	public int tempoTroco() {
		int tempo = 0;
		if(tipoPiso == TipoPiso.ASFALTO) {
			tempo = tempo + 60000;
		} else if(tipoPiso == TipoPiso.OFFROAD) {
			tempo = tempo + 80000;
		} else if(tipoPiso == TipoPiso.NEVE) {
			tempo = tempo + 100000;
		}
		
		
		if(estadoPiso == EstadoPiso.MUITOBOMESTADO) {
			tempo = tempo + 60000;
		} else if(estadoPiso == EstadoPiso.BOMESTADO) {
			tempo = tempo + 80000;
		} else if (estadoPiso == EstadoPiso.MAUESTADO) {
			tempo = tempo + 100000;
		} else if (estadoPiso == EstadoPiso.MUITOMAUESTADO) {
			tempo = tempo + 120000;
		}
		
		
		if(inclinacao == Inclinacao.DESCIDA) {
			tempo = tempo + 60000;
		} else if(inclinacao == Inclinacao.SEMINCLINACAO) {
			tempo = tempo + 80000;
		} else if(inclinacao == Inclinacao.SUBIDA) {
			tempo = tempo + 100000;
		}
		
		
		if(quantidadeCurvas == QuantidadeCurvas.POUCASCURVAS) {
			tempo = tempo + 80000;	
		} else if(quantidadeCurvas == QuantidadeCurvas.ALGUMASCURVAS) {
			tempo = tempo + 100000;
		} else if(quantidadeCurvas == QuantidadeCurvas.MUITASCURVAS) {
			tempo = tempo + 120000;		
		}
		
		return tempo;
	}
	
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Troco [Tipo Piso=" + tipoPiso + ", Estado Piso=" + estadoPiso + ", Inclinação=" + inclinacao + ", Quantidade Curvas=" + quantidadeCurvas + "]";
	}
	
}	
