package spotify;

import java.util.ArrayList;
import java.util.List;

public class SistemaSpotify {
    private List<Musica> catalogo;
    private List<Usuario> usuarios;

    public SistemaSpotify() {
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        catalogo.add(musica);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Musica buscarMusica(int id) {
        for (Musica musica : catalogo) {
            if (musica.getId() == id) {
                return musica;
            }
        }

        return null;
    }

    public void listarCatalogo() {
        for (Musica musica : catalogo) {
            System.out.println(musica);
        }
    }
}