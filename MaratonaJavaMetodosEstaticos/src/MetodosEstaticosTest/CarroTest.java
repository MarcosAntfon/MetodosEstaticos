package MetodosEstaticosTest;

import MetodosEstaticosDominio.Carro;

public class CarroTest {
		public static void main(String[] args) {
		Carro.setVelocidadeLimite(180);
			
		Carro c1 = new Carro("BMW", 295);
		Carro c2 = new Carro("Ferrari", 385);
		Carro c3 = new Carro("Lamborghini Garllado", 395);
		
	
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
	}

}
