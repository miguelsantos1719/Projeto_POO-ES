package Jogo_Rally;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Jogo_Rally.Troco.EstadoPiso;
import Jogo_Rally.Troco.Inclinacao;
import Jogo_Rally.Troco.QuantidadeCurvas;
import Jogo_Rally.Troco.TipoPiso;

class TrocoTest {
	
	Troco troco1 = new Troco(TipoPiso.OFFROAD, EstadoPiso.BOMESTADO, Inclinacao.SEMINCLINACAO, QuantidadeCurvas.ALGUMASCURVAS);
	
	@Test
	void testGetTipoPiso() {
		assertEquals(TipoPiso.OFFROAD, troco1.getTipoPiso());
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetEstadoPiso() {
		assertEquals(EstadoPiso.BOMESTADO, troco1.getEstadoPiso());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetInclinacao() {
		assertEquals(Inclinacao.SEMINCLINACAO, troco1.getInclinacao());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetQuantidadeCurvas() {
		assertEquals(QuantidadeCurvas.ALGUMASCURVAS, troco1.getQuantidadeCurvas());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTroco() {
		//TESTE ALCOOL + GEl ALOEVERA
//		assertThrows(IllegalArgumentException.class, () -> {new Gel(0.6, 0.7, 50);},
//				"O valor da soma do alcool com o gel aloevera deverá ser 1");
		
		assertThrows(IllegalArgumentException.class, () -> {new Troco();});		
		
		fail("Not yet implemented");
	}

	@Test
	void testTrocoTipoPisoEstadoPisoInclinacaoQuantidadeCurvas() {
//		assertThrows(IllegalArgumentException.class, () -> {new Troco(null, null, null, null);},
//				"Dados introduzido incorretos");	
		
		assertThrows(IllegalArgumentException.class, () -> {new Troco(TipoPiso.valueOf(null), EstadoPiso.BOMESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.ALGUMASCURVAS);});
		
		//fail("Not yet implemented");
	}

	@Test
	void testTrocoTroco() {
		fail("Not yet implemented");
	}

	@Test
	void testTempoTroco() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsTroco() {
		fail("Not yet implemented");
	}

}
