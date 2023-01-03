import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class DesafioDado {

    public static void main(String[] args) {

        Random gerador = new Random();
        Map<Integer, Integer> resultadoDado = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            int numDado = gerador.nextInt(6) + 1;
            if(resultadoDado.containsKey(numDado)){
                Integer qnt = resultadoDado.get(numDado);
                resultadoDado.put(numDado, qnt+1);
            } else {
                resultadoDado.put(numDado, 1);
            }
        }
        System.out.println(resultadoDado);

    }

}
