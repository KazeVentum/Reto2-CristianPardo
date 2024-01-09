
package com.mycompany.biblioteca;

/**
 *
 * @KazeVentum Cristian Camilo Pardo Hernandez
 */
public class Revista extends Recurso {
    
   private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
   
   private enum tipoDeRevista {
       
       Farandula("Tipo De Revista: Farandula"), Educacion("Tipo de Revista: Educacion"), Cientifica("Tipo de Revista: Cientifica"), 
       Chisme("Tipo de revista: Chisme"), Investigativa("Tipo de revista: Investigativa");
       
       private String nombre;
       
       private tipoDeRevista(String nombre){
           this.nombre = nombre;
       }
   }
   
   // Constructores
    public Revista() {
    }

    public Revista(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
    }
    
    // SobreEscribir ToString 
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
