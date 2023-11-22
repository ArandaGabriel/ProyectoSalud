package com.Proyecto.ProyectoSalud.Entidades;

import com.Proyecto.ProyectoSalud.Enumeraciones.Rol;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Paciente {

    @Id
    private int dniPaciente;
    private String nombrePaciente;
    private Date fechaNacimientoPaciente;
    private ArrayList<String> historialClinica;  
    private String obraSocial;
    private int telContacto;
    private String intencionConsulta;
    
    @OneToMany
    private Profesional profesional;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Paciente() {
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Date getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(Date fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public ArrayList<String> getHistorialClinica() {
        return historialClinica;
    }

    public void setHistorialClinica(ArrayList<String> historialClinica) {
        this.historialClinica = historialClinica;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(int telContacto) {
        this.telContacto = telContacto;
    }

    public String getIntencionConsulta() {
        return intencionConsulta;
    }

    public void setIntencionConsulta(String intencionConsulta) {
        this.intencionConsulta = intencionConsulta;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Paciente(int dniPaciente, String nombrePaciente, Date fechaNacimientoPaciente, ArrayList<String> historialClinica, String obraSocial, int telContacto, String intencionConsulta, Profesional profesional, Rol rol) {
        this.dniPaciente = dniPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
        this.historialClinica = historialClinica;
        this.obraSocial = obraSocial;
        this.telContacto = telContacto;
        this.intencionConsulta = intencionConsulta;
        this.profesional = profesional;
        this.rol = rol;
    }

    
}
