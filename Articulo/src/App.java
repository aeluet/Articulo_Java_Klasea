
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Author autorea = new Author("Oxel");
        LocalDate gaur = LocalDate.now();
        Articulo a1 = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(a1.toString());
        Articulo a2 = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(a2.toString());
        Articulo aitzol = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(aitzol.toString());
        Articulo Oxel = new Articulo(autorea, Categoria.BACKEND, gaur, "Lehenengo Java Artikulua");
        System.out.println(Oxel.toString());
    }
    }