import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> arcoIris = new TreeSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        //exiba todas as cores do arco iris uma abaixo da outra.
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        //quantidade de cores
        System.out.println(arcoIris.size());
        //exiba as cores em ordem alfabetica.
        System.out.println(arcoIris);

        Set<String> arcoIris2 = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        //ordem de inserção
        System.out.println(arcoIris2);
        //ordem reversa
        List<String> arcoIris3 = new ArrayList<>(arcoIris2);
        Collections.reverse(arcoIris3);
        System.out.println(arcoIris3);
        //exibe cores que começam com a letra V
        Iterator<String> iterator = arcoIris.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            char primeiraLetra = next.charAt(0);
            if (primeiraLetra != 'v'){
                iterator.remove();
            }
        }
        System.out.println(arcoIris);
        arcoIris.clear();
        System.out.println(arcoIris.isEmpty());
    }
}