public class MainComplexObjectsTest {
    @Test
        public void testIsAdultTrue(){
            Person person = new Person("João", 20);
                // Cria uma pessoa com 20 anos
            assertTrue(person.isAdult("João should be an adul");
    }
    }
        @Test
            puvli void testIsAdultFalse(){
                Person person = new Person("Joana", 17);
                    // Cria uma pessoa com 17 anos
                        assertFalse(person.isAdult(),"Joana should not be an adult");
}