package Atividade2;

public class Biblioteca {
    protected String autor;
    protected String genero;
    protected int isbn;
    protected String nome;

    public Biblioteca(String autor, String nomeDoLivro, int isbn, String nome) {
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void registroLivro (String nome){
        System.out.println(" o nome do livro é "+ nome);
    }
    public void registroLivro(String nome, int isbn){
        System.out.println(" O IBSM do livro é "+ nome + isbn);
    }
    public void registroLivro(String nome, int isbn, String nomeDoLivro ){
        System.out.println(" O livro foi registrado com o ISBN : " + nome);

    }
    public void registroLivro(String nome, int isbn, String auor,String nomeDoLivro){
        System.out.println("o nome do livro e " + nomeDoLivro);

    }
}
