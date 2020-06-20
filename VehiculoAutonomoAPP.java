/*PROCESO DE RENDIMIENTO Y EFICIENCIA DE CONDUCCION DE UN
VEHICULO AUTONOMO
 */
package vehiculoautonomo;

/**
 *
 * @author Hector Ortiz */
class VehiculoAutonomo {

    //ATRIBUTOS
    private String control;
    private String proceso;
    private int eficiencia;
    private int resultado;
   
//COSNTRUCTOR
  public VehiculoAutonomo(String pControl, String pProceso, int pEficiencia, int pResultado){
      control= pControl;
      proceso= pProceso;
      eficiencia= pEficiencia;
      resultado= pResultado;
  }  
  
 //METODOS
  public String getControl(){
      return control;
  }

  public void setControl(String control){
      this.control=control;
  }
  
  
  public String getProceso(){
      return proceso;
  }
  public void setProceso(String proceso){
    this.proceso=proceso;
}
  
  
  public int getEficiencia(){
      return eficiencia;
  }
  public void setEficiencia(int eficiencia){
      this.eficiencia=eficiencia;
  }
  
  public int getResultado(){
      return resultado;
  }
  public void setResultado(int resultado){
      this.resultado=resultado;
  }
  
  @Override
  public String toString(){
      return "El vehiculo autonomo posee un control: "+control+" con diferentes procesos: "+proceso+"--"
              + "\nen los cuales se detectan los valores de eficiencia: "+eficiencia+" sobre mil, "
              + "siendo registrados en las pruevas respectivas "
              +"\ndando un valor de: "+resultado+"% como resultado efectivo\n\n";
  }
}

public class VehiculoAutonomoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAMOS LOS OBJETOS
        VehiculoAutonomo prueba1=new VehiculoAutonomo("Neuronal Sinaptico","Tegnologicos Automaticos",234,67);
        VehiculoAutonomo prueba2=new VehiculoAutonomo("Deep-Test Automatically","Neuronal",345,89);
        
        //MOSTRAMOS EL ESTADO
        System.out.println(prueba1.toString());
        System.out.println(prueba2.toString());
        
        //MODIFICAMOS EL ATRIBUTO CORRESPONDIENTE A "Resultado" de la prueva 1
        prueba1.setResultado(86);
        
        //COMPRAMOS QUE PRUEBA TIENE EL MEJOR RESULTADO
        if(prueba1.getResultado()>prueba2.getResultado()){
            System.out.println(prueba1.getResultado()+"% es el mejor resultado de las 2 pruebas realizadas en campo abierto");
        }
        else{
            System.out.println(prueba2.getResultado()+"% es el mejor resultado de las 2 pruebas realizadas en campo abierto");
        }
    }
    
}
