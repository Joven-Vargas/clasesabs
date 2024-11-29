/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Cuadrado  extends FigurasGeo {

    private double lado ;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }


  
    
    public Cuadrado(String nombre, double area, double perimetro, double PI) {
        super(nombre, area, perimetro, PI);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    
    
    
    @Override
    public String toString() {
        return "FigurasGeo{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + "lado:"+lado+'}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    double calcularArea() {
return getLado()*getArea();
        }

    @Override
    double calcularP() {
      return 4*getArea();
    }
    
    
    
    
}
