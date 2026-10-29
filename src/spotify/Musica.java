package spotify;

public class Musica {
    private int id;
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(int id, String titulo, String artista, double duracao) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " | " + artista + " (" + duracao + " min)";
    }
}