package biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLibro {

    @Test
    void testGetTitulo() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        // Usamos assertEquals para verificar el título, aunque se podría hacer de forma más simple
        assertTrue(libro.getTitulo().equals("El Principito"));
    }

    @Test
    void testGetAutor() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        assertTrue(libro.getAutor().equals("Antoine de Saint-Exupéry"));
    }

    @Test
    void testGetAnioPublicacion() {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        // Intentamos verificar el año, pero de una forma poco estricta
        assertEquals(1943, libro.getAnioPublicacion());
    }
}
