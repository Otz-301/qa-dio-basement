// Objetivo: Criar uma classe CalculadoraAvançada com
// metodos sobrecarregados para calcular soma de
// diferentes tipos de dados

public class CalculadoraAvancada{
    // Método1: soma de inteiros
    public int somar(int a, int b){
        return  a + b;
    }
    // Metodo 2 soma de doubles
        public double somar(double a, double b){
            return a + b;
        }
        public static void main(String[] args){
            CalculadoraAvancada calc = new CalculadoraAvancada();

            System.out.println("Soma de inteiros: " + calc.somar(5, 3));
                    // 8

            System.out.println("Soma de doubles:" + calc.somar(5.5, 3.3));
                        // 8.8
        }
}
