package Jogo_Rally;

/**
 * Classe que representa um troço de uma pista de um jogo de rally.
 * 
 * Cada troço é constituído por um tipo de piso (pode ser asfalto, offroad ou neve) que é avaliado em relação ao seu estado que poderá estar em muito bom, bom, mau ou muito mau estado.
 * O troço é definido também tendo em conta a sua inclinação (descida, sem inclinação, subida) e a quantidade de curvas (avaliado em poucas, algumas ou muitas curvas).
 * 
 * Consoante todas estas caracteristicas o troço vai ter um tempo atribuido de base para mais tarde serem efetuados os devidos cálculos na classe corrida consoante a pista e os carros envolvidos na própria.
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
	 * Cada troço tem um tipo de piso (asfalto, offroad ou neve) onde cada um vai ter o seu tempo atribuido.
	 */
	private TipoPiso tipoPiso;
	
	/**
	 * A cada estado do piso (muito bom, bom, mau ou muito mau estado) da mesma forma que o tipo do piso, vai ser atribuido um tempo.
	 */
	private EstadoPiso estadoPiso;
	
	/**
	 * O troço pode ser a descer, a subir ou não ter inclinação, sendo afetado o tempo de forma diferente em cada um deles.
	 */
	private Inclinacao inclinacao;
	
	/**
	 * Cada troço pode ser avaliado em poucas, algumas ou muitas curvas sendo que quanto mais curvas maior o tempo do troço.
	 */
	private QuantidadeCurvas quantidadeCurvas;
	
	
	//2.ACESSORES
	/**
	 * Diz o tipo de piso do troço.
	 * 
	 * @return tipo de piso do troço.
	 */
	public TipoPiso getTipoPiso() {
		return tipoPiso;
	}
	
	/**
	 * Diz em que estado está o piso do troço.
	 * 
	 * @return estado do piso do troço.
	 */
	public EstadoPiso getEstadoPiso() {
		return estadoPiso;
	}
	
	/**
	 * Diz como é o troço em relação à sua inclinação.
	 * 
	 * @return inclinação do troço. 
	 */
	public Inclinacao getInclinacao() {
		return inclinacao;
	}
	
	/**
	 * Diz qual o nível de quantidade de curvas do troço.
	 * 
	 * @return quantidade de curvas do troço.
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
	
	
	
	//4.CONSTRUTOR - com parâmetros
	/**
	 * Constrói um troço onde é obtigatório ter todas as 4 características já citadas anteriormente.
	 * Desde que contenha as 4 caracteristicas e essas estejam dentro das possíveis definições para cada, o troço é definido à escolha do utilizador.
	 * 
	 * @param tipoPiso - tipo de piso que o troço vai ter.
	 * @param estadoPiso - o estado em que o piso do reço vai estar.
	 * @param inclinacao - nível de inclinação do troço.
	 * @param quantidadeCurvas - nível de quantidade de curvas que o troço terá.
	 */
	public Troco(TipoPiso tipoPiso, EstadoPiso estadoPiso, Inclinacao inclinacao, QuantidadeCurvas quantidadeCurvas) {
		super();
		
		if(tipoPiso == null) {
			throw new IllegalArgumentException("Tipo de piso não pode ser nulo!");
		} else 
			this.tipoPiso = tipoPiso;
		if(estadoPiso == null) {
			throw new IllegalArgumentException("Estado de piso não pode ser nulo!");
		} else
			this.estadoPiso = estadoPiso;
		
		if(inclinacao == null) {
			throw new IllegalArgumentException("Inclinação do troço não pode ser nula!");
		} else
			this.inclinacao = inclinacao;
		
		if(quantidadeCurvas == null) {
			throw new IllegalArgumentException("A quantidade de curvas não pode ser nula!");
		} else
			this.quantidadeCurvas = quantidadeCurvas;
	}
	
	
	//5.CONSTRUTOR - Cópia
	/**
	 * Constrói um troço que é copia de outro troço já criado.
	 * 
	 * @param troco - troço já criado para poder fazer a cópia.
	 */
	public Troco(Troco troco) {
		this.tipoPiso = troco.getTipoPiso();
		this.estadoPiso = troco.getEstadoPiso();
		this.inclinacao = troco.getInclinacao();
		this.quantidadeCurvas = troco.getQuantidadeCurvas();
	}
	
	
	//6.COMPORTAMENTOS
	/**
	 * Calcula o tempo base que o troço vai ter consoante as caracteristicas do troço.
	 * 
	 * @return tempo base do troço.
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
	
	
	//7.MÉTODOS COMPLEMENTARES
	/**
	 * Devolver informação sobre o troço, nomeadamente o tipo e estado do piso, a inclinação e a quantidade de curvas do troço.
	 * A string que é devolvida vem no seguinte formado: "Troco [Tipo Piso='tipoPiso', Estado Piso='estadoPiso', Inclinação='inclinacao', Quantidade Curvas='quantidadeCurvas']"
	 * 
	 * Ex: "Troco [Tipo Piso=ASFALTO, Estado Piso=BOMESTADO, Inclinação=DESCIDA, Quantidade Curvas=POUCASCURVAS]"
	 * 
	 * @return uma string informando as características do troço.
	 */
	@Override
	public String toString() {
		return "Troco [Tipo Piso=" + tipoPiso + ", Estado Piso=" + estadoPiso + ", Inclinação=" + inclinacao + ", Quantidade Curvas=" + quantidadeCurvas + "]";
	}
	
	/**
	 * Faz um clone do troço.
	 * 
	 * @return clone do troço.
	 */
	public Troco clone() {
		return new Troco(this);
	}
	
	/**
	 * Verifica se o troço indicado é igual.
	 * 
	 * @param troco - troço com o qual queremos verificar se é igual.
	 * @return true se os troços forem iguais, false se não forem.
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