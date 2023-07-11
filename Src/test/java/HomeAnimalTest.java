import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeAnimalTest {

    HomeAnimal animal;
    @BeforeEach
    void setUp() {
        animal = new HomeAnimal("Cat", "Matroskin", 4, true);
    }

    @AfterEach
    void afterSetUp(){
        animal = null;
    }

    @Test
    void testGetAnimalTypeMethod() {
        //HomeAnimal animal = new HomeAnimal("Cat", "Matroskin", 4, true);
        assertEquals("Cat", animal.getAnimalType());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Cat", "Dog", "Mouse"})
    @NullSource
    void testGetAnimalTypesMethod(String animalType) {
        //HomeAnimal animal = new HomeAnimal("Cat", "Matroskin", 4, true);
        animal.setAnimalType(animalType);
        assertEquals(animalType, animal.getAnimalType());
    }
    @Test
    void setAnimalType() {
        //HomeAnimal animal = new HomeAnimal("Cat", "Matroskin", 4, true);
        animal.setAnimalType("SuperCat");
        assertEquals("SuperCat", animal.getAnimalType());
    }


    @Test
    void getBark() {
        //HomeAnimal animal = new HomeAnimal("Cat", "Matroskin", 4, true);
        assertEquals("Matroskin", animal.getBark());
    }

    @Test
    void setBarkWIthEmptyName() {
        HomeAnimal setAnimal = new HomeAnimal("Cat", "", 4, true);
        setAnimal.setBark("Murchik");
        assertEquals("Murchik", setAnimal.getBark());
    }

    @Test
    void setBarkWIthNoEmptyName() {
        animal.setBark("Murchik");
        assertEquals("Matroskin", animal.getBark());
    }
    @Test
    void getAge() {
        assertEquals(4, animal.getAge());
    }

    @Test
    void setAge() {
        animal.setAge(3);
        assertEquals(3, animal.getAge());
    }

    @Test
    void isSexTrue() {
        //HomeAnimal animal = new HomeAnimal("Cat", "Matroskin", 4, true);
        assertTrue(animal.isSex());
    }

    @Test
    void isSexFalse() {
        HomeAnimal femaleAnimal = new HomeAnimal("Cat", "Murka", 4, false);
        assertFalse(femaleAnimal.isSex());
    }
    @Test
    void setSex() {
        //HomeAnimal animal = new HomeAnimal("Cat", "Murka", 4, true);
        animal.setSex(false);
        assertFalse(animal.isSex());
    }
}