package tarefaPadroesDeProjeto1.programa;

import tarefaPadroesDeProjeto1.CarFactory;
import tarefaPadroesDeProjeto1.Carro;
import tarefaPadroesDeProjeto1.SUVCarFactory;
import tarefaPadroesDeProjeto1.SedanCarFactory;

public class Main {
    public static void main(String[] args) {
        
    	
    	
        CarFactory sedanFactory = new SedanCarFactory();

       
        Carro sedanCar = sedanFactory.createCar();
        sedanCar.assemble(); 

        
        CarFactory suvFactory = new SUVCarFactory();

        
        Carro suvCar = suvFactory.createCar();
        suvCar.assemble();
    }
}
