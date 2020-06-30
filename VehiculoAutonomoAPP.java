/*PROCESO DE RENDIMIENTO Y EFICIENCIA DE CONDUCCION DE UN
VEHICULO AUTONOMO_RECARGO
 */
package vehiculoautonomo;

/**
 *
 * @author Hector Ortiz */
class VehiculoAutonomo {

    //ATRIBUTOS
 
    private String proceso;
    private double eficiencia_mecanica;
   
//COSNTRUCTOR
    public VehiculoAutonomo (String proceso){
        this(proceso, 120);//recargo
    }
  public VehiculoAutonomo(String Proceso, double eficiencia_mecanica){
      this.proceso =Proceso;
     
      if(eficiencia_mecanica>500){
          this.eficiencia_mecanica=500;
      }else{
          this.eficiencia_mecanica=eficiencia_mecanica;
      }
  }  
  
 //METODOS
  
  public String getProceso(){
      return proceso;
  }
  public void setProceso(String proceso){
    this.proceso=proceso;
}
  
  public double getEficiencia_Mecanica(){
      return eficiencia_mecanica;
  }
  public void setEficiencia_Mecanica(int eficiencia_mecanica){
      this.eficiencia_mecanica=eficiencia_mecanica;
  }

public void Obtener_Eficiencia_Proceso(double eficiencia_mecanica){
    if(eficiencia_mecanica>500){
        this.eficiencia_mecanica += eficiencia_mecanica;
    }
}
public void Volver_Iniciar_Pruevas(double eficiencia_mecanica){
    if(eficiencia_mecanica<500){
        this.eficiencia_mecanica=eficiencia_mecanica;
    }else{
        this.eficiencia_mecanica -= eficiencia_mecanica;
    }
}
  @Override
  public String toString(){
      return "El vehiculo autonomo posee diferentes procesos: "+proceso+"--"
              + "\nen los cuales se detectan los valores de eficiencia: "+eficiencia_mecanica+" sobre mil, "
              + "siendo registrados en las pruevas respectivas \n";
  }
}
public class VehiculoAutonomoAPP {
    public static void main(String[] args) {
       
        VehiculoAutonomo prueba1=new VehiculoAutonomo("Tegnologicos Automaticos",867);
        VehiculoAutonomo prueba2=new VehiculoAutonomo("Deep-Test Automatically",745);
 
          prueba1.Obtener_Eficiencia_Proceso(990);
          prueba2.Obtener_Eficiencia_Proceso(868);
        
          prueba1.Volver_Iniciar_Pruevas(704);
          prueba2.Volver_Iniciar_Pruevas(850);
        
          System.out.println(prueba1);
          System.out.println(prueba2);
          
      
    //COMPARAMOS QUIE TIENE LA MEJOR EFICIENCIA
    if(prueba1.getEficiencia_Mecanica()> prueba2.getEficiencia_Mecanica()){
      System.out.println(prueba1.getEficiencia_Mecanica()+"% es el mejor resultado de las 2 pruebas realizadas en campo abierto");
     }
    else{
      System.out.println(prueba2.getEficiencia_Mecanica()+"% es el mejor resultado de las 2 pruebas realizadas en campo abierto");
 }}
}

