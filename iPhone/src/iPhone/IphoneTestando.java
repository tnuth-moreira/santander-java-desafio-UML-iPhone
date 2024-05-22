package iPhone;

public class IphoneTestando {
    public static void main(String[] args) throws Exception {
        iPhone meuIPhone = new iPhoneCorreto();

        // Testando ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Minha Música Favorita");

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123-4567");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("http://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
