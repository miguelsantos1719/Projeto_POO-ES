package Jogo_Rally;

import java.time.Duration;
import java.util.Arrays;

public class Corrida {
	//1.ATRIBUTOS
	private Pista pista;
	private Carro[] carros;
	//private int[] classificacao;
	
	//2.ACESSORES
	public Pista getPista() {
		return pista;
	}
	
	public Carro getCarro(int idCarro) {
		return carros[idCarro];
	}
	
	public void getCarros() {
		for(int i = 0; i < carros.length; i++) {
			System.out.println("Carro " + (i+1) + ": " + carros[i].toString());
		}
	}
	
	//3.CONSTRUTOR - default


	//4.CONSTRUTOR - com parâmetros
	public Corrida(Pista pista, Carro[] carros) {
		super();
		this.pista = pista;
		this.carros = carros;
	}
	
	//5.CONSTRUTOR - Cópia
	

	//6.COMPORTAMENTOS
	public void tempoCorrida(int nCarros) {
		int tempoCarro = 0;
		int tempoPista = pista.tempoPistaTrocos();
		int[] classificacao = new int[nCarros];
		
		System.out.println();
		System.out.println("====TEMPO CARROS====");
		for(int i = 0; i < carros.length; i++) {
			System.out.println("====Tempo Carro "+ (i+1) +"====");
			Carro CarroAsfalto = null;
			if(carros[i] == CarroAsfalto) {
			tempoCarro = tempoPista + carros[i].tempoAfetadoCondicoesCarro();
			}
			classificacao[i] = tempoCarro;	
			conversaoTempo(tempoCarro);
		}
		
        int menorTempo = classificacao[0]; //the first element is the supposed min
        for(int i = 1; i < classificacao.length; i++){
            //a value less than min was found
            if(menorTempo > classificacao[i]){
                menorTempo = classificacao[i]; //replace the min value
            }
        }
		
        System.out.println();
        System.out.print("Vencedor(es) = ");
        conversaoTempo(menorTempo);
	}
	
	public void conversaoTempo(int tempoCarro) {
		Duration tempoDecorrido = Duration.ofMillis(tempoCarro);
	    String conversaoTempo = String.format(
	            "%d:%d:%d",
	            tempoDecorrido.toHours(),
	            tempoDecorrido.toMinutesPart(),
	            tempoDecorrido.toSecondsPart());
	    
	    System.out.println(conversaoTempo);
	}
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Corrida [pista=" + pista + ", carros=" + Arrays.toString(carros) + ", carros=" +"]";
	}
	
}
