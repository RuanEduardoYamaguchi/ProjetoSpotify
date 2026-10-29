package spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("Playlist vazia.");
            return;
        }

        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }
}