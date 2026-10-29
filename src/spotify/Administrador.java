package spotify;

public class Administrador extends Usuario {

    public Administrador(int id, String nome) {
        super(id, nome);
    }

    public void cadastrarMusica(SistemaSpotify sistema, Musica musica) {
        sistema.adicionarMusica(musica);
    }

    @Override
    public String getTipo() {
        return "Administrador";
    }
}