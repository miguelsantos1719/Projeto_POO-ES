package Jogo_Rally;

import Jogo_Rally.Carro.Pneus;
import Jogo_Rally.Carro.Suspensao;
import Jogo_Rally.Carro.Travoes;
import Jogo_Rally.Troco.EstadoPiso;
import Jogo_Rally.Troco.TipoPiso;

public class Main {

	public static void main(String[] args) {
		
		//CRIACAO TROCOS
		Troco troco1 = new Troco(Troco.TipoPiso.ASFALTO, Troco.EstadoPiso.BOMESTADO, Troco.Inclinacao.DESCIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		Troco troco2 = new Troco(Troco.TipoPiso.NEVE, Troco.EstadoPiso.BOMESTADO, Troco.Inclinacao.SEMINCLINACAO, Troco.QuantidadeCurvas.MUITASCURVAS);
		Troco troco3 = new Troco(Troco.TipoPiso.OFFROAD, Troco.EstadoPiso.MAUESTADO, Troco.Inclinacao.SUBIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		
		Troco troco8 = new Troco(TipoPiso.ASFALTO, null, null, null);
		//CRIACAO VETOR TROCOS
		Troco[] conjuntoTrocos = new Troco[] {troco1, troco2, troco3, troco3, troco1, troco2, troco8}; 
		 
		//CRIACAO PISTA COM VETOR TROCOS
		Pista pista1 = new Pista(conjuntoTrocos);
		
		//CRIACAO CARROS
		Carro carro1 = new Carro(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		Carro carro2 = new Carro(Suspensao.BOA, Travoes.BONS, Pneus.GASTOS);
		
		CarroAsfalto carro4 = new CarroAsfalto(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		CarroOffroad carro5 = new CarroOffroad(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		CarroNeve carro6 = new CarroNeve(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		
		//CRIACAO VETOR CARROS
		Carro[] conjuntoCarros = new Carro[] {carro2, carro1, carro2, carro1, carro1, carro4, carro5, carro6};
		
		//CRIACAO CORRIDA
		Corrida corrida1 = new Corrida(pista1, conjuntoCarros);
		
		
		//GETTERS
		//GETS TROCO
		System.out.println("====GETs CARACTERISTICAS TROCO1====");
		System.out.println(troco1.getTipoPiso());
		System.out.println(troco1.getEstadoPiso());
		System.out.println(troco1.getInclinacao());
		System.out.println(troco1.getQuantidadeCurvas());
		System.out.println();
		
		//GETS PISTA
		System.out.println("====GET TROÇO ESPECIFICO DA PISTA====");
		System.out.println(pista1.getTroco(4));
		System.out.println();
		
		System.out.println("====GET TODOS TROÇOS DA PISTA====");
		pista1.getTrocos();
		System.out.println();
		//GETS CARRO
		System.out.println("====GETs CARACTERISTICAS CARRO4====");
		System.out.println(carro4.getTIPOCARRO());
		System.out.println(carro4.getSuspensao());
		System.out.println(carro4.getTravoes());
		System.out.println(carro4.getPneus());
		System.out.println();
		
		//GETS CORRIDA
		System.out.println("====GET CARRO ESPECIFICO DA CORRIDA====");
		System.out.println(corrida1.getCarro(2));
		System.out.println();
		
		System.out.println("====GET TODOS CARROS DA CORRIDA====");
		corrida1.getCarros();
		System.out.println();
		
		System.out.println("====GET PISTA DA CORRIDA====");
		System.out.println(corrida1.getPista());
		System.out.println();
		
		
		corrida1.tempoCorrida();
		System.out.println();
		
		//CLONE E EQUALS TROCO
		Troco troco1Copia = troco1.clone();
		System.out.println("'troco1'='troco1Copia': " + troco1.equals(troco1Copia));
	    
		//CLONE E EQUALS PISTA
		Pista pista1Copia = pista1.clone();
		System.out.println("'pista1'='pista1Copia': " + pista1.equals(pista1Copia));
		
		//CLONE E EQUALS PISTA
		Corrida corrida1Copia = corrida1.clone();
		System.out.println("'corrida1'='corrida1Copia': " + corrida1.equals(corrida1Copia));
		
		//CLONE E EQUALS CARROS
		Carro carro1Copia = carro1.clone();
		System.out.println("'carro1'='carro1Copia': " + carro1.equals(carro1Copia));
		
		CarroAsfalto carro4Copia = new CarroAsfalto(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
		System.out.println("'carro4'='carro4Copia': " + carro4.equals(carro4Copia));
		
		
	}
	
}