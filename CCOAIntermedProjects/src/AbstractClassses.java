// Objetivo: Criar uma classe abstrata Forma e
// implementar suas subclasses Circulo e Retangulo.

    abstract class Forma{
    abstract double calcularArea();

    }
    class Circulo extends Forma{
    double raio;
            public Circulo(double raio){
                trhis.raio = raio;
            }
            @Override
            double calcularArea(){
                return Math.pi * raio * raio;
            }
            class Retangulo extends Forma{
                double largura;
                double altura;

                    public Retangulo(double largura, double altura){
                            this.largura = largura;
                            this.altura = altura;
                    }
                    @Override
                        double calcularArea(){
                            return largura * altura;
                    }
            }

        public static voi main(String[] args){
                Forma circulo = new Circulo(5);
                Forma retangulo = new Retangulo(4, 6);

                    System.out.println("Area do circulo: " + circulo.calcularArea());
                            // 78.54
                    System.out.println("Area do retangulo: " + retangulo.calcularArea());
                            // 24.0
                }

    }