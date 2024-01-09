
package com.mycompany.biblioteca;

/**
 *
 * @KazeVentum Cristian Camilo Pardo Hernandez
 */
public class Libro extends Recurso {
    
    private String autor;
    
    // Constructor
    
    public Libro() {
    }
    
    public Libro(String autor) {
        this.autor = autor;
    }
    
    //  Getters and Setters
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
