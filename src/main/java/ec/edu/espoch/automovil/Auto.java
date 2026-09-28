
package ec.edu.espoch.automovil;


public class Auto {

    /*atributos*/
     public  String brand;
    public  int model;
    public float engine;
    public int doors;
    public  int seast;
    public  float MaximumSpeed;
    public Color color;
    public  float currenctSpeed;
    public TipodeCoche tipodecoche;
    public COMBUSTIBLE combustible;

    public Auto(String brand, int model, float engine, int doors, int seast, float MaximumSpeed, Color color, float currenctSpeed, TipodeCoche tipodecoche, COMBUSTIBLE combustible) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
        this.seast = seast;
        this.MaximumSpeed = MaximumSpeed;
        this.color = color;
        this.currenctSpeed = currenctSpeed;
        this.tipodecoche = tipodecoche;
        this.combustible = combustible;
    }
    
    
    
    
     /*metodo*/
    
     public void acelerate(float velocidadagg){
          
           if(currenctSpeed+ velocidadagg < MaximumSpeed ){
               System.out.println(" Aceleraste ");
           }else{
               System.out.println(" sobre pasaste la aceleracion maxima ");
           }
      }
     public void decelerate( float velocidadagg){
         
         if(currenctSpeed-velocidadagg < 0){
             
            System.out.println(" Error, haz desacelerado a una velocidad negativa"); 
         }else{
             System.out.println(" haz desacelerado "); 
         }
     }
     public void brake(){
         System.out.println("Frenaste");
         
     }
     public void time (int distancia){
         
         System.out.println("El tiempo estimado de llegada es:" + (distancia/currenctSpeed));
         
     }
     
     public void show(){
         System.out.println("model: "+model);
         System.out.println("brand: "+brand);
         System.out.println("engine: "+engine);
         System.out.println("doors: "+ doors);
         System.out.println("Seast: "+seast);
         System.out.println("MaximumSpeed: "+MaximumSpeed);
         System.out.println("color: "+color);
         System.out.println("currenctSpeed: "+ currenctSpeed );
         System.out.println("tipodecoche: "+tipodecoche);
         System.out.println("combustible: "+ combustible);
     }
     public void currenctSpeed(float speed){
         this.currenctSpeed= speed;
     }
    
}
