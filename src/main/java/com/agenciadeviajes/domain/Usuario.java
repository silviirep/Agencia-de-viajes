package com.agenciadeviajes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; //transforma en id_cliente
    String nombre;
    String apellidos;
    String nombreUsuario;
    String correo;
    String telefono;
    String fechaNacimiento;
    String contrasena;
    Boolean privilegios;
    

    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva")
    @ManyToOne
    
    private Reserva reserva;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String apellidos, String nombreUsuario, String correo, String telefono, String fechaNacimiento, String contrasena, Boolean privilegios, Reserva reserva) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
        this.privilegios = privilegios;
        this.reserva = reserva;
    }
 
}
