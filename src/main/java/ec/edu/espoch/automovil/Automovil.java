

package ec.edu.espoch.automovil;

import java.util.HashSet;

public class Automovil {

    public static void main(String[] args) {
        /*Auto caruno = new Auto("Toyota",2023 , 1.5f, 4,5 , 200f, Color.ROJO, 100f, TipodeCoche.COMPACTO, COMBUSTIBLE.DIESEL);
        
        caruno.currenctSpeed(0);
        System.out.println("velocidad inicial es de 0 km/h. ");
        
        caruno.acelerate(70);
        
        caruno.decelerate(50);
        
        caruno.brake();
        caruno.show();*/
        
        Auto caruno = new Auto();
        
       caruno.setBrand("toyota");
       caruno.setCOLOr(Color.ROJO);
       caruno.setCombustible(COMBUSTIBLE.DIESEL);
       caruno.setCurrenctSpeed(0);
       caruno.setDoors(4);
       caruno.setEngine(2);
       caruno.setMaximumSpeed(200);
       caruno.setModel(2023);
       caruno.setSeast(5);
       caruno.setTipodecoche(TipodeCoche.COMPACTO);
     
       
        
        caruno.show();
        
       
        
    }
    
}
