package Jogo_Rally;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jogo_Rally.Carro.Pneus;
import Jogo_Rally.Carro.Suspensao;
import Jogo_Rally.Carro.Travoes;
import Jogo_Rally.Troco.EstadoPiso;
import Jogo_Rally.Troco.Inclinacao;
import Jogo_Rally.Troco.QuantidadeCurvas;
import Jogo_Rally.Troco.TipoPiso;

class CarroAsfaltoTest {
	
	CarroAsfalto carro1 = new CarroAsfalto(Suspensao.MUITOBOA, Travoes.MUITOBONS, Pneus.NOVOS);
	CarroAsfalto carro2 = new CarroAsfalto(Suspensao.DANIFICADA, Travoes.DANIFICADOS, Pneus.GASTOS);
	
	//TESTES CLASSE CARROASFALTO
	@Test
	void testCarroAsfalto() {
		assertThrows(IllegalArgumentException.class, () -> {new CarroAsfalto(null, null, null);});	
		
		assertThrows(IllegalArgumentException.class, () -> {new CarroAsfalto(null, Travoes.MUITOBONS, Pneus.NOVOS);});
		assertThrows(IllegalArgumentException.class, () -> {new CarroAsfalto(Suspensao.MUITOBOA, null, Pneus.NOVOS);});
		assertThrows(IllegalArgumentException.class, () -> {new CarroAsfalto(Suspensao.MUITOBOA, Travoes.MUITOBONS, null);});
		
		assertEquals(TipoPiso.ASFALTO, carro1.getTIPOCARRO());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTempoGanhoAsfalto() {
		assertEquals(-20000, carro1.tempoGanhoAsfalto());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTempoPerdidoOffroad() {
		assertEquals(15000, carro1.tempoPerdidoOffroad());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTempoPerdidoNeve() {
		assertEquals(15000, carro1.tempoPerdidoNeve());
		
		//fail("Not yet implemented");
	}
	
	
	//TESTES METODOS HERDADOS CLASSE CARRO
	@Test
	void testGetSuspensao() {
		assertEquals(Suspensao.MUITOBOA, carro1.getSuspensao());
		
		assertFalse(Suspensao.BOA == carro2.getSuspensao());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetTravoes() {
		assertEquals(Travoes.MUITOBONS, carro1.getTravoes());
		
		assertFalse(Travoes.BONS == carro2.getTravoes());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetPneus() {
		assertEquals(Pneus.NOVOS, carro1.getPneus());
		
		assertFalse(Pneus.SEMINOVOS == carro2.getPneus());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetTIPOCARRO() {
		assertEquals(TipoPiso.ASFALTO, carro1.getTIPOCARRO());
		
		assertFalse(TipoPiso.NEVE == carro2.getTIPOCARRO());
		
		//fail("Not yet implemented");
	}
	
	
	@Test
	void testCarroCarro() {
		Carro carro3 = new Carro(carro1);
		
		assertEquals(carro3.getSuspensao(), carro1.getSuspensao());
		assertEquals(carro3.getTravoes(), carro1.getTravoes());
		assertEquals(carro3.getPneus(), carro1.getPneus());
		assertEquals(carro3.getTIPOCARRO(), carro1.getTIPOCARRO());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTempoAfetadoCondicoesCarro() {
		assertEquals(0, carro1.tempoAfetadoCondicoesCarro());
		assertEquals(60000, carro2.tempoAfetadoCondicoesCarro());
		
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		String teste = "Carro [Tipo Carro=" + carro1.getTIPOCARRO() + ", Suspensão=" + carro1.getSuspensao() + ", Travões=" + carro1.getTravoes() + ", Pneus=" + carro1.getPneus() + "]";
		
		assertEquals(teste, carro1.toString());
		
		//fail("Not yet implemented");
	}

	@Test
	void testClone() {
		Carro carro3 = carro1.clone();
		
		assertEquals(carro3.getSuspensao(), carro1.getSuspensao());
		assertEquals(carro3.getTravoes(), carro1.getTravoes());
		assertEquals(carro3.getPneus(), carro1.getPneus());
		assertEquals(carro3.getTIPOCARRO(), carro1.getTIPOCARRO());
		
		//fail("Not yet implemented");
	}

	@Test
	void testEqualsCarro() {
		CarroAsfalto carro2Copia = new CarroAsfalto(Suspensao.DANIFICADA, Travoes.DANIFICADOS, Pneus.GASTOS);
		CarroAsfalto carro3 = new CarroAsfalto(Suspensao.ESTRAGADA, Travoes.ESTRAGADOS, Pneus.CARECAS);
		
		assertFalse(carro1.equals(carro2));
		assertFalse(carro2.equals(carro3));
		assertTrue(carro2.equals(carro2Copia));
		
		//fail("Not yet implemented");
	}

}
