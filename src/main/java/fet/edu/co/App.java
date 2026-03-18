package fet.edu.co;

public class App {
  public static void main(String[] args) {
    Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
    Revista revista = new Revista("National Geographic", "Varios autores", 2021);
    Tesis tesis = new Tesis("La Inteligencia Artificial en la Educación", "Juan Pérez", 2023);

    System.out.println(libro.obtenerInformacionDeTitulo());
    System.out.println(libro.obtenerInformacionDeAutor());
    System.out.println(libro.obtenerInforamcionDe());

    System.out.println(revista.obtenerInformacionDeTitulo());
    System.out.println(revista.obtenerInformacionDeAutor());
    System.out.println(revista.obtenerInformacionDeAño());

    System.out.println(tesis.obtenerInformacionDeTitulo());
    System.out.println(tesis.obtenerInformacionDeAutor());
    System.out.println(tesis.obtenerInformacionDeAño());
  }
}
