
![Uploading Untitled diagram-2024-05-22-163149.png…](file:///Users/thiagomoreira/Downloads/Untitled%20diagram-2024-05-22-163114.svg)


classDiagram
iPhone <|-- ReprodutorMusical
iPhone <|-- AparelhoTelefonico
iPhone <|-- NavegadorInternet

    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
