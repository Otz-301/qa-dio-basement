public class main{
    // Método que altera o valor do atributo
    Void declara nome(){
            nome = "Fernanda";
    }
        // Método que retorna o valor do atributo
                String getNome(){
                    return nome;
                }
        // Entenda: A classe main tem um atributo (nome) e dois métodos (declaraNome) e (getNome)
        // É como um plano para criar objetos que terão esses comportamentos e caracteristicas
}

public class MainCCO {
}

// Um objeto: é uma instancia de uma classe, ou seja, uma cópia funcional que podemos usar no programa
        public  class Main{
        String nome;
            void declaraNoma(){
                nome = "Fernanda";
            }
            String getNome()
}
        public static void main (String[] args){
            // Criando um objeto da calsse Main
                meuObjeto = new Main();

                        // Chamando os metodos do objeto
                            meu Objeto.declaraNome();
                                System.out.printLn(meuObjeto.getNome());
                                        // Saida: Fernanda
        }

        // Um construtor: é um metodo especial usado para inicializar objetos. Ele tem o mesmo nome da classe e não possui retorno.
                public class main {String nome;
        //Construtor da classe
                public Main(String nomeInicial){
                    nome= nomeInicial;
                    // Inicializando o atributo
                }

                public static void main(String[] args){
                    // Criando um objeto e passando um valor para o construtor
                        Main meuObjeto = new Main("Fernanda");
                        System.out.printLn(meuObjeto.nome);
                        // Saida: Fernanda
                }

                // Métodos estáticos vs Métodos dinamicos
                // Metodo estático: Pertence a classe não a um objeto.
                // Chamado diretamente pelo nome classe
                // Util para funções que não dependem de atributos de instancia
                // Exemplo:
                public class main{
                    static String saudacao = "Olá"

                            // Método estático
                                static void imprimirSaudacao(){
                                System.out.println(saudacao);
                                }
                                    public static void main (string[]args){
                        // Chamando método estático
                                        Main.imprimirSaudacao();
                                            // Saida: Olá!

                                        // Metodo Dinamico: Pertence ao objeto, ou seja, depende de uma instancia da classe
                                            // Precisa ser chamado por meio de um objeto
                                        public class Main{
                                            String nome;
                                            // Método dinamico
                                            void setNome(String novoNome){
                                                nome = novoNome
                                            }
                                            String getNome()
                                        }
                                            return; nome;
                                    }

                                            public static void main(String[] args){
                                                // Criando um objeto
                                                    Main meuObjeto = new Main();

                                                    // Chamando metodos dinamicos
                                                        meuObjeto.setNome("Fernanda");
                                                            System.out.println(meuObjeto.getNome());
                                                                // Saida: Fernanda
                                            }


                }
}

