package spotify;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private int id;
    private String nome;
    private List<Playlist> playlists;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.playlists = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Playlist criarPlaylist(String nome) {
        Playlist playlist = new Playlist(nome);
        playlists.add(playlist);
        return playlist;
    }

    public Playlist buscarPlaylist(String nome) {
        for (Playlist playlist : playlists) {
            if (playlist.getNome().equalsIgnoreCase(nome)) {
                return playlist;
            }
        }

        return null;
    }

    public void listarPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("Nenhuma playlist cadastrada.");
            return;
        }

        for (Playlist playlist : playlists) {
            System.out.println("\nPlaylist: " + playlist.getNome());
            playlist.listarMusicas();
        }
    }

    public abstract String getTipo();
}