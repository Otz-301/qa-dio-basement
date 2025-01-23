
// Objetivo: Criar uma classe Calculadora com metodos estaticos para operações matematicas.

    public class Calculadora{
    // Metodo estatico
            static int somar(int a, int b){
                return a + b;

            }
            // Metodo dinamico
        int multiplicar(int a, int b){
                return a * b;
        }
        public static voide main(String[] args){
                // Chamando método estático
            System.out.println("Soma: " + Calculadora.somar(5, 3));
                // Saida: 8

            // Chamado metodo dinamico
            Calculadora calc = new Calculadora();
            System.out.println("Multiplicação:" + calc.multiplicar(5, 3));
                    // Saida 15
        }
    }