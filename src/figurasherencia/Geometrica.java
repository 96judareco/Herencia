/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

import java.util.Scanner;

/**
 *@verion 1.0.0
 * @author JUAN DAVID REYES CORTES
 */
public class Geometrica extends Coordenada {
     private Scanner teclado;
    
    /**
     * Constructor de la clase
     */
    public Geometrica() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    
    /**
     * Metodo que da la bienvenida al programa
     */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
      
    }
    
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() {        
        while(true) {
            System.out.println("1. Triangulo ");
            System.out.println("2.Circulo  ");
            System.out.println("3.Cuadrado ");
            System.out.println("4.Salir");
            byte opcion =  teclado.nextByte();
            if(opcion == 1) {
                inicicarTriangulo();
            } else if(opcion == 2) {
                iniciarCirculo();
            } else if(opcion == 3) {
                 CuadradoRectangulo();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
    
    /**
     * Metodo que toma las cordenadas del triangulo y llama al objeto para las operaciones
     */
    private void inicicarTriangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        Coordenada coordenada =new Coordenada(punto1,punto2,punto3);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();
    }
    private void iniciarCirculo(){
       
        double x,y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        Coordenada coordenada =new Coordenada(punto1,punto2,punto3);
        Circunferencia circunferencia=new Circunferencia(punto1,punto2,punto3);
        circunferencia.darResultados();
    
    }
    private void CuadradoRectangulo(){
        double x,y;  
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("Digite lado x4");
        x = teclado.nextDouble();
        System.out.println("Digite lado y4");
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x, y);
        Coordenada coordenada =new Coordenada(punto1,punto2,punto3);
        Cuadrado cuadrado=new Cuadrado(punto1, punto2, punto3);
        cuadrado.darResultados();
        
    }
}
