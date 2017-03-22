/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

/**
 *@verion 1.0.0
 * @author JUAN DAVID REYES CORTES
 */
public class Coordenada {
    /**
     * atributo que contendra el area de la figura
     */
    public double area;
    /**
     * atributo que contendra el perimetro de la figura
     */
    public double  perimetro;

      /**
     * e inicializacion de las las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Coordenada(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        
    }
    
    public Coordenada(){
        
    }
    /**
     * retornara el area
     * @return 
     */
    public double getArea() {
        return area;
    }
    /**
     * modificara el area
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * retornara el perimetro
     * @return 
     */
    public double getPerimetro() {
        return perimetro;
    }
     /**
      * modificara el perimetro
      * @param perimetro 
      */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Coordenada(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    /**
     * contiene la cordenada x1 y1
     */
    public Punto punto1;
    
    /**
     *  contiene la cordenada x2 y2
     */    
    public Punto punto2;
    
    /**
     * contiene la cordenada x3 y3
     */        
    public Punto punto3;
  
    /**
     * retorna el primer punto
     * @return 
     */
      
    public Punto getPunto1() {
        return punto1;
    }
     /**
      * modifica el primer punto
      * @param punto1 
      */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
     /**
      * retorna el segundo punto
      * @return 
      */
    public Punto getPunto2() {
        return punto2;
    }
     /**
      * modifica el segundo punto
      * @param punto2 
      */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    /**
     * retorna el tercer punto
     * @return 
     */

    public Punto getPunto3() {
        return punto3;
    }
    /**
     * modifica el tercer punto
     * @param punto3 
     */

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
     /**
     * Retorna longitud de lado 1
     * @return 
     */
    public double darLado1(){
        
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
    
        return lado;
    }
    
    /**
     * Retorna longitud de lado 2
     * @return 
     */
    public double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorna longitud del lado 3
     * @return 
     */
    public double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    } 
    /**
    * Retorna el area
    * @return 
    */
    public double darArea(){
        
        return area;
    }
    /**
    * retorna el perimetro
    * @return 
    */
    public double darPerimetro(){
        
        return perimetro;
    }
    /**
    * metodo que muestra los datos
    */
    public void darResultados(){
        
    }
}
