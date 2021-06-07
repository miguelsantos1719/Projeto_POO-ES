package Jogo_Rally;

import Jogo_Rally.Carro.Pneus;
import Jogo_Rally.Carro.Suspensao;
import Jogo_Rally.Carro.Travoes;

public class Main {

	public static void main(String[] args) {
		
		//CRIACAO TROCOS
		Troco troco = new Troco(Troco.TipoPiso.ASFALTO, Troco.EstadoPiso.BOMESTADO, Troco.Inclinacao.DESCIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		Troco troco2 = new Troco(Troco.TipoPiso.NEVE, Troco.EstadoPiso.BOMESTADO, Troco.Inclinacao.SEMINCLINACAO, Troco.QuantidadeCurvas.MUITASCURVAS);
		Troco troco3 = new Troco(Troco.TipoPiso.OFFROAD, Troco.EstadoPiso.MAUESTADO, Troco.Inclinacao.SUBIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		
		
		//GETTERS
//		System.out.println("PISO TROCO 1 = " + troco.getTipoPiso());
//		System.out.println();
		
		//CRIACAO VETOR TROCOS
		Troco[] conjuntoTrocos = new Troco[] {troco, troco2, troco3, troco3, troco, troco2}; 
		
		//CRIACAO PISTA COM VETORES
		Pista pista1 = new Pista(conjuntoTrocos);
		
		//GETTERS
//		System.out.println("CARACTERISTICAS TROCO3 = " + pista1.getTroco(2));
//		System.out.println();
//		
//		pista1.getTrocos();
//		System.out.println();
//		
//		//CALCULO TEMPO PISTA
//		pista1.tempoPistaTrocos();
//		
//		//GET TEMPO PISTA
//		System.out.println(pista1.getTempoPista());
//		System.out.println();
		
		
		//CRIACAO CARROS
		Carro carro1 = new Carro(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		Carro carro2 = new Carro(Suspensao.BOA, Travoes.BONS, Pneus.GASTOS);
		
		CarroAsfalto carro4 = new CarroAsfalto(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		
		Carro[] conjuntoCarros = new Carro[] {carro2, carro1, carro2, carro1, carro1, carro4};
		
		//GETTERS
		System.out.println("GET Suspensao Carro 1 = " + carro1.getSuspensao());
		System.out.println();
		
		//CRIACAO CORRIDA
		Corrida corrida1 = new Corrida(pista1, conjuntoCarros);
		System.out.println(corrida1.getPista());
		corrida1.getCarros();
		System.out.println();
		
		//MOSTRAR TEMPOS TROCOS E CARROS
		//INTRODUZIR NR CARROS
		corrida1.tempoCorrida(6);
		
		
	    
	}
	
}