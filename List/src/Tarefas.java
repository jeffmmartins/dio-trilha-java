public class Tarefas {
    // atribuição
    private String descricao;


    //construtor padrão
    public Tarefas(){

    }

    // construtor
    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
