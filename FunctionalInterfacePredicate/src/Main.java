import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "javascript", "python", "php", "go");

        /*Predicate<String> maisDeCincoCaracteres = p -> p.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(p1 -> System.out.println(p1));
        */
        //outra forma
        palavras.stream()
                .filter(palavra -> palavra.length() >5)
                .forEach(System.out::println);
    }
}