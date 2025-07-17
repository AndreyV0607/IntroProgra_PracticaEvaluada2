/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introprogra_practicaevaluada2;

/**
 *
 * @author andreyvargassolis
 */

//clase del objeto producto
public class Producto {
    
    
    //atributos
    private String codigoProducto;
    private String nombreProducto;
    private String tipoProducto;
    private double precioBase;
    private double precioBruto;
    private int cantidad;
    
    
    //constructor
    public Producto(String codigoProducto, String nombreProducto, String tipoProducto, double precioBase, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.precioBruto = calcularPrecioBruto();
    }

    //funcion para calcular precio bruto
    public double calcularPrecioBruto() {
        switch (tipoProducto.toLowerCase()) {
            case "alimentos":
                return precioBase * 0.20 + precioBase;
            case "bebidas":
                return precioBase * 0.30 + precioBase;
            case "higiene":
                return precioBase * 0.25 + precioBase + 500;
            case "limpieza":
                return precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
            default:
                return precioBase;
        }
    }

    
    //funcion que calcula ganacia
    public double calcularGanancia() {
        return (precioBruto - precioBase) * cantidad;
    }

        // aqui solo se junta toda la info del producto para en la lógica principal poder imprimirla
    public String mostrarProducto() {
        return "Código: " + codigoProducto + "\nNombre: " + nombreProducto + "\nTipo: " + tipoProducto +
                "\nCantidad: " + cantidad + "\nPrecio Base: ₡" + precioBase +
                "\nPrecio Bruto: ₡" + precioBruto + "\nGanancia Esperada: ₡" + calcularGanancia() + "\n";
    }
}
    
    


    
            
    

    
    
    
    

