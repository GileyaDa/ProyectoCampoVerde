package models;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private String descripcion;
    private String categoria;
    private double precio;
    private int cantidadStock;

    public Producto(int idProducto, String nombreProducto, String descripcion, String categoria, double precio, int cantidadStock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
}
