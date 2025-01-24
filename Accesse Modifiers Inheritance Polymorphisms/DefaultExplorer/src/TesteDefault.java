// TesteDefault.java

import pacote1.ClassB;
        import pacote2.ClassC;

                public class TesteDefault {
    public static void main(String[] args){
        System.out.println("=== Testando ClassB ===");
        ClassB classB = new ClassB();
        classB.testarAcesso();
            System.out.println("\\n=== Testando ClassC ===");
                ClassC classC = new ClassC();
                    classC.testarAcesso();
    }

}