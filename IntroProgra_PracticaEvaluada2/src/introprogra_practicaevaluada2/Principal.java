/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introprogra_practicaevaluada2;

/**
 *
 * @author andreyvargassolis
 */
import javax.swing.*;


//Clase en la que se ejecuta la lógica para mantener el main limpio
public class Principal {
    
    //Pide toda la info
    public static void calcularInventario() {
        String nombreSuper = JOptionPane.showInputDialog("Ingrese el nombre del super:");
        String codigoSuper = JOptionPane.showInputDialog("Ingrese el código del super:");
        String nombreEmpleado = JOptionPane.showInputDialog("Nombre del empleado que agregó los productos:");
        String cedulaEmpleado = JOptionPane.showInputDialog("Cédula del empleado:");
        double gananciaTotal = 0;
        
        
        int cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos productos desea ingresar?"));
        
        //calcula las dimensiones del arreglo que se llama inventario
        Producto[] inventario = new Producto[cantidadProductos];

        
        //ciclo que pide toda la info de cada producto
        for (int i = 0; i < cantidadProductos; i++) {
            String codigo = JOptionPane.showInputDialog("Producto #" + (i+1) + " - Código:");
            String nombre = JOptionPane.showInputDialog("Producto #" + (i+1) + " - Nombre:");
            String tipo = JOptionPane.showInputDialog("Producto #" + (i+1) + " - Tipo (Alimentos, Bebidas, Higiene, Limpieza):");
            double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Producto #" + (i+1) + " - Precio base:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Producto #" + (i+1) + " - Cantidad a ingresar:"));
            
            //se llama s la clase producto para asignar toda la info recolectada
            Producto producto = new Producto(codigo, nombre, tipo, precioBase, cantidad);
            
            //calcula el precio bruto
            producto.calcularPrecioBruto(); 
            inventario[i] = producto;
            
            //saca la ganancia llamando a la funcion en la clase producto
            gananciaTotal += producto.calcularGanancia();
        }
        //La info del empleado y el super se guarda aqui
        String resumen = "Super: " + nombreSuper + "\nCódigo Super: " + codigoSuper +
                         "\nEmpleado: " + nombreEmpleado + "\nCédula: " + cedulaEmpleado + "\n\nProductos:\n";

        //ciclo for que que guarda en el reumen cada inventario
        for (Producto todo : inventario) {
            resumen += todo.mostrarProducto() + "\n\n\n";
        }
        //se añade info de ganancias al resumen
        resumen += "Ganancia total esperada: ₡" + gananciaTotal;

        //impresion final
        JOptionPane.showMessageDialog(null, resumen);
    }
}
