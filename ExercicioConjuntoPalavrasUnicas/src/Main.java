//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto

        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        /*
        // Removendo uma linguagem inexistente
        conjuntoPalavrasUnicas.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();*/
    }
}