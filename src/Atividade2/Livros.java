package Atividade2;

public class Livros {
    public static void main(String[] args) {
        Biblioteca livro1 = new Biblioteca("Clarice lispector", "Romance", 3636, "Amor a primeira vista");

        Biblioteca livro2 = new Biblioteca("Clarice", "Romance" , 222, "Felicidade Clandestina");
        Biblioteca livro3 = new Biblioteca("Ben carson", "Superacao" , 0101, "Sonhe alto");

        System.out.println( livro1.getAutor() + livro1.getNome() + livro1.getGenero()+ livro1.getIsbn());
        System.out.println( livro2.getAutor() + livro2.getNome() + livro2.getGenero()+ livro2.getIsbn());
        System.out.println( livro3.getAutor() + livro3.getNome() + livro3.getGenero()+ livro3.getIsbn());


        // nao consegui entender porque nao ta aparecendo o codigo isbn, e tambem a palvra null.
    }
}
