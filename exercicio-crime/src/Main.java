
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("----------- Responda S ou N -------------");
        System.out.println("1. Telefonou para a vítima? ");
        respostas.add(scanner.next());
        System.out.println("2. Esteve no local do crime? ");
        respostas.add(scanner.next());
        System.out.println("3. Mora perto da vítima? ");
        respostas.add(scanner.next());
        System.out.println("4. Devia para a vítima? ");
        respostas.add(scanner.next());
        System.out.println("5. Já trabalhou com a vítima? ");
        respostas.add(scanner.next());

        Iterator<String> iterator = respostas.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equalsIgnoreCase("n")){
                iterator.remove();
            }
        }

        System.out.print("Você respondeu " + respostas.size() + " sim e é considerada: ");

        if (respostas.size() == 2){
            System.out.println("Suspeita");
        } else if (respostas.size() == 3 || respostas.size() == 4){
            System.out.println("Cúmplice");
        } else if (respostas.size() == 5) {
            System.out.println("Assassina");
        } else if (respostas.size() <=1 ) {
            System.out.println("Inocente");
        } else {
            System.out.println("Inválido, refaça o questionário");
        }




    }

}
