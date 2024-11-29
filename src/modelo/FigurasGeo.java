/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public abstract class FigurasGeo {
    
    private String nombre;
    private double area;
    private double perimetro;
    private double PI;
    
    
    
    public FigurasGeo(){
    
 }   

    public FigurasGeo(String nombre, double area, double perimetro, double PI) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
        this.PI = PI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPI() {
        return PI;
    }

 
    @Override
    public String toString() {
        return "FigurasGeo{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

   // METODOS abtractos
    
    
    abstract double calcularArea();
    abstract double calcularP();

    
}
