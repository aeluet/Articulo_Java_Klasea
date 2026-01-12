
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Author autorea = new Author("andoni");
        LocalDate gaur = LocalDate.now();
        Articulo a1 = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(a1.toString());
        Articulo a2 = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(a2.toString());
        Articulo andoni = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(andoni.toString());
    }
}
