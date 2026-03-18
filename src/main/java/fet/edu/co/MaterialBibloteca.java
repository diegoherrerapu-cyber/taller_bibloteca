package fet.edu.co;

public class MaterialBibloteca {
    private String titulo;
    private String autor;
     private int año;

    public MaterialBibloteca(String titulo, String autor, int año) {
        this.titulo=titulo;
        this.autor=autor;
        this.año=año;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int Año) {
        this.año = año;
    }
public String obtenerInformacionDetitulo(){return "el titulo es "; }
public String obtenerInformacionDeautor() { return "el autor es";}
public String obtenerInformacionDeaño(){return"el año es";}

}
