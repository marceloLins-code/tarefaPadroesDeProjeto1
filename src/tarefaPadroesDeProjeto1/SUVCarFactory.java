package tarefaPadroesDeProjeto1;


public class SUVCarFactory extends CarFactory {
	
	@Override
	public Carro createCar() {
		return new SUVCar();
	}
}
