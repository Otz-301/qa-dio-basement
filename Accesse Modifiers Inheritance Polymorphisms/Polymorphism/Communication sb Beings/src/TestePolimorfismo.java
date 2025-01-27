public class TestePolimorfismo {
    public static void main(String[] args) {
        Ser[] seres = { new Cachorro(), new Pessoa()
        };
        for (Ser ser : seres) {
            System.out.println(ser.saudacao());
        }
    }
}
