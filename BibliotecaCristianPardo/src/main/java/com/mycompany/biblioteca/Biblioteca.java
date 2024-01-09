
package com.mycompany.biblioteca;


import java.util.List;
import java.util.ArrayList;

/**
 *
 * @KazeVentum Cristian Camilo Pardo Hernandez 
 */
public class Biblioteca implements BibliotecaMethods {

    public class ListaRecursos{
        private List<Object> ListaRecursos;

        public ListaRecursos() {
            ListaRecursos = new ArrayList<>();
        }
        
        public void agregarRecurso(Recurso recurso) {
        ListaRecursos.add(recurso);
    }

    }
    
    @Override
    public void prestarRecursos(int id) {
        
    }

    @Override
    public void buscarRecursoPorTitulo(String titulo) {
        
    }
    
}
