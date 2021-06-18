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
	void testTrocoTipoPisoEstadoPisoInclinacaoQuantidadeCurvas() {
		assertThrows(IllegalArgumentException.class, () -> {new Troco(null, null, null, null);});	
		
		assertThrows(IllegalArgumentException.class, () -> {new Troco(null,             EstadoPiso.BOMESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.ALGUMASCURVAS);});
		assertThrows(IllegalArgumentException.class, () -> {new Troco(TipoPiso.ASFALTO, null,                 Inclinacao.DESCIDA, QuantidadeCurvas.ALGUMASCURVAS);});
		assertThrows(IllegalArgumentException.class, () -> {new Troco(TipoPiso.ASFALTO, EstadoPiso.BOMESTADO, null,               QuantidadeCurvas.ALGUMASCURVAS);});
		assertThrows(IllegalArgumentException.class, () -> {new Troco(TipoPiso.ASFALTO, EstadoPiso.BOMESTADO, Inclinacao.DESCIDA, null);});
	}

	@Test
	void testTrocoTroco() {
		Troco troco = new Troco(troco1);
		
		assertEquals(troco.getTipoPiso(), troco1.getTipoPiso());
		assertEquals(troco.getEstadoPiso(), troco1.getEstadoPiso());
		assertEquals(troco.getInclinacao(), troco1.getInclinacao());
		assertEquals(troco.getQuantidadeCurvas(), troco1.getQuantidadeCurvas());
		
		//fail("Not yet implemented");
	}

	@Test
	void testTempoTroco() {
		Troco troco2 = new Troco(TipoPiso.ASFALTO, EstadoPiso.MUITOBOMESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.POUCASCURVAS);
		Troco troco3 = new Troco(TipoPiso.NEVE, EstadoPiso.MAUESTADO, Inclinacao.SUBIDA, QuantidadeCurvas.MUITASCURVAS);
		Troco troco4 = new Troco(TipoPiso.ASFALTO, EstadoPiso.MUITOMAUESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.POUCASCURVAS);
		
		
		assertEquals(340000, troco1.tempoTroco());
		assertEquals(260000, troco2.tempoTroco());
		assertEquals(420000, troco3.tempoTroco());
		assertEquals(320000, troco4.tempoTroco());
		
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		String teste = "Troco [Tipo Piso=" + troco1.getTipoPiso() + ", Estado Piso=" + troco1.getEstadoPiso() + ", Inclinação=" + troco1.getInclinacao() + ", Quantidade Curvas=" + troco1.getQuantidadeCurvas() + "]";
		
		assertEquals(teste, troco1.toString());
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testClone() {
		Troco troco = troco1.clone();
		
		assertEquals(troco.getTipoPiso(), troco1.getTipoPiso());
		assertEquals(troco.getEstadoPiso(), troco1.getEstadoPiso());
		assertEquals(troco.getInclinacao(), troco1.getInclinacao());
		assertEquals(troco.getQuantidadeCurvas(), troco1.getQuantidadeCurvas());
		
		//fail("Not yet implemented");
	}
	
	@Test
	void testEqualsTroco() {
		Troco troco2 = new Troco(TipoPiso.ASFALTO, EstadoPiso.MUITOBOMESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.POUCASCURVAS);
		Troco troco3 = new Troco(TipoPiso.NEVE, EstadoPiso.MAUESTADO, Inclinacao.SUBIDA, QuantidadeCurvas.MUITASCURVAS);
		Troco troco4 = new Troco(TipoPiso.ASFALTO, EstadoPiso.MUITOMAUESTADO, Inclinacao.DESCIDA, QuantidadeCurvas.POUCASCURVAS);
		
		assertFalse(troco1.equals(troco2));
		assertFalse(troco1.equals(troco3));
		assertFalse(troco1.equals(troco4));
		
		Troco troco1Copia = new Troco(TipoPiso.OFFROAD, EstadoPiso.BOMESTADO, Inclinacao.SEMINCLINACAO, QuantidadeCurvas.ALGUMASCURVAS);
		assertTrue(troco1.equals(troco1Copia));
		
		//fail("Not yet implemented");
	}

}
