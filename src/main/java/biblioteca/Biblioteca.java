package biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa una biblioteca que contiene libros.
 *
 * @author Sabrina Aigbogun Mouataz
 * @version 07.03.2025
 */
public class Biblioteca {

    /**
     * Lista de libros almacenados en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor que crea una biblioteca vacía sin libros iniciales.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que crea una biblioteca con una lista inicial de libros.
     *
     * @param libros Lista de libros a agregar inicialmente a la biblioteca.
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros almacenados en la biblioteca.
     *
     * @return Lista de libros en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o null si no existe en la biblioteca.
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca un libro en la biblioteca por el autor.
     *
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado con ese autor, o null si no existe.
     *
     * @deprecated Este método está obsoleto. Usar {@link #encuentraLibrosPorAutor(String)} en su lugar.
     */
    @Deprecated
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros en la biblioteca escritos por un autor.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista de libros escritos por el autor, o null si no hay coincidencias.
     * @since 2.0
     */
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}

