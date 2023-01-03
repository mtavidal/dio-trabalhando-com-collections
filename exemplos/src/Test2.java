import com.sun.deploy.util.StringUtils;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Test2 {

    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        int cont1 = 0;
        int cont2 = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
               cont1++;
           }
        }
        System.out.println(cont1);


        long totalA1 = (n / s.length()) * cont1;

        long mod = n % s.length();

        for (int j = 0; j < mod; j++) {
            if (s.charAt(j) == 'a'){
                cont2++;
            }
        }
        System.out.println(cont2);

        System.out.println(totalA1+cont2);


//        int cont = 0;
//        for (int k = 0; k < s.length(); k++) {
//            if (s.charAt(k) == 'a'){
//                cont++;
//                if (cont == s.length()){
//                    System.out.println(n);
//                }
//            }
//        }

//        long total = (n/s.length() +1);


//

    }

    }

