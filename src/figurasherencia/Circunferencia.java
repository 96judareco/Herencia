/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 *@version  1.0.0
 * @author JUAN DAVID REYES CORTES
 */
public class Circunferencia extends Coordenada{
  /**
   * constructor de la clase inicializa las variables
   * @param punto1
   * @param punto2
   * @param punto3 
   */
    public Circunferencia(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2, punto3);
    }
     @Override
    public double darArea(){
        super.darLado1();
         area =(double)(Math.PI*((darLado1())*(darLado1())));
         return area;
    }
     /**
    * Retornara  el valor del perimetro de la circunferencia 
    *@return 
    */
    @Override
    public double darPerimetro(){
        super.darLado1();
        perimetro=(double)(Math.PI*(2*darLado1()));
        return perimetro;
    }
     /**
     * Imprime el Area y el perimetro del circunferencia
     */
    @Override
    public void darResultados() {
            System.out.println("Area de la circunferencia : " + darArea());
            System.out.println("Perimetro de la circunferencia " + darPerimetro());           
    }


    
}
