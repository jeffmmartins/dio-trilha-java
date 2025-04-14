import java.util.Comparator;

public class ComparatorPorNome implements Comparator<Produto> {

    // é feito a comparação tipo double de dois precos;
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
