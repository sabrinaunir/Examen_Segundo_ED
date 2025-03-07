package biblioteca;

public class Libro {

    /**
     * Representa un libro en la biblioteca, con información sobre su título, autor y año de publicación.
     *
     * @author Sabrina Aigbogun Mouataz
     * @version 07.03.2025
     */

        private String titulo;
    private String autor;
    private int anioPublicacion;


        /**
         * Constructor quw crea un nuevo libro con un título, un autor y un año de publicación.
         *
         * @param titulo El título del libro.
         * @param autor El autor del libro.
         * @param anioPublicacion El año en que se publicó el libro.
         */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
        /**
         * Obtiene el título del libro.
         *
         * @return El título del libro.
         */
    public String getTitulo() {
        return titulo;
    }

        /**
         * Establece el título del libro.
         *
         * @param titulo El nuevo título del libro.
         */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

        /**
         * Obtiene el autor del libro.
         *
         * @return El autor del libro.
         */
    public String getAutor() {
        return autor;
    }

        /**
         * Establece el autor del libro.
         *
         * @param autor El nuevo autor del libro.
         */
    public void setAutor(String autor) {
        this.autor = autor;
    }

        /**
         * Obtiene el año de publicación del libro.
         *
         * @return El año de publicación del libro.
         */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

        /**
         * Establece el año de publicación del libro.
         *
         * @param anioPublicacion El nuevo año de publicación del libro.
         */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
