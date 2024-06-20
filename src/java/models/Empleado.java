package models;

public class Empleado {
    private int idEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private int idUsuario;

    public Empleado(int idEmpleado, String nombresEmpleado, String apellidosEmpleado, String fechaNacimiento, String direccion, String telefono, String correoElectronico, int idUsuario) {
        this.idEmpleado = idEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idUsuario = idUsuario;
    }
}