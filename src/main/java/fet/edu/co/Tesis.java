package fet.edu.co;

public class Tesis extends MaterialBibloteca{
    public Tesis(String titulo,String autor,int edad ){
        super(titulo, autor, edad);
    }
 public String  obtenerInformacionDeTitulo(){
     return "El título de la tesis es: " + getTitulo();
 }
 public String obtenerInformacionDeAutor(){
     return "El autor de la tesis es: " + getAutor();
 }
 public String obtenerInformacionDeAño(){
     return "El año de publicación de la tesis es: " + getAño();}
}
