package models;

import java.util.Date;

public class Movimiento {
    private int idMovimiento;
    private Date fechaMovimiento;
    private String tipo;
    private int idProducto;
    private int cantidadMovimiento;
    private int idEmpleado;

    public Movimiento(int idMovimiento, Date fechaMovimiento, String tipo, int idProducto, int cantidadMovimiento, int idEmpleado) {
        this.idMovimiento = idMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.tipo = tipo;
        this.idProducto = idProducto;
        this.cantidadMovimiento = cantidadMovimiento;
        this.idEmpleado = idEmpleado;
    }
}