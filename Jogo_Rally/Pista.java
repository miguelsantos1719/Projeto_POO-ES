package Jogo_Rally;

public class Pista {
	//1.ATRIBUTOS
	private Troco[] trocos;
	int tempoPista = 0;
	
	//2.ACESSORES
	public Troco[] getTrocos() {
		return trocos;
	}
	
	public Troco getTroco(int idxTroco) {
		return trocos[idxTroco];
	}
	
	public int getTempoPista() {
		return tempoPista;
	}
	
	//3.CONSTRUTOR - default
	


	//4.CONSTRUTOR - com parâmetros
	public Pista(Troco[] trocos) {
		super();
		this.trocos = trocos;
	}
	
	//5.CONSTRUTOR - Cópia
	

	//6.COMPORTAMENTOS
	public void tempoPistaTrocos() {
		
		for(int i = 0; i < trocos.length; i++) {
			System.out.println("====Troco "+ i +"====");
			trocos[i].tempoAfetadoTroco();
			System.out.println("Tempo pista até ao momento:" + trocos[i].getTempo());
		}
		
	}

	
	
	//7.MÉTODOS COMPLEMENTARES
	
	
	
	
}
