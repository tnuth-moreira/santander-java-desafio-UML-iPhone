package iPhone;

import iPhone.Internet.NavegadorInternet;
import iPhone.Reprodutor.ReprodutorMusical;
import iPhone.Telefone.AparelhoTelefonico;

abstract class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  public void tocar() {
    System.out.println("Tocando música...");
  }

  public void pausar() {
    System.out.println("Música pausada");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Música selecionada: " + musica);
  }

  public void ligar(String numero) {
    System.out.println("Ligando para " + numero + "...");
  }

  public void atender() {
    System.out.println("Atendendo chamada...");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada.");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada.");
  }

}
