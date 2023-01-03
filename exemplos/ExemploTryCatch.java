import javax.swing.*;

public class ExemploTryCatch {

    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2, 8};

        for (int i = 0; i < denominador.length ; i++) {
            try {
                if(numerador[i]%2 != 0)
                    throw new DivisaoNaoExatadaException("Divisão não exata!", numerador[i], denominador[i]);
                    int resultado = numerador[i] / denominador[i];
                    System.out.println(resultado);
            } catch (DivisaoNaoExatadaException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Zero não pode ser o denominador.");
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "O índice do array encontra-se fora dos limites. limite: " + e.getMessage());
            }

            }

            System.out.println("O programa continua...");
        }

    }

    class DivisaoNaoExatadaException extends Exception{
        private int numerador;
        private int denominador;

        public DivisaoNaoExatadaException(String message, int numerador, int denominador) {
            super(message);
            this.denominador = denominador;
            this.numerador = numerador;
        }

    }


