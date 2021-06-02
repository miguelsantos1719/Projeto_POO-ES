package Jogo_Rally;

public class Main {

	public static void main(String[] args) {
		
		Troco troco = new Troco(Troco.TipoPiso.ASFALTO, Troco.EstadoPiso.BOMESTADO, 
				Troco.Inclinacao.DESCIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		
		Troco troco2 = new Troco(Troco.TipoPiso.NEVE, Troco.EstadoPiso.BOMESTADO, 
				Troco.Inclinacao.DESCIDA, Troco.QuantidadeCurvas.MUITASCURVAS);
		
		Troco troco3 = new Troco(Troco.TipoPiso.OFFROAD, Troco.EstadoPiso.MAUESTADO, 
				Troco.Inclinacao.SUBIDA, Troco.QuantidadeCurvas.POUCASCURVAS);
		
		//Pista pista1 = new Pista();
		
		
	}

}
