import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tesst {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0);

//        List<Integer> list = Arrays.asList(0,0,0,1,0,0);
        System.out.println(jumpingOnClouds(list));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        List<Integer> zeros = new LinkedList<>();

        for (int i = 0; i < c.size(); i++) {
            if (c.get(i) == 0){
                zeros.add(i);
            }
        }

        boolean isSeguido = false;

        System.out.println(zeros);
        int removidoCont = 0;
        for (int i = 1; i < zeros.size(); i++) {
            if (zeros.get(i) - 1 == zeros.get(i-1)){
                if (isSeguido == true ){
                    System.out.println("Removeu: " + (zeros.get(i)));
                    isSeguido = false;
                    removidoCont++;
                } else {
                    isSeguido = true;
                }
            } else{
                isSeguido = false;
            }
        }
        System.out.println(zeros);
        return zeros.size() - removidoCont - 1;
    }

}

