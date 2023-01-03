import java.util.*;

public class ExemplosMap {
    public static void main(String[] args) {
        //crie um dicionario e relacione os estados e suas populaçoes
        Map<String, Integer> estados = new HashMap<>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);

        System.out.println(estados);

        //substitua a pop do estado de Rn por 3534165
        estados.put("RN", 3534165);
        System.out.println(estados);

        //confira se o estado PB está no dicionario, se não estiver, adicione PB 4.039.277
        System.out.println(estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println(estados);

        //exiba a população do PE
        System.out.println(estados.get("PE"));

        //exiba os estados
        Set<String> ufs = estados.keySet();
        System.out.println(ufs);

        //exiba as populaçoes
        Collection<Integer> pop = estados.values();
        System.out.println(pop);

        //exiba todos os estados e suas populações na ordem que foi add
        Map<String, Integer> estados1 = new LinkedHashMap<>();
        estados1.put("PE", 9616621);
        estados1.put("AL", 3351543);
        estados1.put("CE", 9187103);
        estados1.put("RN", 3534265);
        estados1.put("PB", 4039277);
        System.out.println(estados1);

        //exiba os estaros e suas populaçoes em ordem alfabetica
        Map<String, Integer> estados2 = new TreeMap<>(estados1);
        System.out.println(estados2);

        //exiba o estado com a menor pop e sua quantidade

        Integer menorPop = Collections.min(estados2.values());
        Set<Map.Entry<String, Integer>> entries = estados2.entrySet();
        String estadoMenorPop = "";

        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue().equals(menorPop)){
                estadoMenorPop = entry.getKey();
            }
        }
        System.out.println(estadoMenorPop + " - " + menorPop);

        //exiba o estado com a maior pop e sua quantidade

        Integer maiorPop = Collections.max(estados2.values());
        String estadoMaiorPop = "";

        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue().equals(maiorPop)){
                estadoMaiorPop = entry.getKey();
            }
        }
        System.out.println(estadoMaiorPop + " - " + maiorPop);

        //exiba a soma da população desses estados
        Iterator<Integer> iterator = estados2.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            int next = iterator.next();
            soma += next;
        }
        System.out.println("soma das populações " + soma);

        //exiba a media da população dos estados
        Integer media = soma/estados2.size();
        System.out.println("média " + media);

        //Remova os estados com a população menor que a media
        Iterator<Integer> iterator1 = estados2.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < media){
                iterator1.remove();
            }
        }
        System.out.println(estados2);

        //apague o dicionario de estados
        estados2.clear();


        //COnfira se o dicionário está vazio
        System.out.println(estados2.isEmpty());

    }
}
