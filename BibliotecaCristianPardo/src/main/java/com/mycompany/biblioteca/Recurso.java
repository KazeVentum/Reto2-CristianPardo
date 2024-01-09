
package com.mycompany.biblioteca;

/**
 *
 * @KazeVentum Cristian Camilo Pardo Hernandez
 */
public class Recurso {
    
    private int id;
    private String titulo;
    private boolean disponible;

    public Recurso() {
    }
 
    // Constructor
    
    public Recurso(int id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }
    
    //  Getters and Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    // ToString Method                    
    
    @Override
    public String toString() {
        return "Recurso{" + "id=" + id + ", titulo=" + titulo + ", disponible=" + disponible + '}';
    }

    
    
    
    
}
