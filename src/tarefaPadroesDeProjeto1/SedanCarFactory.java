package tarefaPadroesDeProjeto1;


public class SedanCarFactory extends CarFactory {
	@Override
	public Carro createCar() {
		return new SedanCar();
	}
}
