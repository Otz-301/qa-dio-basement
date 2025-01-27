

public class Zoologico {
    public static void main(String [] args){
        Animal[] animals = {
                new Mamifero(),
                new Ave(),
                new Animal() {
                    @Override
                    public void emitirSom() {

                    }
                }
        };

        for (Animal animal : animals){
            animal.emitirSom();
        }
    }
}