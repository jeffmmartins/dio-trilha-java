package FuncTionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class suplier {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Seja bem vindo";

        //Usar o supplier para obter a lista
        List<String> listaSaudações = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        List<String> listasaudacoes1 =  Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Seja bem vindo";
            }
        }).limit(5).collect(Collectors.toList());


        List<String> listasaudacoes2 =  Stream.generate(() -> "Seja bem vindo"
        ).limit(5).collect(Collectors.toList());


        listaSaudações.forEach(System.out::println);
    }
}
