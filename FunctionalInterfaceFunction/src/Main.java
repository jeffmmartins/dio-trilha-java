import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar Function com exppressão lambda para dobrar todos os números
        Function<Integer,Integer> dobrar = numero -> numero * 2;

        //Usar função para dobrar todos os numeros no Stream e armazenar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        numerosDobrados.forEach(System.out::println);
    }
}