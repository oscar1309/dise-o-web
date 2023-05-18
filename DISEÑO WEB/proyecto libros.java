public class ProyectoLibros {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Gabriel Garcia Marquez", "Cien años de soledad", 482);
        Libro libro2 = new Libro("J.R.R. Tolkien", "El Señor de los Anillos", 1178);

        libro1.mostrarLibro();
        libro2.mostrarLibro();
        Libro.compararLibros(libro1, libro2);
    }
}