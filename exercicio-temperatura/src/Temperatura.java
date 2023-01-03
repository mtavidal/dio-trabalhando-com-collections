import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        for (int i=0; i<6; i++) {
            System.out.println("Digite a temperatura média do " + (i + 1) + " mês:");
            double temperatura = Double.parseDouble(scanner.next());
            temperaturas.add(temperatura);
        }

        Iterator<Double> iterator = temperaturas.iterator();
        Double somaTemperatura = 0.0;
        while (iterator.hasNext()){
            double next = iterator.next();
            somaTemperatura+=next;
        }
        double media = somaTemperatura/temperaturas.size();
        System.out.println("Lista de temperaturas: " + temperaturas);
        System.out.println("A média de temperatura é: ");
        System.out.printf( "%.1f", media);
        System.out.println("   ");

        List<String> maioresTemp = new ArrayList<>();

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media){
                if (i == 0){
                    maioresTemp.add("1 - Janeiro");
                }
                if (i == 1){
                    maioresTemp.add("2 - Fevereiro");
                }
                if (i == 2){
                    maioresTemp.add("3- Marco");
                }
                if (i == 3){
                    maioresTemp.add("4 - Abril");
                }
                if (i == 4){
                    maioresTemp.add("5 - Maio");
                }
                if (i == 5){
                    maioresTemp.add("6- Junho");
                }

            }
        }

        System.out.println("Meses com temperaturas acima da média: " + maioresTemp);







    }

}
