

package ec.edu.espoch.automovil;

public class Automovil {

    public static void main(String[] args) {
        Auto caruno = new Auto("Toyota",2023 , 1.5f, 4,5 , 200f, Color.ROJO, 100f, TipodeCoche.COMPACTO, COMBUSTIBLE.DIESEL);
        
        caruno.currenctSpeed(0);
        System.out.println("velocidad inicial es de 0 km/h. ");
        
        caruno.acelerate(70);
        
        caruno.decelerate(50);
        
        caruno.brake();
        caruno.show();
        
        
        
    }
    
}
