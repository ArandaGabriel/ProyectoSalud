package com.Proyecto.ProyectoSalud.Entidades;

import com.Proyecto.ProyectoSalud.Enumeraciones.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Profesional {

    @Id
    private String matriculaProfesional;
    private String nombreProfesional;
    private int edadProfesional;
    private String especialidadProfesional;
    private Integer puntuacionProfesional;
    private double precioConsulta;
    
    private LocalDate fechaTurno;
    private LocalTime horarioTurno;
    private Boolean estadoTurno;
    
    @OneToMany
    private Paciente paciente;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Profesional() {
    }

    public Profesional(String matriculaProfesional, String nombreProfesional, int edadProfesional, String especialidadProfesional, Integer puntuacionProfesional, double precioConsulta, LocalDate fechaTurno, LocalTime horarioTurno, Boolean estadoTurno, Paciente paciente, Rol rol) {
        this.matriculaProfesional = matriculaProfesional;
        this.nombreProfesional = nombreProfesional;
        this.edadProfesional = edadProfesional;
        this.especialidadProfesional = especialidadProfesional;
        this.puntuacionProfesional = puntuacionProfesional;
        this.precioConsulta = precioConsulta;
        this.fechaTurno = fechaTurno;
        this.horarioTurno = horarioTurno;
        this.estadoTurno = estadoTurno;
        this.paciente = paciente;
        this.rol = rol;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

    public int getEdadProfesional() {
        return edadProfesional;
    }

    public void setEdadProfesional(int edadProfesional) {
        this.edadProfesional = edadProfesional;
    }

    public String getEspecialidadProfesional() {
        return especialidadProfesional;
    }

    public void setEspecialidadProfesional(String especialidadProfesional) {
        this.especialidadProfesional = especialidadProfesional;
    }

    public Integer getPuntuacionProfesional() {
        return puntuacionProfesional;
    }

    public void setPuntuacionProfesional(Integer puntuacionProfesional) {
        this.puntuacionProfesional = puntuacionProfesional;
    }

    public double getPrecioConsulta() {
        return precioConsulta;
    }

    public void setPrecioConsulta(double precioConsulta) {
        this.precioConsulta = precioConsulta;
    }

    public LocalDate getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDate fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public LocalTime getHorarioTurno() {
        return horarioTurno;
    }

    public void setHorarioTurno(LocalTime horarioTurno) {
        this.horarioTurno = horarioTurno;
    }

    public Boolean getEstadoTurno() {
        return estadoTurno;
    }

    public void setEstadoTurno(Boolean estadoTurno) {
        this.estadoTurno = estadoTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
}
