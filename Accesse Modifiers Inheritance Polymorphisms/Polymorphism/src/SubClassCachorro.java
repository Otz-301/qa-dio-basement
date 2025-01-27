// O cachorro tem uma saudação especifica ("au au")
// e um atributo adicional chamado Dono

    // Subclass Cachorro
        public class SubClassCachorro extends Ser {
    String dono;

        // Metodo para configurar o dono
            void setDono(String dono) {
                this.dono = dono;
            }
        // Sobrescrevendo o meteodo saudacao
        @Override
        String saudacao() {
                return "Au au! Eu sou um cachorro. ";
        }
}