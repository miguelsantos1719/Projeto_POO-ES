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
	/**
	 * Constr�i um tro�o onde � obtigat�rio ter todas as 4 caracter�sticas j� citadas anteriormente.
	 * Desde que contenha as 4 caracteristicas e essas estejam dentro das poss�veis defini��es para cada, o tro�o � definido � escolha do utilizador.
	 * 
	 * @param tipoPiso - tipo de piso que o tro�o vai ter.
	 * @param estadoPiso - o estado em que o piso do re�o vai estar.
	 * @param inclinacao - n�vel de inclina��o do tro�o.
	 * @param quantidadeCurvas - n�vel de quantidade de curvas que o tro�o ter�.
	 */
	public Troco(TipoPiso tipoPiso, EstadoPiso estadoPiso, Inclinacao inclinacao, QuantidadeCurvas quantidadeCurvas) {
		super();
		
		if(tipoPiso == null) {
			throw new IllegalArgumentException("Tipo de piso n�o pode ser nulo!");
		} else 
			this.tipoPiso = tipoPiso;
		if(estadoPiso == null) {
			throw new IllegalArgumentException("Estado de piso n�o pode ser nulo!");
		} else
			this.estadoPiso = estadoPiso;
		
		if(inclinacao == null) {
			throw new IllegalArgumentException("Inclina��o do tro�o n�o pode ser nula!");
		} else
			this.inclinacao = inclinacao;
		
		if(quantidadeCurvas == null) {
			throw new IllegalArgumentException("A quantidade de curvas n�o pode ser nula!");
		} else
			this.quantidadeCurvas = quantidadeCurvas;
	}
	
	
	//5.CONSTRUTOR - C�pia
	/**
	 * Constr�i um tro�o que � copia de outro tro�o j� criado.
	 * 
	 * @param troco - tro�o j� criado para poder fazer a c�pia.
	 */
	public Troco(Troco troco) {
		this.tipoPiso = troco.getTipoPiso();
		this.estadoPiso = troco.getEstadoPiso();
		this.inclinacao = troco.getInclinacao();
		this.quantidadeCurvas = troco.getQuantidadeCurvas();
	}
	
	
	//6.COMPORTAMENTOS
	/**
	 * Calcula o tempo base que o tro�o vai ter consoante as caracteristicas do tro�o.
	 * 
	 * @return tempo base do tro�o.
	 */
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
	/**
	 * Devolver informa��o sobre o tro�o, nomeadamente o tipo e estado do piso, a inclina��o e a quantidade de curvas do tro�o.
	 * A string que � devolvida vem no seguinte formado: "Troco [Tipo Piso='tipoPiso', Estado Piso='estadoPiso', Inclina��o='inclinacao', Quantidade Curvas='quantidadeCurvas']"
	 * 
	 * Ex: "Troco [Tipo Piso=ASFALTO, Estado Piso=BOMESTADO, Inclina��o=DESCIDA, Quantidade Curvas=POUCASCURVAS]"
	 * 
	 * @return uma string informando as caracter�sticas do tro�o.
	 */
	@Override
	public String toString() {
		return "Troco [Tipo Piso=" + tipoPiso + ", Estado Piso=" + estadoPiso + ", Inclina��o=" + inclinacao + ", Quantidade Curvas=" + quantidadeCurvas + "]";
	}
	
	/**
	 * Faz um clone do tro�o.
	 * 
	 * @return clone do tro�o.
	 */
	public Troco clone() {
		return new Troco(this);
	}
	
	/**
	 * Verifica se o tro�o indicado � igual.
	 * 
	 * @param troco - tro�o com o qual queremos verificar se � igual.
	 * @return true se os tro�os forem iguais, false se n�o forem.
	 */
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