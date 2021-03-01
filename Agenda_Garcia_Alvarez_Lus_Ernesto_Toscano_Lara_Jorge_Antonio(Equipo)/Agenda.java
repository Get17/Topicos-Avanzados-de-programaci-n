//Luis Ernesto Garcia Alvares
//Jorge Antonio Toscano Lara
package com.mycompany.agenda;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Agenda {

    //Atributos
    private Contacto[] contactos;

    //Constructores
    public Agenda() {
        this.contactos = new Contacto[10]; //por defecto
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio]; //tamaño que nosotros queramos
    }

    //Metodos
    /**
     * Añade un contacto a la agenda
     */
    public void aniadirContacto(Contacto c) {

        if (existeContacto(c)) { //Indico si existe el contacto
            JOptionPane.showMessageDialog(null,"El contacto con ese nombre ya existe");
        } else if (agendaLlena()) { //Indico si la agenda esta o no llena
            JOptionPane.showMessageDialog(null,"La agenda esta llena, no se pueden meter mas contactos");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) { //controlo los nulos
                    contactos[i] = c; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null,"Se ha añadido");
            } else {
                JOptionPane.showMessageDialog(null,"No se ha podido añadir");
            }
        }

    }

    /**
     * Indica si existe un contacto
     */
    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            //Controlo nulos e indico si el contacto es el mismo
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;

    }

    public Contacto[] getContactos() {
        return contactos;
    }
    
    /**
     * Busca un contacto por su nombre
     */
    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el contacto buscado (forma mas engorrosa)
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                JOptionPane.showMessageDialog(null,"Nombre: " + contactos[i].getNombre() + "Su telefono es: " + contactos[i].getTelefono() + "\nSu correo es: " + contactos[i].getCorreo() + "\nSu cumple es " + contactos[i].getCumple()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null,"No se ha encontrado el contacto");
        }

    }

    /**
     * Indica si la agenda esta llena o no
     */
    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) { //Controlo nulos
                return false; //indico que no esta llena
            }
        }

        return true; //esta llena

    }

    /**
     * Elimina el contacto de la agenda
     */
    public void eliminarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null,"Se ha eliminado el contacto");
        } else {
            JOptionPane.showMessageDialog(null,"No se ha eliminado el contacto");

        }

    }
    
    public void editarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }
    }
    
    public void aEditar(Contacto c) {

        if (existeContacto(c)) { //Indico si existe el contacto
            JOptionPane.showMessageDialog(null,"El contacto con ese nombre ya existe");
        } else if (agendaLlena()) { //Indico si la agenda esta o no llena
            JOptionPane.showMessageDialog(null,"La agenda esta llena, no se pueden meter mas contactos");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) { //controlo los nulos
                    contactos[i] = c; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(null,"Se ha Editado");
            } else {
                JOptionPane.showMessageDialog(null,"No se ha podido Editar");
            }
        }

    }
}
