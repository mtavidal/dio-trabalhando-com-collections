
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(6.0);
        notas.add(7.5);
        notas.add(7.4);
        notas.add(5.0);
        notas.add(1.4);
        notas.add(8.5);
        notas.add(9.0);
        System.out.println(notas);
        System.out.println(notas.indexOf(7.5));
        notas.add(4,8.0);
        System.out.println(notas);
        notas.set(notas.indexOf(7.5), 6.0);
        System.out.println(notas);
        System.out.println(notas.contains(9.0));
        System.out.println(notas.get(2));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);
        System.out.println(soma/notas.size());
        notas.remove(7.0);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next<7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);
        //notas.clear(); remove todos os elementos
        System.out.println(notas.isEmpty());

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.addAll(notas);
        System.out.println(notas2);
        System.out.println(notas2.getFirst());
        System.out.println(notas2);
        System.out.println(notas2.pollFirst());
        System.out.println(notas2);
    }
}
