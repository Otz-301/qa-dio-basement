// A pessoa tem uma saudação especifica ("Meu nome é").

    // Subclass Pessoa
        public class SubclassPessoa extends Ser {
        String sobrenome;

        // Metodo para configurar o sobrenome
            void setSobrenome(String sobrenome) {
                this.sobrenome = sobrenome;

        // Sobreescrevendo o metodo saudacao
               @Override
                String saudacao() {
                {
                   return "Meu nome é " + nome + " Ronaldo" + sobrenome + " Nazario";
                }
            }
}