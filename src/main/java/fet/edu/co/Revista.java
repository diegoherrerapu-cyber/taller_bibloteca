package fet.edu.co;

public class Revista extends MaterialBibloteca {
    public Revista( String titulo,String autor,int año){ super(titulo, autor, año);
    }
public  String obtenerInformacionDeTitulo(){
    return "La Revista se titula:" + getTitulo();}

    public  String obtenerInformacionDeAutor(){
    return "El autor de la Revista es:" + getAutor();}

    public String obtenerInformacionDeAño(){
    return "El año de publicación de la Revista es:" + getAño();}
}
