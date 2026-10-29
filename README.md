# ProjetoSpotify

Projeto em Java que simula algumas funcionalidades básicas de um aplicativo de músicas, com catálogo, usuários e playlists.

## Funcionalidades

- Listar músicas do catálogo
- Criar e listar playlists
- Adicionar músicas a playlists
- Cadastrar músicas usando um usuário administrador

## Estrutura

- `src/spotify/Main.java`: ponto de entrada e menu de interação
- `src/spotify/SistemaSpotify.java`: catálogo de músicas e usuários
- `src/spotify/Musica.java`: modelo de música
- `src/spotify/Usuario.java`: classe abstrata de usuário e gerenciamento de playlists
- `src/spotify/UsuarioComum.java`: usuário comum
- `src/spotify/Administrador.java`: cadastro de músicas
- `src/spotify/Playlist.java`: gerenciamento das músicas de uma playlist
- `diagrama.drawio`, `diagrama.puml` e `diagrama.svg`: diagramas do projeto

## Como executar

É necessário ter o JDK instalado. A partir da pasta raiz do projeto, compile os arquivos Java e execute a classe `spotify.Main`:

```bash
javac -d out src/spotify/*.java
java -cp out spotify.Main
```
