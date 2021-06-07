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
		System.out.println("====TEMPO CARRO SOMADO A PISTA====");
		for(int i = 0; i < carros.length; i++) {
			System.out.println("====Tempo Carro "+ (i+1) +"====");
			tempoCarro = tempoPista + carros[i].tempoAfetadoCondicoesCarro();
			classificacao[i] = tempoCarro;	
			System.out.println(tempoCarro);
		}
		
		for(int i = 0; i < classificacao.length; i++) {
			if(classificacao[i] == classificacao[i+1]) {
				
			}
		}
		
		
		
		Arrays.sort(classificacao);
		
		System.out.println();
		System.out.println("====TEMPO CARRO SOMADO A PISTA POR ORDEM====");
		for(int i = 0; i < classificacao.length;  i++) {
			if(i == 0) {
				System.out.println("===="+ (i+1) +"º Classificado====");
				System.out.println(classificacao[i]);
			} else if(i != 0) {
				if(classificacao[i] == classificacao[i-1]) {
					System.out.println("====" + "º Classificado====");
					System.out.println(classificacao[i]);
				} else { 
					System.out.println("====" + (i+1) +"º Classificado====");
					System.out.println(classificacao[i]);
				}
			}
			//System.out.println("===="+ (i+1) +"º Classificado====");
			//tempoCarro = tempoPista + carros[i].tempoAfetadoCondicoesCarro();
			//System.out.println(classificacao[i]);
		}
		
	}
	
	public void conversaoTempo() {
		
		//int tempoPista3 = 0;
		Duration elapsedTime = Duration.ofMillis(0);
	    String humanReadableElapsedTime = String.format(
	            "%d hours, %d mins, %d seconds",
	            elapsedTime.toHours(),
	            elapsedTime.toMinutesPart(),
	            elapsedTime.toSecondsPart());
	    
	    System.out.println(humanReadableElapsedTime);
	}

	
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Corrida [pista=" + pista + ", carros=" + Arrays.toString(carros) + ", carros=" +"]";
	}
	
}
