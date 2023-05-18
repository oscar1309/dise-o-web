class Libro {
    private String autor;
    private String titulo;
    private int paginas;

    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println("El libro " + titulo + ", del autor " + autor + ", tiene " + paginas + " páginas.");
    }

    public static void compararLibros(Libro libro1, Libro libro2) {
        if (libro1.paginas > libro2.paginas) {
            System.out.println("El libro con más páginas es: " + libro1.titulo);
        } else if (libro1.paginas < libro2.paginas) {
            System.out.println("El libro con más páginas es: " + libro2.titulo);
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}