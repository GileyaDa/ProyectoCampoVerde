package models;

import java.util.Date;
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String rol;
    private Date fechaCreacion;

    // Constructor
    public Usuario(int idUsuario, String nombreUsuario, String contraseña, String rol, String fechaCreacion) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.fechaCreacion = new Date();
    }
}