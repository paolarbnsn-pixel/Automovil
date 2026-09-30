
package ec.edu.espoch.automovil;


public class Auto {

    /*atributos*/
     private  String brand;
    private int model;
    private float engine;
    private int doors;
    private  int seast;
    private  float MaximumSpeed;
    private Color COLOr;
    private  float currenctSpeed;
    private TipodeCoche tipodecoche;
    private COMBUSTIBLE combustible;
    // setter and getter//

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeast() {
        return seast;
    }

    public void setSeast(int seast) {
        this.seast = seast;
    }

    public float getMaximumSpeed() {
        return MaximumSpeed;
    }

    public void setMaximumSpeed(float MaximumSpeed) {
        this.MaximumSpeed = MaximumSpeed;
    }

    public Color getCOLOr() {
        return COLOr;
    }

    public void setCOLOr(Color COLOr) {
        this.COLOr = COLOr;
    }

    public float getCurrenctSpeed() {
        return currenctSpeed;
    }

    public void setCurrenctSpeed(float currenctSpeed) {
        this.currenctSpeed = currenctSpeed;
    }

    public TipodeCoche getTipodecoche() {
        return tipodecoche;
    }

    public void setTipodecoche(TipodeCoche tipodecoche) {
        this.tipodecoche = tipodecoche;
    }

    public COMBUSTIBLE getCombustible() {
        return combustible;
    }

    public void setCombustible(COMBUSTIBLE combustible) {
        this.combustible = combustible;
    }
    
    

    public Auto(String brand, int model, float engine, int doors, int seast, float MaximumSpeed, Color color, float currenctSpeed, TipodeCoche tipodecoche, COMBUSTIBLE combustible) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
        this.seast = seast;
        this.MaximumSpeed = MaximumSpeed;
        this.COLOr = color;
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
         System.out.println("color: "+COLOr);
         System.out.println("currenctSpeed: "+ currenctSpeed );
         System.out.println("tipodecoche: "+tipodecoche);
         System.out.println("combustible: "+ combustible);
     }
     public void currenctSpeed(float speed){
         this.currenctSpeed= speed;
     }
    
}
