package spotify;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SistemaSpotify sistema = new SistemaSpotify();

        sistema.adicionarMusica(new Musica(1, "Blinding Lights", "The Weeknd", 3.20));
        sistema.adicionarMusica(new Musica(2, "As It Was", "Harry Styles", 2.47));
        sistema.adicionarMusica(new Musica(3, "Perfect", "Ed Sheeran", 4.23));

        UsuarioComum usuario = new UsuarioComum(1, "Ana");
        Administrador administrador = new Administrador(2, "Carlos");

        sistema.adicionarUsuario(usuario);
        sistema.adicionarUsuario(administrador);

        int opcao;

        do {
            System.out.println("\n===== SPOTIFY =====");
            System.out.println("1 - Listar músicas");
            System.out.println("2 - Criar playlist");
            System.out.println("3 - Adicionar música à playlist");
            System.out.println("4 - Listar playlists");
            System.out.println("5 - Cadastrar nova música");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    sistema.listarCatalogo();
                    break;

                case 2:
                    System.out.print("Nome da playlist: ");
                    String nomePlaylist = scanner.nextLine();
                    usuario.criarPlaylist(nomePlaylist);
                    System.out.println("Playlist criada.");
                    break;

                case 3:
                    System.out.print("Nome da playlist: ");
                    String nome = scanner.nextLine();

                    Playlist playlist = usuario.buscarPlaylist(nome);

                    if (playlist == null) {
                        System.out.println("Playlist não encontrada.");
                        break;
                    }

                    sistema.listarCatalogo();
                    System.out.print("ID da música: ");
                    int idMusica = Integer.parseInt(scanner.nextLine());

                    Musica musica = sistema.buscarMusica(idMusica);

                    if (musica == null) {
                        System.out.println("Música não encontrada.");
                    } else {
                        playlist.adicionarMusica(musica);
                        System.out.println("Música adicionada.");
                    }
                    break;

                case 4:
                    usuario.listarPlaylists();
                    break;

                case 5:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Duração: ");
                    double duracao = Double.parseDouble(
                            scanner.nextLine().replace(",", ".")
                    );

                    administrador.cadastrarMusica(
                            sistema,
                            new Musica(id, titulo, artista, duracao)
                    );

                    System.out.println("Música cadastrada.");
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}