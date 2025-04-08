//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

            ordenacaoPessoa.adicionarPessoa("Nome 1",36,1.79);
            ordenacaoPessoa.adicionarPessoa("Nome 2",30,1.80);
            ordenacaoPessoa.adicionarPessoa("Nome 3",35,1.70);
            ordenacaoPessoa.adicionarPessoa("Nome 4",17,1.65);

            System.out.println(ordenacaoPessoa.ordenarPorIdade());
            System.out.println(ordenacaoPessoa.ordenarPorAltura());
        }
    }
