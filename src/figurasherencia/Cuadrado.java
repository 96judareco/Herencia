
package figurasherencia;

/**
 *@verion 1.0.0
 * @author JUAN DAVID REYES CORTES
 */
public class Cuadrado extends Coordenada{
    /**
     * Guarda el perimetro del Cuadrado o rectangulo
     */
    double perimetro;
    /**
     * constructor de la clase inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     */
 
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3){
        super(punto1,punto2,punto3);
    }  
    /**
      * retorna verdadero si es un cuadrado o falso de no ser asi
      * @return 
      */
    private boolean isCuadrado() {
        if(darLado1()==darLado2() ){
            System.out.print("Es un cuadrado");
        }
        else 
            System.out.print("Es un rectangulo");
        return true;
    }
    /**
     * retorna el tipo de figura que es cuadrado o rectangulo
     * @return 
     */
    public String Tipo() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
            String resultado=" ";
            double lado1=  darLado1();
            double lado2 = darLado2(); 
            if(lado1==lado2 ){
            resultado=" Cuadrado";
            }
            else
            {
            resultado="Rectangulo";
            }
            
        return resultado;
        }    
    /**
     * Este metodo retornara el perimetro de un cuadrado o un rectangulo
     * @return 
     */
    
   
    public double darPermietro() {  
        super.darLado1();
        super.darLado2();
        //si los lados sin iguales retorna perimetro de un cuadrado
        if(darLado1()==darLado2() ){
        this.perimetro=darLado1()*4;
    }   
        // sino retorna perimetro de un rectangulo
        else
            this.perimetro=darLado1()*2+darLado1()*2;
        return this.perimetro;
    }
    
    /**
     * Metodo que retorna el area de un Rectangulo o Cuadrado
     * @return  Area
     */
    
    @Override
    public double darArea() {
        super.darLado1();
        super.darLado2();

       double lado1 = darLado1();
       double lado2 = darLado2();
       
       //si los lados sin iguales retorna el area de  un cuadrado
       double area;
       if(lado1==lado2){
             area=Math.pow(lado1,2);
        }
        else
            area=lado1*lado2;
        return area;  
    }
     /**
     * imprime todos los metodos
     */

    
    @Override
    public void darResultados() {
       
        super.darLado1();
        super.darLado2();
        super.darLado3();

        if(isCuadrado()) {
            
            System.out.println("Lado1: " + darLado1()); 
            System.out.println("Lado2: " + darLado2());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            System.out.println(""+Tipo());
            } else {
            System.out.println("No es Cuadrado ");
        }    
    }
     
}
