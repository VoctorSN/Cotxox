package edu.badpals.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombre = "";
    private String modelo;
    private String matricula;
    private double valoracionMedia = 0;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();



    public Conductor(){}

    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public boolean isOcupado(){
        return !ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setValoracion(Byte valoracion) {
        this.valoraciones.add(valoracion);
        this.valoracionMedia = calcularValoracionMedia();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private double calcularValoracionMedia(){
        valoracionMedia = 0;
        for (byte i:valoraciones){
            valoracionMedia+=i;
        }
        valoracionMedia /= getNumeroValoraciones();
        return valoracionMedia;
    }
}
