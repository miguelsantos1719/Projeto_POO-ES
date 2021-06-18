package Jogo_Rally;

import java.time.Duration;
import java.util.Arrays;
import Jogo_Rally.Troco.TipoPiso;

public class Corrida {
	//1.ATRIBUTOS
	private Pista pista;
	private Carro[] carros;
	
	//2.ACESSORES
	public Pista getPista() {
		return pista;
	}
	
	public Carro getCarro(int idCarro) {
		if(idCarro <= 0) {
			idCarro = 0;
		} else if (idCarro > carros.length) {
			idCarro = carros.length - 1;
		} else {
			idCarro = idCarro - 1;
		}
		return carros[idCarro];
	}
	
	public void getCarros() {
		for(int i = 0; i < carros.length; i++) {
			System.out.println("Carro " + (i+1) + ": " + carros[i].toString());
		}
	}
	
	private Carro[] getCarros2() {
		return carros;
	}
	
	//3.CONSTRUTOR - default
	public Corrida() {
		
	}
	
	
	//4.CONSTRUTOR - com parâmetros
	public Corrida(Pista pista, Carro[] carros) {
		super();
		this.pista = pista;
		this.carros = carros;
	}
	
	
	//5.CONSTRUTOR - Cópia
	public Corrida(Corrida corrida) {
		this.pista = corrida.getPista();
		this.carros = corrida.getCarros2();
	}
	
	
	//6.COMPORTAMENTOS
	public void tempoCorrida() {
		int tempoCarro = 0;
		int[] tempoTrocos = pista.tempoPistaTrocos();
		int[] tempoTrocosAcumulado = new int[carros.length];
		
		for(int i = 0; i < tempoTrocos.length; i++) {
			System.out.println();
			System.out.println("=======TEMPO TROCO " + (i+1) + "=======" );
			
			TipoPiso tipoPista = pista.getTroco(i+1).getTipoPiso();
			System.out.println(tipoPista);
			
			for(int j = 0; j < carros.length; j++) {
				TipoPiso tipoCarro = carros[j].getTIPOCARRO();
				
				
				if(tipoCarro == null) {
					tempoCarro = tempoTrocos[i] + carros[j].tempoAfetadoCondicoesCarro();
					if(tipoPista == null) {
						tempoCarro = 0;
					} else if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					}
					
					
				} else if(tipoCarro == TipoPiso.ASFALTO) {
					
					if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					} else if(tipoPista == TipoPiso.ASFALTO) {
						tempoCarro = tempoTrocos[i] + ((CarroAsfalto)carros[j]).tempoGanhoAsfalto() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.OFFROAD) {
						tempoCarro = tempoTrocos[i] + ((CarroAsfalto)carros[j]).tempoPerdidoOffroad() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.NEVE) {
						tempoCarro = tempoTrocos[i] + ((CarroAsfalto)carros[j]).tempoPerdidoNeve() + carros[j].tempoAfetadoCondicoesCarro();
					} 
					
				} else if(tipoCarro == TipoPiso.OFFROAD) {
					if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					} else if(tipoPista == TipoPiso.ASFALTO) {
						tempoCarro = tempoTrocos[i] + ((CarroOffroad)carros[j]).tempoPerdidoAsfalto() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.OFFROAD) {
						tempoCarro = tempoTrocos[i] + ((CarroOffroad)carros[j]).tempoGanhoOffroad() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.NEVE) {
						tempoCarro = tempoTrocos[i] + ((CarroOffroad)carros[j]).tempoPerdidoNeve() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					}
						
				} else if(tipoCarro == TipoPiso.NEVE) {
					if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					} else if(tipoPista == TipoPiso.ASFALTO) {
						tempoCarro = tempoTrocos[i] + ((CarroNeve)carros[j]).tempoPerdidoAsfalto()+ carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.OFFROAD) {
						tempoCarro = tempoTrocos[i] + ((CarroNeve)carros[j]).tempoPerdidoOffroad() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(tipoPista == TipoPiso.NEVE) {
						tempoCarro = tempoTrocos[i] + ((CarroNeve)carros[j]).tempoGanhoNeve() + carros[j].tempoAfetadoCondicoesCarro();
					} else if(pista.getTroco(i+1).getEstadoPiso() == null || pista.getTroco(i+1).getInclinacao() == null || pista.getTroco(i+1).getQuantidadeCurvas() == null) {
						tempoCarro = 0;
					}
				}
				
				tempoTrocosAcumulado[j] = tempoTrocosAcumulado[j] + tempoCarro;
				System.out.println("Carro " + (j+1) + ": " + conversaoTempo(tempoTrocosAcumulado[j]) + " (" + conversaoTempo(tempoCarro) + ")");
				
			}
		}
		
		System.out.println();
		System.out.println("=======TEMPO FINAL=======");
		for(int i = 0; i < tempoTrocosAcumulado.length; i++){
			System.out.println("Carro " + (i+1) + ": " + conversaoTempo(tempoTrocosAcumulado[i]));
	    }
		
        int menorTempo = tempoTrocosAcumulado[0];
        for(int i = 1; i < tempoTrocosAcumulado.length; i++){
            
            if(menorTempo > tempoTrocosAcumulado[i]){
                menorTempo = tempoTrocosAcumulado[i]; 
            }
        }
		
        System.out.println();
        System.out.println("Vencedor(es) = " + conversaoTempo(menorTempo));
       
	}
	
	
	public String conversaoTempo(int tempoCarro) {
		Duration tempoDecorrido = Duration.ofMillis(tempoCarro);
	    String conversaoTempo = String.format(
	            "%d:%d:%d",
	            tempoDecorrido.toHours(),
	            tempoDecorrido.toMinutesPart(),
	            tempoDecorrido.toSecondsPart());
	    
	    return conversaoTempo;
	}
	
	//7.MÉTODOS COMPLEMENTARES
	@Override
	public String toString() {
		return "Corrida [pista=" + pista + ", carros=" + Arrays.toString(carros) + ", carros=" +"]";
	}
	
	public Corrida clone() {
		return new Corrida(this);
	}
	
	public boolean equals(Corrida corrida) {
//		if(corrida == null) {
//			return false;
//		}
		
		if(pista.equals(corrida.getPista())) {
			if(carros.equals(corrida.getCarros2())) {
				return true;
			} else
				return false;
		} else 
			return false;
	}
	
}
