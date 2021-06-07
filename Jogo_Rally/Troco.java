package Jogo_Rally;

public class Troco {
	
	public static enum TipoPiso {ASFALTO, OFFROAD, NEVE};
	public static enum EstadoPiso {BOMESTADO, MAUESTADO};
	public static enum Inclinacao {DESCIDA, SEMINCLINACAO, SUBIDA};
	public static enum QuantidadeCurvas {POUCASCURVAS, MUITASCURVAS};
	
	//1.ATRIBUTOS
	private TipoPiso tipoPiso;
	private EstadoPiso estadoPiso;
	private Inclinacao inclinacao;
	private QuantidadeCurvas quantidadeCurvas;
	//int tempo = 0;
	
	
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
	
//	public int getTempo() {
//		return tempoAfetadoTroco();
//	}

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
		System.out.println("=====Tempo Tipo Piso====");
		if(tipoPiso == TipoPiso.ASFALTO) {
			tempo = tempo + 30000;
			System.out.println("tempo: " + tempo);
		} else if(tipoPiso == TipoPiso.OFFROAD) {
			tempo = tempo + 60000;
			System.out.println("tempo: " + tempo);
		} else if(tipoPiso == TipoPiso.NEVE) {
			tempo = tempo + 90000;
			System.out.println("tempo: " + tempo);
		}
		
		System.out.println("=====Tempo Estado Piso====");
		if(estadoPiso == EstadoPiso.BOMESTADO) {
			tempo = tempo + 30000;
			System.out.println("tempo: " + tempo);
		} else if (estadoPiso == EstadoPiso.MAUESTADO) {
			tempo = tempo + 60000;
			System.out.println("tempo: " + tempo);
		}
		
		System.out.println("=====Tempo Inclinacao====");
		if(inclinacao == Inclinacao.DESCIDA) {
			tempo = tempo + 40000;
			System.out.println("tempo: " + tempo);
		} else if(inclinacao == Inclinacao.SEMINCLINACAO) {
			tempo = tempo + 60000;
			System.out.println("tempo: " + tempo);
		} else if(inclinacao == Inclinacao.SUBIDA) {
			tempo = tempo + 90000;
			System.out.println("tempo: " + tempo);
		}
		
		System.out.println("=====Tempo Quantidade Curvas====");
		if(quantidadeCurvas == QuantidadeCurvas.POUCASCURVAS) {
			tempo = tempo + 60000;
			System.out.println("tempo: " + tempo);
		} else if(quantidadeCurvas == QuantidadeCurvas.MUITASCURVAS) {
			tempo = tempo + 120000;
			System.out.println("tempo: " + tempo);
		}
		
		return tempo;
	}
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Troco [tipoPiso=" + tipoPiso + ", estadoPiso=" + estadoPiso + ", inclinacao=" + inclinacao
				+ ", quantidadeCurvas=" + quantidadeCurvas + "]";
	}
	
}	
