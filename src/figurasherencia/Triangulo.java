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
public class Triangulo extends Coordenada {
    /**
     * Guarda el tipo de triangulo
     */
    private String tipo;
    
    /**
     * Inicializa las variables del triangulo
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2, punto3);
    }
    
     /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isTriangulo() {
        String resultado;
         if(darLado1()+darLado2()<darLado3() || darLado2()+darLado3()<darLado1() ||darLado1()+darLado3()<darLado2()){
            System.out.println("Estos valores no forman un triangulo");
        }
         else
             System.out.println("Este es el triangulo que digito");
        return true;
    }
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    private double darPermietro() {
        super.darLado1();
        super.darLado2();
        super.darLado3();        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
     /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
     
    @Override
    public double darArea() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
     /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
            double lado1=  darLado1();
            double lado2 = darLado2();
            double lado3 = darLado3();
        
        if(darLado1()==darLado2() && darLado2()==darLado3()) {
       tipo="equilatero";
        }
        if(darLado1()==darLado2()&&darLado2()!=darLado3()||darLado2()==darLado2()&&darLado3()!=darLado1() || darLado3()==darLado1() && darLado1()!=darLado2()) {
            tipo="isoceles";
        }
       if(darLado1()!=darLado2() && darLado2()!=darLado3() && darLado3()!=darLado1()){
           tipo="escaleno";
        }
        
        
            
        return tipo; 
    }
    /**
     * Metodo que da los resultados del triangulo
     */
    @Override
    public void darResultados() {
        super.darLado1();
        super.darLado2();
        super.darLado3();
        if(isTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
            System.out.println("Tipo de triangulo: "+ darTipoTriangulo() );
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
}
