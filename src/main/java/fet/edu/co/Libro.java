package fet.edu.co;

public class Libro extends MaterialBibloteca{
    public Libro(String titulo, String autor, int año) {
        super(titulo, autor, año);
    }

    public String obtenerInformacionDeTitulo(){
        return "El título del libro es: " + getTitulo();
    }
    public String obtenerInformacionDeAutor(){
        return "El autor del libro es: " + getAutor();
    }
    public String obtenerInforamcionDe(){
        return "El año de publicación del libro es: " + getAño();}
}
