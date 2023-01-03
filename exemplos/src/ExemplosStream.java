
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import static com.sun.javafx.util.Utils.sum;


public class ExemplosStream {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5", "15","45");
        // imprima todos os elementos dessa lista de string
        numerosAleatorios.forEach(System.out::println);

        //pegue os 5 primeiros numeros e coloque dentro de um set.
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        //transforme essa lista de string em lista de inteiros.
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //pegue os numeros pares e maiores que 2 em uma lista.

        List<Integer> paresEMaiorQ2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i>2 && i%2==0)
                .collect(Collectors.toList());
        System.out.println(paresEMaiorQ2);

        //mostra a media dos numeros
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        //Remove os valores impares
        collectList.removeIf(i -> i%2 != 0);

        System.out.println(collectList);

        //ignorar os 3 primeiros elementos da lista e imprimir o restante
        System.out.println(numerosAleatorios);
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        //retirando os numeros repetidos da lista, quantos ficam.
        Set<String> setSemRepeticao = numerosAleatorios.stream()
                .collect(Collectors.toSet());
        System.out.println(numerosAleatorios);
        System.out.println(setSemRepeticao.size());

        //mostre o menor numero da lista
        Integer menor = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .min(Integer::compare).get();
        System.out.println(menor);


        //mostre o maior numero da lista
        Integer maior = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .max(Integer::compare).get();
        System.out.println(maior);

        //pegue apenas os impares e some
        Integer somaImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i%2 != 0)
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(somaImpares);

        //mostra a lista na ordem numerica
        List<Integer> numerosNaOrdem = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numerosNaOrdem);

        //agrupe os valores impares multiplos de 3 e de 5
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(i-> (i % 2!=0) && i%5==0 && i%3 ==0))
                .get(true)
                .forEach(System.out::println);


    }

}
