//Luis Ernesto Garcia Alvares
//Jorge Antonio Toscano Lara
package com.mycompany.agenda;

import java.io.Serializable;

public class Contacto implements Serializable{
    
    private static final long serialVersionUID = -1L;
    
    private String nombre;
    private int telefono;
    private String correo;
    private String cumple;

    public Contacto(String nombre, int telefono, String correo, String cumple ){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cumple = cumple;
    }
    
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
        this.correo = " ";
        this.correo = " ";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public boolean equals(Contacto c){
        
        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){
            return true;
        }
        
        return false;
        
    }
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono + "correo=" + correo + "cumple=" + cumple;
    }
    
    
}
