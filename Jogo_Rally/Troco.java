package Jogo_Rally;

public class Troco {
	
	//1.ATRIBUTOS
	String tipoPiso;
	static String asfalto = "Asfalto";
	static String offroad = "Offroad";
	static String neve = "Neve";
	
	String estadoPiso;
	static String bomEstado = "Bom Estado";
	static String mauEstado = "Mau Estado";
	
	String inclinacao;
	static String subida = "Subida";
	static String semInclinacao = "Sem Inclina��o";
	static String descida = "Descida";
	
	String quantidadeCurvas;
	static String poucasCurvas = "Poucas Curvas";
	static String muitasCurvas = "Muitas Curvas";
	
	int tempo = 0;
	
	
	//2.ACESSORES
	public String getTipoPiso() {
		return tipoPiso;
	}
	public String getEstadoPiso() {
		return estadoPiso;
	}
	public String getInclinacao() {
		return inclinacao;
	}
	public String getQuantidadeCurvas() {
		return quantidadeCurvas;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	
	//3.CONSTRUTOR - default
	public Troco() {
		
	}
	
	
	//4.CONSTRUTOR - com par�metros
	public Troco(String tipoPiso, String estadoPiso, String inclinacao, String quantidadeCurvas) {
		super();
		
		if(tipoPiso == asfalto) {
			this.tipoPiso = tipoPiso ;	
		} else if(tipoPiso == offroad) {
			this.tipoPiso = tipoPiso;
		} else if(tipoPiso == neve) {
			this.tipoPiso = tipoPiso;
		} else
			throw new IllegalArgumentException("Tipo de piso inv�lido!");
		
		if(estadoPiso == bomEstado) {
			this.estadoPiso = tipoPiso;
		} else if(tipoPiso == mauEstado) {
			this.estadoPiso = estadoPiso;
		} else 
			throw new IllegalArgumentException("Estado de piso inv�lido!");
		
		if(inclinacao == descida) {
			this.inclinacao = inclinacao;
		} else if(inclinacao == semInclinacao) {
			this.inclinacao = inclinacao;
		} else if (inclinacao == subida) {
			this.inclinacao = inclinacao;
		} else 
			throw new IllegalArgumentException("Inclina��o inv�lida!");
		
		if(quantidadeCurvas == poucasCurvas) {
			this.quantidadeCurvas = quantidadeCurvas;
		} else if (quantidadeCurvas == muitasCurvas) { 
			this.quantidadeCurvas = quantidadeCurvas;
		} else 
			throw new IllegalArgumentException("Quantidade de curvas inv�lida!");
	}
	
	
	//5.CONSTRUTOR - C�pia
	
	
	//6.COMPORTAMENTOS
	public void tempoAfetadoTipoPiso() {
		if(tipoPiso == asfalto) {
			tempo = tempo + 30000;
		} else if(tipoPiso == offroad) {
			tempo = tempo + 60000;
		} else 
			tempo = tempo + 90000;
	}
	
	public void tempoAfetadoEstadoPiso() {
		if(estadoPiso == bomEstado) {
			tempo = tempo + 30000;
		} else
			tempo = tempo + 60000;
	}
	
	public void tempoAfetadoInclinacao() {
		if(inclinacao == descida) {
			tempo = tempo + 40000;
		} else if(inclinacao == semInclinacao) {
			tempo = tempo + 60000;
		} else 
			tempo = tempo + 90000;
	}
	
	public void tempoAfetadoQuantidadeCurvas() {
		if(quantidadeCurvas == poucasCurvas) {
			tempo = tempo + 60000;
		} else 
			tempo = tempo + 120000;
	}
	
	
	//7.M�TODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Troco [tipoPiso=" + tipoPiso + ", estadoPiso=" + estadoPiso + ", inclinacao=" + inclinacao
				+ ", quantidadeCurvas=" + quantidadeCurvas + ", tempo=" + tempo + "]";
	}
	
}	
