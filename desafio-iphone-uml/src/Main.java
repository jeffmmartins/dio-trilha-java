//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o Reprodutor Musical
        System.out.println("--- Reprodutor Musical ---");
        meuIphone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        // Testando o Aparelho Telefônico
        System.out.println("--- Aparelho Telefônico ---");
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        // Testando o Navegador na Internet
        System.out.println("--- Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}