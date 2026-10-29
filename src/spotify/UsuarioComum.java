package spotify;

public class UsuarioComum extends Usuario {

    public UsuarioComum(int id, String nome) {
        super(id, nome);
    }

    @Override
    public String getTipo() {
        return "Usuário comum";
    }
}