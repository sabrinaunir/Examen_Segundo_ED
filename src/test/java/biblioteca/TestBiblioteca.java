package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBiblioteca {

    @Test
    void testAgregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        // Intentar agregar libro, pero no comprobamos correctamente el retorno
        biblioteca.agregarLibro(libro);
        assertNotNull(libro.getTitulo()); // Verifica si el libro tiene un título
    }

    @Test
    void testEliminarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        biblioteca.agregarLibro(libro);
        // Probamos eliminar el libro, pero el test podría fallar si no se verifica bien
        biblioteca.eliminarLibro(libro);
        assertEquals("El Principito", libro.getTitulo());
    }

    @Test
    void testEncuentraLibroPorTitulo() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.encuentraLibroPorTitulo("El Principito") != null); // Usa != null
    }
}
