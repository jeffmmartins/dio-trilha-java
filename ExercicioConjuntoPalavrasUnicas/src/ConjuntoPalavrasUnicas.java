import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributos
    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }


    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavrasUnicasSet.isEmpty()) { //
            if (conjuntoPalavrasUnicasSet.contains(palavra)) {
                conjuntoPalavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        }
        else {
                System.out.println("Conjunto vazio");
            }
        }

    public boolean verificarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavrasUnicasSet.isEmpty()){
            System.out.println();
        }else {
            System.out.println("Conjunto está vazio");
        }
    }
}


