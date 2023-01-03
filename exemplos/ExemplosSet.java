import java.util.*;

public class ExemplosSet {
    public static void main(String[] args) {
        //criando conjunto
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 4d, 4.3));
        System.out.println(notas.toString()); //fica em ordem aleatória e não aceita valores repetidos.
        notas.contains(7d);
        Collections.min(notas);
        Collections.max(notas);

      Iterator<Double> iterator = notas.iterator();
      Double soma = 0.0;
      while (iterator.hasNext()){
          Double next = iterator.next();
          soma += next;
      }

      Iterator<Double> iterator1 = notas.iterator();
      while (iterator1.hasNext()){
          Double next = iterator1.next();
          if (next < 7){
              iterator1.remove();
          }
      }

      Set<Double> notas2 = new LinkedHashSet<>(); //mantem a ordem de inserção.
      notas2.add(8.0);
      notas2.add(8.8);
      notas2.add(5.0);

      Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

    }


}
