package application;

import java.time.LocalDate;

public class PacienteRepresentation {
    private Integer id;
    private String nombre;
    private String apellido;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String self;

    public PacienteRepresentation(Integer id, String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String self) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.self = self;
    }

    public Integer getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getSelf() { return self; }

    public void setId(Integer id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setSelf(String self) { this.self = self; }
}
