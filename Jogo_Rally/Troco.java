package Jogo_Rally;

/**
 * Classe que representa um tro�o de uma pista de um jogo de rally.
 * 
 * Cada tro�o � constitu�do por um tipo de piso (pode ser asfalto, offroad ou neve) que � avaliado em rela��o ao seu estado que poder� estar em muito bom, bom, mau ou muito mau estado.
 * O tro�o � definido tamb�m tendo em conta a sua inclina��o (descida, sem inclina��o, subida) e a quantidade de curvas (avaliado em poucas, algumas ou muitas curvas).
 * 
 * Consoante todas estas caracteristicas o tro�o vai ter um tempo atribuido de base para mais tarde serem efetuados os devidos c�lculos na classe corrida consoante a pista e os carros envolvidos na pr�pria.
 * 
 * @author miguelsantos
 */
public class Troco {
	
	public static enum TipoPiso {ASFALTO, OFFROAD, NEVE};
	public static enum EstadoPiso {MUITOBOMESTADO, BOMESTADO, MAUESTADO, MUITOMAUESTADO};
	public static enum Inclinacao {DESCIDA, SEMINCLINACAO, SUBIDA};
	public static enum QuantidadeCurvas {POUCASCURVAS, ALGUMASCURVAS, MUITASCURVAS};
	
	//1.ATRIBUTOS
	/**
	 * Cada tro�o tem um tipo de piso (asfalto, offroad ou neve) onde cada um vai ter o seu tempo atribuido.
	 */
	private TipoPiso tipoPiso;
	
	/**
	 * A cada estado do piso (muito bom, bom, mau ou muito mau estado) da mesma forma que o tipo do piso, vai ser atribuido um tempo.
	 */
	private EstadoPiso estadoPiso;
	
	/**
	 * O tro�o pode ser a descer, a subir ou n�o ter inclina��o, sendo afetado o tempo de forma diferente em cada um deles.
	 */
	private Inclinacao inclinacao;
	
	/**
	 * Cada tro�o pode ser avaliado em poucas, algumas ou muitas curvas sendo que quanto mais curvas maior o tempo do tro�o.
	 */
	private QuantidadeCurvas quantidadeCurvas;
	
	
	//2.ACESSORES
	/**
	 * Diz o tipo de piso do tro�o.
	 * 
	 * @return tipo de piso do tro�o.
	 */
	public TipoPiso getTipoPiso() {
		return tipoPiso;
	}
	
	/**
	 * Diz em que estado est� o piso do tro�o.
	 * 
	 * @return estado do piso do tro�o.
	 */
	public EstadoPiso getEstadoPiso() {
		return estadoPiso;
	}
	
	/**
	 * Diz como � o tro�o em rela��o � sua inclina��o.
	 * 
	 * @return inclina��o do tro�o. 
	 */
	public Inclinacao getInclinacao() {
		return inclinacao;
	}
	
	/**
	 * Diz qual o n�vel de quantidade de curvas do tro�o.
	 * 
	 * @return quantidade de curvas do tro�o.
	 */
	public QuantidadeCurvas getQuantidadeCurvas() {
		return quantidadeCurvas;
	}
	

	//3.CONSTRUTOR - default
	/**
	 * Construtor default criado automaticamente pelo ecplipse.
	 */
	public Troco() {
		
	}
	
	
	
	//4.CONSTRUTOR - com par�metros
	public Troco(TipoPiso tipoPiso, EstadoPiso estadoPiso, Inclinacao inclinacao, QuantidadeCurvas quantidadeCurvas) {
		super();
		this.tipoPiso = tipoPiso;
		this.estadoPiso = estadoPiso;
		this.inclinacao = inclinacao;
		this.quantidadeCurvas = quantidadeCurvas;
	}
	
	
	//5.CONSTRUTOR - C�pia
	public Troco(Troco troco) {
		this.tipoPiso = troco.getTipoPiso();
		this.estadoPiso = troco.getEstadoPiso();
		this.inclinacao = troco.getInclinacao();
		this.quantidadeCurvas = troco.getQuantidadeCurvas();
	}
	
	
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
	
	
	//7.M�TODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Troco [Tipo Piso=" + tipoPiso + ", Estado Piso=" + estadoPiso + ", Inclina��o=" + inclinacao + ", Quantidade Curvas=" + quantidadeCurvas + "]";
	}
	
	public Troco clone() {
		return new Troco(this);
	}
	
	public boolean equals(Troco troco) {
		if(troco == null) {
			return false;
		}
		
		if(tipoPiso.equals(troco.getTipoPiso())) {
			if (estadoPiso.equals(troco.getEstadoPiso())) {
				if (inclinacao.equals(troco.getInclinacao())) {
					if (quantidadeCurvas.equals(troco.getQuantidadeCurvas())) {
						return true;
					} else
						return false;
				} else
					return false;
			} else 
				return false;
		} else 
			return false;
		
	}
}