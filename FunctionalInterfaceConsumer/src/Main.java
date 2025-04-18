import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        /*Consumer<Integer> numerosPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };*/
        //impplementando o consumer
        /*numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }
        });*/

        numeros.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}