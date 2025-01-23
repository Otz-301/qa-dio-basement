// Objetivo: Criar uma classe Carro com atributos e
// metodos para simular um carro simples

        public class carro{
            String marca;
            String modelo;
            int velocidadeAtual;

            // Metodo para acelerar
                void acelerar(){
                    velocidadeAtual += 10;
                }
                // Metodo para frear
                    void frear(){
                    velocidadeAtual / = 2;
                    }

                    public static void main(String[] args){
                    carro meuCarro = new Carro();
                    meuCarro.marca= "Toyota";
                    meuCarro.modelo = "Corolla";
                    meuCarro.velocidadeAtual= 50;

                    meuCarro.acelerar();
                    System.out.println("Velocidade atual:" + meuCarro.velocidadeAtual);
                        // Saida: 60

                        meuCarro.frear();
                        System.out.println("Velocidade atual: " + meuCarro.velocidadeAtual);
                            // Saida:30
                    }
        }
